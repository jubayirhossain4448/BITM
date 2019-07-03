package com.jubayir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText nameET, ageET;
    private String aName, aAge;
    private Button insertBTN, showDetailsBTN;
    private DatabaseHelper databaseHelper;
    private UserAdapter adapter;
    private RecyclerView recyclerView;

    private List<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        initRecyclearView();


        insertBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aName = nameET.getText().toString();
                aAge = ageET.getText().toString();
                databaseHelper.insertData(aName, aAge);
                long id = databaseHelper.insertData(aName, aAge);
                Toast.makeText(MainActivity.this, "Data Serial : " + id, Toast.LENGTH_SHORT).show();

            }
        });

        showDetailsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void initRecyclearView() {

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void init() {
        userList = new ArrayList<>();

        nameET = findViewById(R.id.nameET);
        ageET = findViewById(R.id.ageET);
        insertBTN = findViewById(R.id.insertBTN);
        showDetailsBTN = findViewById(R.id.showDetailsBTN);
    }
}
