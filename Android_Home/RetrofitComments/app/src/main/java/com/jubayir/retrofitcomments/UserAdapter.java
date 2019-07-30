package com.jubayir.retrofitcomments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private List<User> users;

    public UserAdapter(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.ViewHolder holder, int position) {
        User user = new User();

        holder.postIdTV.setText("postId " + String.valueOf(user.getPostId()));
        holder.idTV.setText("id " + String.valueOf(user.getId()));
        holder.nameTV.setText("name " + user.getName());
        holder.titleTV.setText("title " + user.getTitle());
        holder.bodyTV.setText("body " + user.getBody());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView postIdTV, idTV, nameTV, titleTV, bodyTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            postIdTV = itemView.findViewById(R.id.postIdTV);
            idTV = itemView.findViewById(R.id.idTV);
            nameTV = itemView.findViewById(R.id.nameTV);
            titleTV = itemView.findViewById(R.id.titleTV);
            bodyTV = itemView.findViewById(R.id.bodyTV);
        }
    }
}
