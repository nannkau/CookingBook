package com.example.cookingbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {
    private  WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        webView=(WebView) findViewById(R.id.webview);
        Intent intent =getIntent();
        int id= intent.getIntExtra("ID",-1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(MainActivity.foods.get(id).getLink());
    }
}
