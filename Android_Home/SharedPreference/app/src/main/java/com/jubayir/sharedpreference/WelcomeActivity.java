package com.jubayir.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    private TextView nameTV, emailTV;
    private SharedPreferences preferences;
    private String name, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        nameTV = findViewById(R.id.nameTV);
        emailTV = findViewById(R.id.emailTV);

        preferences = getSharedPreferences("login", MODE_PRIVATE);
        name = preferences.getString("name", null);
        email = preferences.getString("email", null);
        nameTV.setText(name);
        emailTV.setText(email);
    }
}
