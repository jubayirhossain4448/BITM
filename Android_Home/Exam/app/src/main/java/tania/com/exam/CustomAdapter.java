package tania.com.exam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private List<Movie> movies;

    public CustomAdapter(List<Movie> movies, MainActivity mainActivity) {
        this.movies = movies;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclearview_movie_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Movie movie = movies.get(position);

        holder.movieNameTV.setText(movie.getMovieName());
        holder.directorNameTV.setText(movie.getDirectorName());

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView imageTV, movieNameTV, directorNameTV;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageTV = itemView.findViewById(R.id.imageTV);
            movieNameTV = itemView.findViewById(R.id.movieNameTV);
            directorNameTV = itemView.findViewById(R.id.directorNameTV);
        }
    }
}

