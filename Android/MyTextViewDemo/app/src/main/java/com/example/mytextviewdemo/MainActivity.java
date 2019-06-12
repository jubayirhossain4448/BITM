package com.example.mytextviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nameTxt;
    private TextView ageTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTxt = findViewById(R.id.nameTxt);
        ageTxt = findViewById(R.id.AGETxt);

        nameTxt.setText("MD. JUBAYIR HOSSAIN");
        ageTxt.setText("27 Years Old");
    }
}
