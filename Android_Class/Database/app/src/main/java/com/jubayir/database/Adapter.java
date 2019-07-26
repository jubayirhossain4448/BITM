package com.jubayir.database;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<course> arrayList = new ArrayList<>();
    private Context context;

    public Adapter(ArrayList<course> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        course course = arrayList.get(position);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tittle,code,credit;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tittle=itemView.findViewById(R.id.tittleTvId);
            code=itemView.findViewById(R.id.codeTvId);
            credit=itemView.findViewById(R.id.creditTvId);

        }
    }
}
