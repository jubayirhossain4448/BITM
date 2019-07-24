package com.jubayir.phoneauth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class signup extends AppCompatActivity {

    private EditText codeEt;
    private Button verifyBtn;
    private FirebaseAuth firebaseAuth;
    private String phnnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        init();

        codeEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                sentOTP();



            }
        });


        }

    private void sentOTP() {



        PhoneAuthProvider.getInstance().verifyPhoneNumber(
               "+88"+phnnumber,        // Phone number to verify
                60,                 // Timeout duration
                TimeUnit.SECONDS,   // Unit of timeout
                this,               // Activity (for callback binding)
                mCallbacks);        // OnVerificationStateChangedCallbacksPhoneAuthActivity.java
    }

    PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks= new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
        @Override
        public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {



        }

        @Override
        public void onVerificationFailed(FirebaseException e) {

            Toast.makeText(signup.this, e.getMessage(), Toast.LENGTH_SHORT).show();


        }
    };


    private void init() {

        firebaseAuth=FirebaseAuth.getInstance();

        codeEt=findViewById(R.id.codeEtId);
        verifyBtn=findViewById(R.id.verifyBtnId);
    }

    ;





}
