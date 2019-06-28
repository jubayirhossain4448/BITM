package com.jubayir;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder> {

    private List<User> users;

    public CustomerAdapter(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclearview_user_list, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        User user = users.get(i);

        viewHolder.name.setText(user.getName());
        viewHolder.id.setText(user.getId());
        viewHolder.phoneNo.setText(user.getPhoneNo());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name, id, phoneNo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.nameTV);
            id = itemView.findViewById(R.id.idTV);
            phoneNo = itemView.findViewById(R.id.phoneTV);
        }
    }
}
