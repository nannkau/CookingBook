package com.example.cookingbook;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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

import static androidx.core.content.ContextCompat.startActivity;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecylerViewHolder>  {
    private Activity mActivity;
    private ArrayList<Food> danhsach;
    private Context context;


    public RecyclerAdapter(Activity mActivity, ArrayList<Food> danhsach,Context context) {
        this.mActivity = mActivity;
        this.danhsach = danhsach;
        this.context = context;
    }
    @NonNull
    @Override
    public RecyclerAdapter.RecylerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View objView = LayoutInflater.from(mActivity).inflate(R.layout.layout_item, parent, false);
        return new RecylerViewHolder(objView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.RecylerViewHolder holder, final int position) {
        holder.link.setText(danhsach.get(position).getName());
        holder.imgView.setImageResource(danhsach.get(position).getPhoto());
        holder.link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "You clicked an item", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, Main2Activity.class);
                intent.putExtra("ID", position);
                context.startActivity(intent);
            }
        });
        holder.imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(context, "You clicked an item", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, Main3Activity.class);
                intent.putExtra("ID", position);
                context.startActivity(intent);
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
