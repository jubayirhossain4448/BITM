package com.example.bitm_project_01dailyexpensenote;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.List;

public class DailyExpenseAdapter extends RecyclerView.Adapter<DailyExpenseAdapter.ViewHolder> implements PopupMenu.OnMenuItemClickListener{


    private ExpenseDataOpenHelper helper;
    private List<Expense> expenseList;
    private Context context;




    public DailyExpenseAdapter(ExpenseDataOpenHelper helper, List<Expense> expenseList, Context context) {
        this.helper = helper;
        this.expenseList = expenseList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_expense_layout,parent,false);



        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        Expense expense = expenseList.get(position);
        holder.expenseName.setText(expense.getExpenseName());
        holder.expenseAmount.setText(Double.toString(expense.getExpenseAmount()));



        holder.imageButtonmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showPopUp(view);

            }
        });


       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               BottomSheetDialogFragment bottomSheet = new DetailsBottomSheet();
               bottomSheet.show(((FragmentActivity)context).getSupportFragmentManager(), bottomSheet.getTag());


           }
       });

    }

    @Override
    public int getItemCount() {
        return expenseList.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView expenseName, expenseAmount;
        private ImageButton imageButtonmenu;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            expenseName = itemView.findViewById(R.id.expenseName);
            expenseAmount = itemView.findViewById(R.id.expenseAmount);
            imageButtonmenu = itemView.findViewById(R.id.editOrUpdateMenu);
        }
    }

    public void showPopUp(View view){
        PopupMenu popupMenu = new PopupMenu(context,view);
        popupMenu.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener) context);
        popupMenu.inflate(R.menu.popup);
        popupMenu.show();

    }
    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.updateItem:
            return true;
            case R.id.deleteItem:
            return true;
            default:
                return false;
        }
    }
}
