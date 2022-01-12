package com.example.ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView choiLuon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    void init(){
        choiLuon = findViewById(R.id.apt_button_play_normal);



        choiLuon.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, player.class);
            startActivity(intent);
        });
    }
}