package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

public class Video17 extends AppCompatActivity {

    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video17);
        init();
    }

    public void init(){
        relativeLayout = findViewById(R.id.layout17);
        relativeLayout.setBackgroundResource(R.drawable.bg);
    }
}