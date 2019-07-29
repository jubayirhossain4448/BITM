package com.hafsa.retrofitgetpost;

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
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_userlist,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User user=users.get(position);

        holder.userIdTv.setText("UserId: "+String.valueOf(user.getUserId()));
        holder.idTv.setText("Id: "+String.valueOf(user.getId()));
        holder.titleTv.setText("Title: "+user.getTitle());
        holder.bodyTv.setText("Body: "+user.getBody());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView userIdTv,idTv,titleTv,bodyTv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            userIdTv=itemView.findViewById(R.id.userIdTV);
            idTv=itemView.findViewById(R.id.idTV);
            titleTv=itemView.findViewById(R.id.titleTV);
            bodyTv=itemView.findViewById(R.id.bodyTV);

        }
    }
}
