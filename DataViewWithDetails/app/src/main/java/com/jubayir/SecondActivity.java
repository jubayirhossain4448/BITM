package com.jubayir;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView movieNametextView;
    private TextView movieDirectortextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageView = findViewById(R.id.imageViewSecondActivity);
        movieNametextView = findViewById(R.id.movieNameSecondActivity);
        movieDirectortextView = findViewById(R.id.movieDirectorSecondActivity);


        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            int image = (int) bundle.get("mImage");
            String mName = bundle.getString("mName");

            String mDirector = bundle.getString("mDirector");


            movieNametextView.setText("MovieName: " + mName);
            movieDirectortextView.setText("       MovieDirector: " + mDirector);
            imageView.setImageResource(image);
        }
    }
}


