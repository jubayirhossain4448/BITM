package com.jubayir.database;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Resigister extends AppCompatActivity {



    private FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();


    EditText nameTv,emailTv,passwordTv;
    Button regBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resigister);

        nameTv=findViewById(R.id.nameRegTvId);
        emailTv=findViewById(R.id.emailRegTvId);
        passwordTv=findViewById(R.id.passRegTvId);
        regBtn=findViewById(R.id.RegBtnId);

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = nameTv.getText().toString();
                String email = emailTv.getText().toString();
                String password = passwordTv.getText().toString();

                login(email,password);


            }
        });


    }

    private void login(String email, String password) {

        firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()){



                }



            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Resigister.this, e.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
