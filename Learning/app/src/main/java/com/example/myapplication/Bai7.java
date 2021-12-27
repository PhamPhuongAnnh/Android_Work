package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Bai7 extends AppCompatActivity {

    Button btnLog, btnLong, btnShort;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai7);
        init();
    }

    public void init(){
        btnLog = findViewById(R.id.btnLog);
        btnLong  = findViewById(R.id.btn_long);
        btnShort = findViewById(R.id.btnShort);

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("QhOnlind", "học lập trình android");
                System.out.println("Phạm thị phương anh");
            }
        });

        btnShort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bai7.this, "qhonline", Toast.LENGTH_SHORT).show();
            }
        });
        btnLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(Bai7.this, "Abc", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0,0); // vị trí hiện tại, khoảng cách vị trí hiện tại theo chiều x, khoảng cách hiện tại theo chiều y
                toast.show();
            }
        });


    }


}