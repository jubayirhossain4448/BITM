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
    private DatabaseHelper helper;

    private Context context;
    private List<User> users;

    public UserAdapter(Context context, List<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.reccyclear_view_user_list, parent,false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final User user = users.get(position);

        holder.name.setText(user.getName());
        holder.age.setText(user.getAge());

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                helper = new DatabaseHelper(context);
                helper.deleteData(user.getId());
                users.remove(position);
                notifyDataSetChanged();
                return false;
            }
        });

    }

    @Override
    public int getItemCount() {
        return users.size(); // user er size fixed korar jnno
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name, age, id;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.nameTV);
            age = itemView.findViewById(R.id.ageTV);
        }
    }
}
