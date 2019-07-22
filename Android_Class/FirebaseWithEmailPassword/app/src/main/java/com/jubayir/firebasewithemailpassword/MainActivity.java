package com.jubayir.firebasewithemailpassword;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<User> userArrayList;
    private UserAdapter userAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        init();
        
//        getData();
//
//        initRecyclearView();
    }

//    private void initRecyclearView() {
//    }

//    private void getData() {
//
//    }

    private void init() {
        userArrayList = new ArrayList<>();
        recyclerView = findViewById(R.id.userRecylearV);
        User user = new User("Jubayir", "jubayir@gmail.com", "28", "O+");
        User user1 = new User("Jubayir", "jubayir@gmail.com", "28", "O+");
        User user2 = new User("Jubayir", "jubayir@gmail.com", "28", "O+");
        User user3 = new User("Jubayir", "jubayir@gmail.com", "28", "O+");

        userAdapter = new UserAdapter(userArrayList);

        recyclerView.setAdapter(userAdapter);
    }
}
