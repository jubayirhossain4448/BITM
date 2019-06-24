package morshed.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<User> userList;
    private RecyclerView recyclerView;
    private EditText name, phone, email;
    private Button save;
    private UserAdapter customadapter;
    private String aName, aPhone, aEmail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        initRecyclerView();

        setData();

    }

    private void setData() {
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                aName = name.getText().toString();
                aPhone = phone.getText().toString();
                aEmail = email.getText().toString();

                userList.add(new User(aName,aPhone,aEmail));


                customadapter.notifyDataSetChanged();

            }
        });
    }

    private void initRecyclerView() {
       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       recyclerView.setAdapter(customadapter);

    }

    private void init() {
        userList = new ArrayList<User>();
        recyclerView = findViewById(R.id.recyclerView);
        name = findViewById(R.id.nameET);
        phone = findViewById(R.id.phoneET);
        email = findViewById(R.id.emailET);
        save = findViewById(R.id.savebtn);
        customadapter = new UserAdapter(userList,this);


    }
}
