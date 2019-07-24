package com.jubayir.firebasedetails;

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
    private EditText nameET, classET, secET, rollEt;
    private RecyclerView recyclerView;
    private UserAdapter adapter;
    private List<User> userList;
    private Button addBtn;
    private String name, bClass, sec, roll;
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
               String bClass = classET.getText().toString();
               String sec = secET.getText().toString();
               String roll = rollEt.getText().toString();

                addValueToDB(name, bClass, sec, roll);
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
                    userList.clear();
                    for (DataSnapshot data : dataSnapshot.getChildren()){
                        User user = data.getValue(User.class);
                        userList.add(user);
                        adapter.notifyDataSetChanged();
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void addValueToDB(String name, String bClass, String sec, String roll) {
        DatabaseReference userRef = databaseReference.child("users");

        User user = new User(name, bClass, sec, roll);
        userRef.push().setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    Toast.makeText(MainActivity.this, "Data has been inserted", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Data has been cancelled", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void init() {
        databaseReference = FirebaseDatabase.getInstance().getReference();

        nameET = findViewById(R.id.nameET);
        classET = findViewById(R.id.classET);
        secET = findViewById(R.id.secET);
        rollEt = findViewById(R.id.rollET);

        addBtn = findViewById(R.id.addBtn);

        userList = new ArrayList<>();
        recyclerView = findViewById(R.id.userRecyclearView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new UserAdapter(userList);
        recyclerView.setAdapter(adapter);


    }
}
