package com.jubayir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nameET, ageET;
    private Button insertBTN, showDetailsBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        insertBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void init() {

        nameET = findViewById(R.id.nameET);
        ageET = findViewById(R.id.ageET);
        insertBTN = findViewById(R.id.insertBTN);
        showDetailsBTN =findViewById(R.id.showDetailsBTN);
    }
}
