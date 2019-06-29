package tania.com.exam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Movie> movieList;
    private TextView ImageTV, movieNameTV, directorNameTV;
    private String aImageTV, aMovieNameTV, aDirectorNameTV;

    private RecyclerView recyclerView;
    private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        initRecyclearview();
        setData();

    }

    private void setData() {

        aMovieNameTV = movieNameTV.getText().toString();
        aDirectorNameTV = directorNameTV.getText().toString();

    }

    private void initRecyclearview() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    private void init() {

        movieList = new ArrayList<>();
        movieNameTV = findViewById(R.id.movieNameTV);
        directorNameTV = findViewById(R.id.directorNameTV);

        recyclerView = findViewById(R.id.recyclearView);
        adapter = new CustomAdapter(movieList, this);

    }

}





