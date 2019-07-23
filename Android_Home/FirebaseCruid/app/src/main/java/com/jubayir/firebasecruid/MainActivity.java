package com.jubayir.firebasecruid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdapter adapter;
    private List<User> users;
    private EditText nameET, ageET, emailET, bloodGroupET;
    private Button addBtn;
    private String name, age, email, bloodGroup;
    
    private DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        init();
    }

    private void init() {

        nameET = findViewById(R.id.nameET);
        ageET = findViewById(R.id.ageET);
        emailET = findViewById(R.id.emailET);
        bloodGroupET = findViewById(R.id.bloodGroupET);

        users = new ArrayList<>();

        recyclerView = findViewById(R.id.userRecyclearView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new UserAdapter(users);
        recyclerView.setAdapter(adapter);
    }
}
