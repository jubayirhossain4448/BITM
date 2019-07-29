package com.jubayir.sharepreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nameET, emailET;
    private String name, email;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameET = findViewById(R.id.nameET);
        emailET = findViewById(R.id.emailET);
    }

    public void Login(View view) {
        name = nameET.getText().toString();
        email = emailET.getText().toString();
        sharedPreferences = getSharedPreferences("login", MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("name", name);
        editor.putString("email", email);
        editor.apply();

        startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
    }
}
