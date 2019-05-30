package com.jubayir;

import android.content.Intent;
import android.drm.DrmStore;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mobileNumberET;
    private Button callingBtn;
    private String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mobileNumberET = findViewById(R.id.mobileNoET);
        callingBtn = findViewById(R.id.callingBtn);

        callingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number = mobileNumberET.getText().toString().trim();
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + number));
                startActivity(intent);
            }
        });
    }
}
