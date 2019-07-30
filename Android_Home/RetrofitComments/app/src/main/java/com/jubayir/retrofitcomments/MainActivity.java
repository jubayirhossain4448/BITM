package com.jubayir.retrofitcomments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.jubayir.retrofitcomments.retrofit.RetrofitInterface;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private UserAdapter adapter;
    private List<User> users;
    private RetrofitInterface retrofitInterface;
    private Button insertBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        init();

        initRecyclearView();
    }

    private void initRecyclearView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void init() {
        recyclerView = findViewById(R.id.recyclearView);
        users = new ArrayList<>();
    }
}
