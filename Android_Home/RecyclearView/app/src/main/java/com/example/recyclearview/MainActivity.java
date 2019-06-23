package com.example.recyclearview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Student> studentList;
    private RecyclerView studentsRV;
    private StudentsAdapter studentsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        initRecyclerView();


        getData();


    }

    private void initRecyclerView() {
        studentsRV.setLayoutManager(new LinearLayoutManager(this));
        studentsRV.setAdapter(studentsAdapter);
    }

    private void init() {
        studentList = new ArrayList<>();
        studentsRV = findViewById(R.id.studentRV);

        studentsAdapter = new StudentsAdapter(studentList);


    }

    private void getData() {
        Student student1 = new Student("Md. Jubayir", "243751", "B.A", "Male", "jubayir@gmail.com", "0191871****");
        Student student2 = new Student("Md. Jubayir Hossain", "243751", "B.A", "Male", "jubayir@gmail.com", "0191871****");
        Student student3 = new Student("Md. Jubayir 1244149", "243751", "B.A", "Male", "jubayir@gmail.com", "0191871****");
        Student student4 = new Student("Md. Jubayir 243751", "243751", "B.A", "Male", "jubayir@gmail.com", "0191871****");
        Student student5 = new Student("Md. Jubayir Rahman", "243751", "B.A", "Male", "jubayir@gmail.com", "0191871****");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);


        studentsAdapter.notifyDataSetChanged();

    }
}
