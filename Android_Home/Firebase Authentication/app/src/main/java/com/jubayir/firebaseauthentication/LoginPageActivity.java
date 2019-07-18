package com.jubayir.firebaseauthentication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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

                if
            }
        });
    }
}
