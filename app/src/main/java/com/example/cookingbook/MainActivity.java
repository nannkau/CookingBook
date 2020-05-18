package com.example.cookingbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.cookingbook.models.Food;

import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView danhsach;
    private ArrayList<Food> foods;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foods= new ArrayList<>();
        Food f1= new Food(R.drawable.pic_1,"https://www.cookingchanneltv.com/");
        Food f2= new Food(R.drawable.pic_2,"https://www.foodnetwork.com/recipes");
        Food f3= new Food(R.drawable.pic_3,"https://www.foodnetwork.com/recipes");
        Food f4= new Food(R.drawable.pic_4,"https://www.foodnetwork.com/recipes");
        foods.add(f1);
        foods.add(f2);
        foods.add(f3);
        foods.add(f4);

        // specify an adapter (see also next example)

        danhsach = (RecyclerView) findViewById(R.id.rcv);
        RecyclerAdapter adapter = new RecyclerAdapter(this, foods);// Khởi tạo adapter
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);// Tạo layout manager
        danhsach.setItemAnimator(new DefaultItemAnimator());// Gán hiệu ứng cho Recyclerview
        danhsach.setLayoutManager(layoutManager);// Gán layout manager cho recyclerview
        danhsach.setAdapter(adapter);//gán adapter cho Recyclerview.
    }

}
