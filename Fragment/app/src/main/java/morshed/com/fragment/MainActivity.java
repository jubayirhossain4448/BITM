package morshed.com.fragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private Button fragmentBtnOne, fragmentBtnTwo;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        fragmentBtnOne = findViewById(R.id.fragmentOneBtn);
        fragmentBtnTwo = findViewById(R.id.fragmentTwoBtn);

        fragmentBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fm = getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.frameLayout, new OneFragment());
                fm.commit();
            }
        });
        fragmentBtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.frameLayout, new OneFragment());
                ft.commit();
            }
        });
    }

}
