package morshed.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {  // Main Method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        studentList = new ArrayList<>();                  // Object of studentList
        
        getData();                                        // User define method
    }

    private void getData() {                              // auto created method
    }
}
