import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jubayir.recyclerviewsignup.R;

import java.util.List;

public class custom_adapter extends RecyclerView.Adapter<custom_adapter.ViewHolder> {
    private List<User>users;
    public custom_adapter(List<User>users){
        this.users=users;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview,parent,false);
   ViewHolder viewHolder= new ViewHolder(view);
   return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       User user= users.get(position);


    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name,email,age,bloodgroup;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.nameET);
            email=itemView.findViewById(R.id.emailET);
            age=itemView.findViewById(R.id.ageET);
            bloodgroup=itemView.findViewById(R.id.BloodgroupET);

        }
    }
}
