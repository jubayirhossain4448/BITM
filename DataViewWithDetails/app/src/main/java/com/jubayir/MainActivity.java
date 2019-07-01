package com.jubayir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Movie> movie;
    private CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();
        initRecyclerView();

        setData();
    }

    private void initRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(customAdapter);
    }

    private void setData() {

        movie.add(new Movie("Titanic","Jhon Barde",R.drawable.picture2));
        movie.add(new Movie("Battle Field","Barden Karee",R.drawable.picture3));
        movie.add(new Movie("War-2050","Robrt Zemecks",R.drawable.picture4));
        movie.add(new Movie("Burfee","Asif Mostafiz",R.drawable.picture5));
        movie.add(new Movie("Titanic","Jhon Barde",R.drawable.picture2));
        movie.add(new Movie("Battle Field","Barden Karee",R.drawable.picture3));
        movie.add(new Movie("War-2050","Steven Speielberg",R.drawable.picture4));
        movie.add(new Movie("Django Unchained","Quentin Tarantino",R.drawable.picture5));

        customAdapter.notifyDataSetChanged();
    }

    private void init() {
        recyclerView = findViewById(R.id.recyclerViewId);
        movie = new ArrayList<>();
        customAdapter =new CustomAdapter(movie,this);
    }
}

