package com.jubayir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstName, lastName, emailEt, passwordEt;
    private AutoCompleteTextView bloodGroupAC;
    private RadioButton maleRB, femaleRB;
    private Button registerBtn;
    private TextView signInTV;
    private CheckBox termsAndCondition;
    private String[] bloodGroup = {"A+", "A-", "AB+", "AB-", "B+", "B-", "O+", "O-"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        emailEt = findViewById(R.id.emailEt);
        passwordEt = findViewById(R.id.passwordEt);
        bloodGroupAC = findViewById(R.id.bloodGroupACTV);
        maleRB = findViewById(R.id.maleRB);
        femaleRB = findViewById(R.id.femaleRB);
        registerBtn = findViewById(R.id.registerBtn);
        signInTV = findViewById(R.id.signInBtn);
        termsAndCondition = findViewById(R.id.termsCB);

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, bloodGroup);
        bloodGroupAC.setAdapter(adapter);  // array er data gulo adapter tar e set korar jonno
        bloodGroupAC.setThreshold(1);   // koi ta letter press korar por suggestion show korbe tar jonno ei code likte hoi

        termsAndCondition.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean check) {
                if (check == true) {
                    registerBtn.setVisibility(View.VISIBLE);
                } else if (check == false) {
                    registerBtn.setVisibility(View.GONE);
                }
            }
        });

    }
}
