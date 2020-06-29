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
    static ArrayList<Food> foods;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foods= new ArrayList<>();
        Food f1= new Food(R.drawable.pic_1,"https://www.cookingchanneltv.com/","Cooking Channel TV");
        Food f2= new Food(R.drawable.pic_2,"https://www.foodnetwork.com/recipes","Food Network ");
        Food f3= new Food(R.drawable.pic_3,"http://www.recipe.com/","Recipe.com ");
        Food f4= new Food(R.drawable.pic_4,"https://www.bettycrocker.com/recipes","Betty Crocker TM ");
        Food f5= new Food(R.drawable.pic_5,"https://www.bettycrocker.com/recipes","Simply Recipes ");
        Food f6= new Food(R.drawable.pic_6,"http://www.thekitchn.com/ ","The Kitchn ");
        Food f7= new Food(R.drawable.pic_7,"http://www.gimmesomeoven.com/ ","Give Me Some Oven ");
        foods.add(f1);
        foods.add(f2);
        foods.add(f3);
        foods.add(f4);
        foods.add(f5);
        foods.add(f6);
        foods.add(f7);

        // specify an adapter (see also next example)

        danhsach = (RecyclerView) findViewById(R.id.rcv);
        RecyclerAdapter adapter = new RecyclerAdapter(this, foods,MainActivity.this);// Khởi tạo adapter
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);// Tạo layout manager
        danhsach.setItemAnimator(new DefaultItemAnimator());// Gán hiệu ứng cho Recyclerview
        danhsach.setLayoutManager(layoutManager);// Gán layout manager cho recyclerview
        danhsach.setAdapter(adapter);//gán adapter cho Recyclerview.
    }

}
