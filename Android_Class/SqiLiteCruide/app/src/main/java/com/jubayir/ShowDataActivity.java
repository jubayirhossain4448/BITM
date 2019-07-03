package com.jubayir;

import android.database.Cursor;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ShowDataActivity extends AppCompatActivity {

    private DatabaseHelper helper;
    private List<User> users;
    private UserAdapter userAdapter;

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
    }

}
