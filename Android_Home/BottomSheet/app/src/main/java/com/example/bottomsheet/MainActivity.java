package com.example.bottomsheet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button open;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        open = findViewById(R.id.openBottomSheetBtn);

        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DailyExpenseBottomSheet dailyExpenseBottomSheet = new DailyExpenseBottomSheet();
                dailyExpenseBottomSheet.show(getSupportFragmentManager(), "Daily Expenses");
            }
        });
    }
}
