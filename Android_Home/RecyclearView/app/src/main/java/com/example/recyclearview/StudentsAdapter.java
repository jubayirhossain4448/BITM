package com.example.recyclearview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.ViewHolder> {

    private ArrayList<Student> studentsList;

    public StudentsAdapter(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.student_item_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StudentsAdapter.ViewHolder viewHolder, int i) {
       Student currentStudent = studentsList.get(i);
       viewHolder.nameTV.setText(currentStudent.getName());
       viewHolder.genderTV.setText(currentStudent.getGender());
       viewHolder.emailTV.setText(currentStudent.getEmail());
       viewHolder.mobileNumberTV.setText(currentStudent.getMobileNumber());
       viewHolder.deptTV.setText(currentStudent.getDept());
       viewHolder.idTV.setText(currentStudent.getId());

    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nameTV, genderTV, emailTV, mobileNumberTV, deptTV, idTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTV = itemView.findViewById(R.id.nameTV);
            genderTV = itemView.findViewById(R.id.genderTV);
            emailTV = itemView.findViewById(R.id.emailTV);
            mobileNumberTV = itemView.findViewById(R.id.mobileNumberTV);
            deptTV = itemView.findViewById(R.id.depTv);
            idTV = itemView.findViewById(R.id.idTV);
        }
    }
}
