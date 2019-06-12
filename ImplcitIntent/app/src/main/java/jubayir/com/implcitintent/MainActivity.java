package jubayir.com.implcitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mobileNumberEt;
    private Button callingBtn;
    private String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intent = new Intent();
        mobileNumberEt = findViewById(R.id.mobileNumberEt);
        callingBtn = findViewById(R.id.callingBtn);

        callingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = mobileNumberEt.getText().toString().trim();
                getIntent().setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });
    }
}
