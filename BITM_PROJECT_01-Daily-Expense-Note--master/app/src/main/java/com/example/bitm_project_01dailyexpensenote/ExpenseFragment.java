package com.example.bitm_project_01dailyexpensenote;


import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExpenseFragment extends Fragment {
    private DailyExpenseAdapter adapter;
    private List<Expense> expenseList;
    private RecyclerView recyclerView;
    private ExpenseDataOpenHelper helper;
    private FloatingActionButton floatingActionButton;


    public ExpenseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_expense, container, false);


        init(view);
        initRecyclerView(view);


        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ExpenseActivity.class));
            }
        });

        showexpense();

        return view;

    }

    private void showexpense() {
        Cursor cursor = helper.showExpenseData();
        while (cursor.moveToNext()) {

            int id = cursor.getInt(cursor.getColumnIndex(helper.COL_ID));
            String expenseName = cursor.getString(cursor.getColumnIndex(helper.COL_Type));
            int expenseAmount = cursor.getInt(cursor.getColumnIndex(helper.COL_AMOUNT));
            String date = cursor.getString(cursor.getColumnIndex(helper.COL_DATE));
            String time = cursor.getString(cursor.getColumnIndex(helper.COL_TIME));

            expenseList.add(new Expense(id, expenseName, Integer.parseInt(String.valueOf(expenseAmount)), date, time));
            adapter.notifyDataSetChanged();

        }
    }


    private void initRecyclerView(View view) {

        recyclerView = view.findViewById(R.id.ExpenserecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }

    private void init(View view) {

        expenseList = new ArrayList<>();
        adapter = new DailyExpenseAdapter(helper, expenseList, getContext());
        helper = new ExpenseDataOpenHelper(getContext());
        floatingActionButton = view.findViewById(R.id.floatingActionBtn);
    }

}
