package com.jubayir.notification;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class SignupActivity extends AppCompatActivity {
    private EditText emailET, passwordET, nameET;
    private FirebaseAuth firebaseAuth;
    private DatabaseReference reference;
    private Button signUpBtn;
    private String email, password, name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        init();

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailET.getText().toString().trim();
                String password = passwordET.getText().toString().trim();
                String name = nameET.getText().toString().trim();

            }
        });
    }

    private void init() {
        emailET = findViewById(R.id.emailET);
        passwordET = findViewById(R.id.passwordET);
        nameET = findViewById(R.id.nameET);
        firebaseAuth = FirebaseAuth.getInstance();
        reference = FirebaseDatabase.getInstance().getReference();
    }

    public void signUp(final String email, final String password, final String name){
        firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    String userId = firebaseAuth.getCurrentUser().getUid();
                    DatabaseReference userRef = reference.child("users").child(userId);

                    HashMap<String, Object> userMap = new HashMap<>();
                    userMap.put("email", email);
                    userMap.put("password", password);
                    userMap.put("name", name);

                    userRef.setValue(userMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()){
                                startActivity(new Intent(SignupActivity.this, MainActivity.class));
                            }
                        }
                    });
                }else{
                    Toast.makeText(SignupActivity.this, "Something goes wrong!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
