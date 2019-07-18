package com.jubayir.firebaseauthentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPageActivity extends AppCompatActivity {

    private EditText phoneNoEt;
    private Button nextBtn;
    private String phoneNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        phoneNoEt = findViewById(R.id.phoneEt);
        nextBtn = findViewById(R.id.nextBtn);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phoneNo = phoneNoEt.getText().toString().trim();

                if(phoneNo.length() == 11){
                    Intent intent = new Intent(LoginPageActivity.this, VerifyActivity.class);
                    intent.putExtra("Phone", phoneNo);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(LoginPageActivity.this, "Invalid Phone Number", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
