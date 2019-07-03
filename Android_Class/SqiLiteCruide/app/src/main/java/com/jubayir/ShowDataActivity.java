package com.jubayir;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ShowDataActivity extends AppCompatActivity {

    private TextView nameTV, ageTV;
    private DatabaseHelper helper;
    private List<User> users;
    private UserAdapter userAdapter;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();

        Cursor cursor = helper.showData();

        while (cursor.moveToNext()) {

            int id = cursor.getInt(cursor.getColumnIndex(helper.COL_ID));
            String name = cursor.getString(cursor.getColumnIndex(helper.COL_NAME));
            String age = cursor.getString(cursor.getColumnIndex(helper.COL_AGE));

            users.add(new User(id, name, age));
            userAdapter.notifyDataSetChanged();

        }
    }

    private void init() {
        recyclerView = findViewById(R.id.userRecyclearView);
        users = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        userAdapter = new UserAdapter(this, users);
        helper = new DatabaseHelper(ShowDataActivity.this);
        recyclerView.setAdapter(userAdapter);
    }

}
