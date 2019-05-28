package com.example.moneyconveterown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText amountET;
    RadioButton dollerToTakaRB, takaToDollerRB;
    Button convertBtn;
    TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountET = findViewById(R.id.amountET);
        dollerToTakaRB = findViewById(R.id.dollerToTakaRB);
        takaToDollerRB = findViewById(R.id.takaToDollerRB);
        convertBtn = findViewById(R.id.convetBtn);
        resultTV = findViewById(R.id.resultTV);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amount = amountET.getText().toString();

                if (amount.equals("")) {
                    Toast.makeText(MainActivity.this, "Please Enter Your Amount", Toast.LENGTH_LONG).show();
                } else {
                    if (dollerToTakaRB.isChecked()) {
                        double result = Double.valueOf(amount) * 84;
                        resultTV.setText(String.valueOf(result));
                    } else if (takaToDollerRB.isChecked()) {
                        double result = Double.valueOf(amount) / 84;
                        resultTV.setText(String.valueOf(result));
                    }
                }
            }
        });
    }
}
