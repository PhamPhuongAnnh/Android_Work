 package com.example.a12cunghoangdao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {
    TextView textView;
    ImageButton img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        textView = findViewById(R.id.bat_dau);
        img = findViewById(R.id.img1);
        textView.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, NoiDung.class);
            startActivity(intent);
        });
        img.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, NoiDung.class);
            startActivity(intent);
        });

    }

}