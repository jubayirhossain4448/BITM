package com.hafsa.retrofitgetpost;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hafsa.retrofitgetpost.retrofit.ApiClient;
import com.hafsa.retrofitgetpost.retrofit.Retrofitinterface;

import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private UserAdapter adapter;
    private List<User> users;
    private Button insertBtn;
    private Retrofitinterface retrofitinterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initRecyclerView();
        getData();
        insertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<ResponseBody> call=retrofitinterface.insertData(1,2,"title","body");
                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        Toast.makeText(MainActivity.this, "Succesfullll", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {

                    }
                });
            }
        });

    }



    private void initRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getData() {
        retrofitinterface= ApiClient.getInstance().getApi();
        Call<List<User>> call=retrofitinterface.getData();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                users=response.body();
                adapter=new UserAdapter(users);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

                Toast.makeText(MainActivity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void init() {
        insertBtn=findViewById(R.id.insertBtn);
        recyclerView=findViewById(R.id.recyclerViewId);
        users=new ArrayList<>();

    }
}
