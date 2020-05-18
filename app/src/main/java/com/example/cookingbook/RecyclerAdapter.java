package com.example.cookingbook;



import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cookingbook.models.Food;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecylerViewHolder> {
    private Activity mActivity;
    private ArrayList<Food> danhsach;


    public RecyclerAdapter(Activity mActivity, ArrayList<Food> danhsach) {
        this.mActivity = mActivity;
        this.danhsach = danhsach;
    }
    @NonNull
    @Override
    public RecyclerAdapter.RecylerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View objView = LayoutInflater.from(mActivity).inflate(R.layout.layout_item, parent, false);
        return new RecylerViewHolder(objView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.RecylerViewHolder holder, int position) {
        holder.link.setText(danhsach.get(position).getLink());
        holder.link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return danhsach.size()-1;
    }
    class RecylerViewHolder extends RecyclerView.ViewHolder {
        TextView link;
        ImageView imgView;

        public RecylerViewHolder(View itemView) {
            super(itemView);
            link = itemView.findViewById(R.id.name);
            imgView=itemView.findViewById(R.id.imageView);
        }

    }
}
