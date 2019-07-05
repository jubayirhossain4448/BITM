package com.jubayir;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ShowDataActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdapter userAdapter;
    private List<User> users;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        init();

        Cursor cursor = databaseHelper.showData();
        while (cursor.moveToNext());

        int id = cursor.getInt(cursor.getColumnIndex(databaseHelper.COL_ID));
        String name = cursor.getString(cursor.getColumnIndex(databaseHelper.COL_NAME));
        String age = cursor.getString(cursor.getColumnIndex(databaseHelper.COL_AGE));


        users.add(new User(id, name, age));
        userAdapter.notifyDataSetChanged();
    }

    private void init() {

        recyclerView = findViewById(R.id.userRecyclearView);
        users = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        userAdapter = new UserAdapter(this, users);
        databaseHelper = new DatabaseHelper(this);
        recyclerView.setAdapter(userAdapter);
    }
}
