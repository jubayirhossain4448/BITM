package morshed.com.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private String bName, bPhone, bEmail;
    private TextView cName, cPhone, cEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
       bName = intent.getStringExtra("name");
       bPhone = intent.getStringExtra("phone");
       bEmail = intent.getStringExtra("email");

       cName.setText("name");
       cPhone.setText("phone");
       cEmail.setText("email");



    }
}
