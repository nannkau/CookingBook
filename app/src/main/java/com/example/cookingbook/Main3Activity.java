package com.example.cookingbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.cookingbook.R;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent= getIntent();
        int id= intent.getIntExtra("ID",-1);
        this.getWindow().setBackgroundDrawableResource(MainActivity.foods.get(id).getPhoto());
    }
}
