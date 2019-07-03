package tania.com.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nameEt, age;
    private Button insertBTN;
    private String aName, aAge;
    private DataBaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        insertBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aName = nameEt.getText().toString();
                aAge = age.getText().toString();
                dataBaseHelper.insertData(aName, aAge);
//                Toast.makeText(MainActivity.this, "")
            }
        });
    }

    private void init() {
        nameEt = findViewById(R.id.nameET);
        age = findViewById(R.id.ageET);
        insertBTN = findViewById(R.id.insertBTN);
        dataBaseHelper = new DataBaseHelper(this);

    }

}
