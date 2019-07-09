package com.jubayir;

import android.app.Dialog;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;
import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {
    private Button openDatePickerBtn, openTimePickerBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        openDatePickerBtn = findViewById(R.id.openDatePicker);
        openTimePickerBtn = findViewById(R.id.openTimePicker);
        
        openDatePickerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDatePicker();
            }
        });
        
        openTimePickerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTime();
            }
        });
    }

    private void openTime() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this); // one
        View view = getLayoutInflater().inflate(R.layout.custom_time_picker, null); // Layout add korar jonno ei process use korte hoi (one)
        Button done = view.findViewById(R.id.doneBtn); // two
        final TimePicker timePicker = view.findViewById(R.id.timepicker); // two

        builder.setView(view);

        final Dialog dialog = builder.create(); // one
        dialog.show(); // one

        done.setOnClickListener(new View.OnClickListener() {  // three
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm aa"); // four time formate thik korar jonno

                int hour = timePicker.getHour(); // three
                int min = timePicker.getMinute(); // three

                Time time = new Time(hour, min, 0); // three

                openTimePickerBtn.setText(timeFormat.format(time)); // five
                dialog.dismiss(); // five
            }
        });
    }

    private void openDatePicker() {
    }
}
