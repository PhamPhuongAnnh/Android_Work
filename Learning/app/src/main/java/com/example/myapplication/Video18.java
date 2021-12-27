package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.ToggleButton;

public class Video18 extends AppCompatActivity {

    EditText trangThai1, trangThai2;
    Switch swt;
    ToggleButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video18);
        init();
    }

    public void init() {
        trangThai2 = findViewById(R.id.TrangThai2);
        trangThai1 = findViewById(R.id.TrangThai1);
        swt = findViewById(R.id.switch1);
        btn = findViewById(R.id.toggleButton);
        btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btn.isChecked() == true) {
                    trangThai2.setText("ON");
                } else {
                    trangThai2.setText("OFF");
                }
            }
        });
        swt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (swt.isChecked() == true) {
                    trangThai1.setText("ON");
                } else {
                    trangThai1.setText("OFF");
                }
            }
        });
    }
}