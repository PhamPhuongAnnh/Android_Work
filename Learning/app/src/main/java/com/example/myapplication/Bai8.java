package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class Bai8 extends AppCompatActivity {

    Button snackbar, callback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
    }

    public void init(){
        snackbar = findViewById(R.id.snack);
        callback = findViewById(R.id.callback);

        snackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snack = Snackbar.make(v, "Khóa học lập trình Android", Snackbar.LENGTH_SHORT).setAction("action", null);
                snack.setActionTextColor(Color.RED);
                snack.show();
            }
        });
        callback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snack = Snackbar.make(v, "lập trình android", Snackbar.LENGTH_LONG);
                snack.setAction("Học viên", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(v, "Phạm Phuong Anh", Snackbar.LENGTH_SHORT).show();
                    }
                });
                snack.show();
            }
        });
    }
}