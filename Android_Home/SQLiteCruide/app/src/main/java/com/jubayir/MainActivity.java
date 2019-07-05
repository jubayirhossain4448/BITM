package com.jubayir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /* 1.First activity_main.xml create korte hobe.
    2.Main Activity te id gulo initialize korte hobe.
    3. Button er Jonno ekta ShowDataActivity nite hobe.
    4. showDataActivity te SQLiteOpenHelper class e extends korte hobe.
    5. // Database and Field and Table create korte hobe.
    6. data insert er Jonno ekta class korte hobe
    7. insertData Method theke data nite hole main activity te ekta object create korte hobe
    8. insertBtn.setOnClickListner e method call korte hobe and Toast kore dekhate hobe
    9. RecyclearView Create korte hobe
    10. Pojo Class Create korte hobe
    11. recyclearview_user_list ekta activity nite hobe
    12. Ekta Adapter create korte hobe
    */

    private EditText nameET, ageET;
    private Button insertBtn, showDataBtn;
    private String name, age;
    // insertData Method theke data nite hole main activity te ekta object create korte hobe
    private DatabaseHelper helper;

    // Two

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        // Two

        insertBtn.setOnClickListener(new View.OnClickListener() { // button e click korle edit text er data nie string e rakthe hobe
            @Override
            public void onClick(View v) {
                name = nameET.getText().toString();
                age = ageET.getText().toString();
                long id = helper.insertData(name, age); // Method calling here
                Toast.makeText(MainActivity.this, "" +id, Toast.LENGTH_SHORT).show(); // Eight

// Three
            }
        });


        showDataBtn.setOnClickListener(new View.OnClickListener() { // main activity te click korle Show data activity te data jabe
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ShowDataActivity.class));
            }
        });
// Three
    }

    private void init() { // initialize er jonno
        // Two
        nameET = findViewById(R.id.nameET);
        ageET = findViewById(R.id.ageET);
        insertBtn = findViewById(R.id.insertBtn);
        showDataBtn = findViewById(R.id.showDataBtn);
        helper = new DatabaseHelper(this); // Database helper initialize korte hobe
        // Seven

    }
}
