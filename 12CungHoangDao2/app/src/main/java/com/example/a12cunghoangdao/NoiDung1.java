package com.example.a12cunghoangdao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class NoiDung1 extends AppCompatActivity {
    RelativeLayout relativeLayout;
    ImageView img;
    TextView txt_dauDe,txt_Content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noi_dung1);
        relativeLayout = findViewById(R.id.noidung1);
        img = findViewById(R.id.iv1);
        txt_dauDe = findViewById(R.id.tx_daude);
        txt_Content = findViewById(R.id.txt_content);
        Intent intent1 = getIntent();
        Bundle bundle = intent1.getExtras();
        int val1 = 0, val2=0,val3=0;
        if(bundle!= null){
             val1 = bundle.getInt("key1");
             val2 = bundle.getInt("key2");
             val3 = bundle.getInt("key3");
        }
        img.setImageResource(val1);
        txt_dauDe.setText(getString(val2));
        txt_Content.setText(getString(val3));
        relativeLayout.setOnClickListener(v -> {
            Intent intent = new Intent(NoiDung1.this, NoiDung.class);
            startActivity(intent);
        });
    }
}