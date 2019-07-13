package com.example.bitm_project_01dailyexpensenote;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.List;

public class ExpenseActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    private EditText expenseAmount, expenseDate, expenseTime;
    private ImageButton date, time;
    private Button addExp;
    private String type, amount, eDate, eTime;
    private ExpenseDataOpenHelper helper;
    private DailyExpenseAdapter adapter;
    private List<Expense> expenseList;
    private Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense);
        setTitle("Add Expense");


        init();
        initSpinner();
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(), "From Date");

            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment timePicker = new TimePickerFragment();
                timePicker.show(getSupportFragmentManager(), "time picker");

            }
        });
        addExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                type = expenseAmount.getText().toString();
                amount = expenseAmount.getText().toString();
                eDate = expenseDate.getText().toString();
                eTime = expenseTime.getText().toString();
                helper.insertExpenseData(type, Integer.parseInt(String.valueOf(amount)), eDate, eTime);


                startActivity(new Intent(ExpenseActivity.this, ExpenseFragment.class));


            }
        });


    }

    private void initSpinner() {
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.expensetype, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    private void init() {
        expenseDate = findViewById(R.id.expenseDate);
        date = findViewById(R.id.date);
        time = findViewById(R.id.timeIV);
        expenseTime = findViewById(R.id.timeET);
        expenseAmount = findViewById(R.id.expenseAET);
        addExp = findViewById(R.id.addExpenseBtn);
        helper = new ExpenseDataOpenHelper(this);
        adapter = new DailyExpenseAdapter(helper, expenseList, this);

    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        expenseDate.setText(currentDateString);

    }

    @Override
    public void onTimeSet(TimePicker timePicker, int hour, int minute) {

        expenseTime.setText("Hours :" + hour + "  Minutes: " + minute);


    }
}
