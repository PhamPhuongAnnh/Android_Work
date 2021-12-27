package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Video13 extends AppCompatActivity {
    EditText hoTen, namSinh;
    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video13);
        init();
    }

    public void init() {
        hoTen = findViewById(R.id.editTextHoTen);
        namSinh = findViewById(R.id.editTextNamSinh);
        click = findViewById(R.id.btnClick);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hoTen.getText().toString().trim().length() <= 0) {
                    Toast.makeText(Video13.this, "Vui Lòng nhập Họ tên", Toast.LENGTH_SHORT).show();

                } else if (namSinh.getText().toString().trim().length() <= 0) {
                    Toast.makeText(Video13.this, "Vui lòng nhập năm sinh", Toast.LENGTH_SHORT).show();

                } else {
                    String name = hoTen.getText().toString();
                    String age = namSinh.getText().toString();
                    int old = 2021 - Integer.parseInt(age);

                    Toast.makeText(Video13.this, "Tên: " + name + "\nTuổi: " + old, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}