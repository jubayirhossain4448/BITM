package jubayir.com.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    private EditText phonenoEt;
    private Button callBtn;
    private String phone;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phonenoEt = findViewById(R.id.phonenoET);
        callBtn = findViewById(R.id.callBtn);

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { 
                phone = phonenoEt.getText().toString().trim();
                getIntent().setData(Uri.parse("tel:" + phone));


        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_DIAL);
        intent.setData(Uri.parse(phone));
        startActivity(intent);
    }
}
