package tania.com.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nameEt, age;
    private Button insertBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        nameEt = findViewById(R.id.nameET);
        age = findViewById(R.id.ageET);
        insertBTN = findViewById(R.id.insertBTN);

    }

}
