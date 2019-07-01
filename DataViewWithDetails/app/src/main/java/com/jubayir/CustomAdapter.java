package com.jubayir;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private ArrayList<Movie> movie;
    private Context context;

    public CustomAdapter(ArrayList<Movie> movie, Context context) {
        this.movie = movie;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_show,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {

        final Movie currentMovie = movie.get(position);

        holder.movieName.setText(currentMovie.getMovieName());
        holder.movieDirector.setText(currentMovie.getMovieDirector());
        holder.imageView.setImageResource(currentMovie.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,SecondActivity.class);
                intent.putExtra("mName",currentMovie.getMovieName());
                intent.putExtra("mDirector",currentMovie.getMovieDirector());
                intent.putExtra("mImage",currentMovie.getImage());
                ContextCompat.startActivity(context,intent,null);
            }
        });

    }

    @Override
    public int getItemCount() {
        return movie.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView movieName,movieDirector;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageViewId);
            movieName = itemView.findViewById(R.id.movieNameId);
            movieDirector=itemView.findViewById(R.id.movieDirectorId);
        }
    }
}

