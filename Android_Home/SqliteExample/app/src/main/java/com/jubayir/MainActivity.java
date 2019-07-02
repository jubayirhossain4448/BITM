package com.jubayir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nameET, ageET;
    private String aName, aAge;
    private Button insertBTN;
    private DataBaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        insertBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                aName = nameET.getText().toString();
                aAge = ageET.getText().toString();
                dataBaseHelper.insertData(aName, aAge);
                long id = dataBaseHelper.insertData(aName, aAge);
                Toast.makeText(MainActivity.this, "Data Serial : " + id, Toast.LENGTH_SHORT).show();


            }
        });
    }

    private void init() {

        nameET = findViewById(R.id.nameET);
        ageET = findViewById(R.id.ageET);
        insertBTN = findViewById(R.id.insertBTN);
        dataBaseHelper = new DataBaseHelper(this);
    }
}
