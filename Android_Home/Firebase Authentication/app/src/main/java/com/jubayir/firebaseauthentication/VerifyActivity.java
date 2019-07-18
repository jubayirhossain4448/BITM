package com.jubayir.firebaseauthentication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.concurrent.TimeUnit;

public class VerifyActivity extends AppCompatActivity {

    private EditText verificationEt;
    private Button loginBtn;
    private String phoneNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        verificationEt = findViewById(R.id.verificationEt);
        loginBtn = findViewById(R.id.loginBtn);

        phoneNo = getIntent().getStringExtra("Phone");
        
        sendOTP();
    }

    private void sendOTP() {

        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                "+88" +phoneNo,        // Phone number to verify
                60,                 // Timeout duration
                TimeUnit.SECONDS,   // Unit of timeout
                this,               // Activity (for callback binding)
                mCallbacks);        // OnVerificationStateChangedCallbacksPhoneAuthActivity.java
    }

}
