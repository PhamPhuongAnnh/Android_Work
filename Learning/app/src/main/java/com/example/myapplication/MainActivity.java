package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.snackbar.Snackbar;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    TextView ex1,ex2;
    SeekBar sb1, sb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video20);
        init();

    }

    public void init(){
        ex1 = findViewById(R.id.edit1);
        ex2=findViewById(R.id.edit2);
        sb1 = findViewById(R.id.seekBar);
        sb2 = findViewById(R.id.seekBar2);
        // set giá trị lớn nhất cho seekbar
        sb1.setMax(10);
        sb2.setMax(10);

        int values1 = sb1.getProgress();
        sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
             // kéo

                ex1.setText(String.valueOf(values1));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
// bấm vô
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
// thả ra
            }
        });
    }








}
