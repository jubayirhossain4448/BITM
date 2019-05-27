package jubayir.com.profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText Amount=findViewById(R.id.AmountEt);
        RadioButton TakaToDoller=findViewById(R.id.Rbttod);
        RadioButton DollerToTaka=findViewById(R.id.Rbdtot);
        Button Convater=findViewById(R.id.Convater);
        TextView Text=findViewById(R.id.Tv);


    }
}
