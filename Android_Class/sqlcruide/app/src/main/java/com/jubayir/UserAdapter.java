package com.jubayir;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    /* ViewHolder onCrateViewHolder e r
     */
    private Context context;
    private List<User> users;
    private DatabaseHelper databaseHelper;

    public UserAdapter(Context context, List<User> users) {
        this.context = context;
        this.users = users;
    }

    private ViewHolder holder;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclearview_user_list,viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        User user = users.get(i);

        holder.name.setText(user.getName());
        holder.age.setText(user.getAge());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name, age;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.nameTV);
            age = itemView.findViewById(R.id.ageTV);
        }
    }
}
