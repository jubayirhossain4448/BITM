package morshed.com.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private List<User> userList;
    private Context context;

    public UserAdapter(List<User> userList, Context context) {
        this.userList = userList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View userList = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_user_layout,viewGroup,false);


        return new ViewHolder(userList);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        final User currentUser = userList.get(i);
        viewHolder.name.setText(currentUser.getName());
        viewHolder.phone.setText(currentUser.getPhone());
        viewHolder.email.setText(currentUser.getEmail());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,DetailActivity.class);
                intent.putExtra("name",currentUser.getName());
                intent.putExtra("phone", currentUser.getPhone());
                intent.putExtra("email",currentUser.getEmail());

                context.startActivity(intent);

               // Toast.makeText(context,"clicked",Toast.LENGTH_SHORT).show();

            }
        });



    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name, phone, email;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            phone  = itemView.findViewById(R.id.phone);
            email = itemView.findViewById(R.id.email);






        }
    }
}
