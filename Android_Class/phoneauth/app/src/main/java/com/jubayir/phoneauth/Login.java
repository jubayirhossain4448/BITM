package com.jubayir.phoneauth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class Login extends AppCompatActivity {

    EditText numberET;
    Button nextNumberBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        init();

        nextNumberBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number = numberET.getText().toString();

                startActivity(new Intent(Login.this,signup.class).putExtra("number",number));



            }
        });








    }

    private void init() {

        numberET= findViewById(R.id.numberEtId);
        nextNumberBtn= findViewById(R.id.nextBtnId);

    }
}
