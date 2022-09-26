package com.example.provatassiop1nativo.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.provatassiop1nativo.R;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        Intent intent = this.getIntent();

        if(intent != null ) {
            String title = intent.getStringExtra("title");
            String descricao = intent.getStringExtra("descricao");
            String hour = intent.getStringExtra("hour");

            TextView news_title = findViewById(R.id.news_title);
            TextView news_description = findViewById(R.id.news_description);
            TextView news_hour = findViewById(R.id.news_hour);
            news_title.setText(title);
            news_description.setText(descricao);
            news_hour.setText(hour);
        }
    }
}