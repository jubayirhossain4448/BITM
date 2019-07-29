package com.jubayir.retrofitcomment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jubayir.retrofitcomment.retrofit.ApiClient;
import com.jubayir.retrofitcomment.retrofit.Retrofitinterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private UserAdapter adapter;
    private List<User> users;
    private Retrofitinterface retrofitinterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        getData();

        initRecyclearView();
    }

    private void initRecyclearView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getData() {
        retrofitinterface = ApiClient.getInstance().getApi();

        Call<List<User>> call = retrofitinterface.getData();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                users= response.body();
                adapter = new UserAdapter(users);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

            }
        });

    }

    private void init() {
        recyclerView = findViewById(R.id.recyclerViewId);
        users = new ArrayList<>();
    }
}
