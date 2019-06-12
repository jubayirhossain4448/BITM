package com.batch08.bitm.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private TextView textview;
    private EditText emailEt;
    private EditText passwordEt;
    private Button login;
    public final String EMAIl="mad@bitm.com";
    public final String PASS="12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        textview = findViewById(R.id.emailET);
        textview = findViewById(R.id.passwprdET);
        login = findViewById(R.id.loginbutton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email= emailEt.getText().toString();
                String pass= passwordEt.getText().toString();
                if(email.equals(EMAIl)&&pass.equals(PASS)){
                    System.out.println("success");
                }
                System.out.println("invalid");

            }


        }
}
}
