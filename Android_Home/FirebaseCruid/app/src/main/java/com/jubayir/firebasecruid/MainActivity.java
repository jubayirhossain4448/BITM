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
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdapter adapter;
    private List<User> users;
    private EditText nameET, emailET, ageET, bloodGroupET;
    private Button addBtn;
    private String name, email, age, bloodGroup;
    
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
                String email = emailET.getText().toString();
                String age = ageET.getText().toString();
                String bloodGroup = bloodGroupET.getText().toString();

                addValueToDB(name, email, age, bloodGroup);
            }
        });
        
        getUsers();
    }

    private void getUsers() {
        DatabaseReference userRef = databaseReference.child("users");
        userRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
              if (dataSnapshot.exists()){
                  users.clear();
                  for (DataSnapshot data : dataSnapshot.getChildren()){
                      User user = data.getValue(User.class);
                      users.add(user);
                      adapter.notifyDataSetChanged();
                  }
              }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

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
        emailET = findViewById(R.id.emailET);
        ageET = findViewById(R.id.ageET);
        bloodGroupET = findViewById(R.id.bloodGroupET);
        addBtn = findViewById(R.id.addBtn);

        users = new ArrayList<>();

        recyclerView = findViewById(R.id.userRecyclearView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new UserAdapter(users);
        recyclerView.setAdapter(adapter);
    }
}
