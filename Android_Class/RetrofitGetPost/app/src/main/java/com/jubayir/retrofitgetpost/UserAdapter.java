package com.jubayir.retrofitgetpost;

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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.ViewHolder holder, int position) {
        User user = users.get(position);

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView userId, id, title, body;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userId = itemView.findViewById(R.id.userIdTV);
            id = itemView.findViewById(R.id.idTV);
            title = itemView.findViewById(R.id.titleTV);
            body = itemView.findViewById(R.id.bodyTV);
        }
    }
}
