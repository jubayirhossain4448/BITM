package jubayir.com.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText firstNameET, lastNameET, emailET, passwordET;
    private AutoCompleteTextView bloodGroupAC;
    private RadioButton maleRB, femaleRB;
    private Button registerBtn;
    private TextView signInTv;
    private CheckBox termsAndCondition;
    private String [] bloodGroup = {"A+", "A-", "AB+", "B+", "B-", "AB-", "O+", "O-"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNameET = findViewById(R.id.firstNameET);
        lastNameET = findViewById(R.id.lastNameET);
        emailET = findViewById(R.id.emailET);
        passwordET = findViewById(R.id.passwordET);
        bloodGroup = findViewById(R.id.bloodGroupACTV);
        maleRB = findViewById(R.id.maleRB);
        femaleRB = findViewById(R.id.femaleRB);
        registerBtn = findViewById(R.id.registerBtn);
        //signInTv = findViewById(R.id.signInBtn);
        //termsAndCondition = findViewById(R.id.termaCB);

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this.R.layout.support.bloodGroup);
        bloodGroupAC.setAdapter(adapter);
        bloodGroupAC.setThreshold(1);

        termsAndCondition.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (){

                }
            }
        });
    }
}
