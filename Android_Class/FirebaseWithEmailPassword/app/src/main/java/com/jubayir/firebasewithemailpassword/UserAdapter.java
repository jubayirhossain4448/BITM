package com.jubayir.firebasewithemailpassword;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private List<User> userList;
    private Context context;

    public UserAdapter(List<User> userList, Context context) {
        this.userList = userList;
        this.context = context;
    }

    public UserAdapter(ArrayList<User> userArrayList) {

    }

    @NonNull
    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View userList = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list_recyclearview, parent, false);
        return new ViewHolder(userList);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.ViewHolder holder, int i) {
        final User currentUser = userList.get(i);
        holder.name.setText(currentUser.getName());
        holder.email.setText(currentUser.getEmail());
        holder.age.setText(currentUser.getAge());
        holder.bloodGroup.setText(currentUser.getBloodGroup());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity.class);
                intent.putExtra("name", currentUser.getName());
                intent.putExtra("email", currentUser.getEmail());
                intent.putExtra("age", currentUser.getAge());
                intent.putExtra("bloodGroup", currentUser.getBloodGroup());

                context.startActivity(intent);

                Toast.makeText(context, "Data has been Added", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name, email, age, bloodGroup;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nameTV);
            email = itemView.findViewById(R.id.emailTV);
            age = itemView.findViewById(R.id.ageTV);
            bloodGroup = itemView.findViewById(R.id.bloodTV);
        }
    }
}
