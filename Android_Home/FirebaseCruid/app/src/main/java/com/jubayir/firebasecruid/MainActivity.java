package com.jubayir.firebasecruid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameET.getText().toString();
                String age = ageET.getText().toString();
                String email = emailET.getText().toString();
                String bloodGroup = bloodGroupET.getText().toString();

                addValueToDB(name, age, email, bloodGroup);
            }
        });
    }

    private void addValueToDB(String name, String age, String email, String bloodGroup) {
        DatabaseReference userRef = databaseReference.child("users");
        User user = new User(name, age, email, bloodGroup);
        userRef.push().setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() { // aut
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    Toast.makeText(MainActivity.this, "Data has been inserted", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void init() {
        databaseReference = FirebaseDatabase.getInstance().getReference();


        nameET = findViewById(R.id.nameET);
        ageET = findViewById(R.id.ageET);
        emailET = findViewById(R.id.emailET);
        bloodGroupET = findViewById(R.id.bloodGroupET);
        addBtn = findViewById(R.id.addBtn);

        users = new ArrayList<>();

        recyclerView = findViewById(R.id.userRecyclearView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new UserAdapter(users);
        recyclerView.setAdapter(adapter);
    }
}
