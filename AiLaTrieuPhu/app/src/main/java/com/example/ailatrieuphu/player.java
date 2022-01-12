package com.example.ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class player extends AppCompatActivity {
    LinearLayout answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        init();
    }
    public void init(){
        answer = findViewById(R.id.ln_answer);
        answer.setOnClickListener(v -> {
            Intent intent = new Intent(player.this, Answer.class);
            startActivity(intent);
        });
    }
}