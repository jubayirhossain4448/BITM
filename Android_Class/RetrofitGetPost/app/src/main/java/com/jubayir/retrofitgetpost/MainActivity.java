package com.jubayir.retrofitgetpost;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.jubayir.retrofitgetpost.retrofit.ApiClient;
import com.jubayir.retrofitgetpost.retrofit.RetrofitInterface;

import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private List<User> users;
    private RecyclerView recyclerView;
    private UserAdapter userAdapter;
    private RetrofitInterface retrofitInterface;
    private Button insertBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        init();
        
        initRecyclearView();

        getData();

        insertData();
    }

    private void insertData() {
        Call<ResponseBody> call = retrofitInterface.insertData(1, 10, "demoTitle", "body");
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Toast.makeText(MainActivity.this, "Successful" + response, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(MainActivity.this, "" + t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void getData() {
        retrofitInterface = ApiClient.getInstance().getApi();
        Call<List<User>> call = retrofitInterface.getUser();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                users = response.body();
                userAdapter = new UserAdapter(users);
                recyclerView.setAdapter(userAdapter);
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

            }
        });
    }

    private void initRecyclearView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void init() {
        users = new ArrayList<>();
        recyclerView = findViewById(R.id.userRecyclearView);


    }

    public void insertData(View view) {

    }
}
