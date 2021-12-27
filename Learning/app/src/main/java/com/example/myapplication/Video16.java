package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Video16 extends AppCompatActivity {

    ImageView img;
    Button btnClick;
    EditText link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video16);
        init();
    }

    public void init(){
        img = findViewById(R.id.imageView);
        btnClick = findViewById(R.id.btnClick);
        link = findViewById(R.id.link);
        img.setImageResource(R.drawable.noimg);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(link.getText().toString().trim().length()<=0){
                    Toast.makeText(Video16.this, "Mời nhập link", Toast.LENGTH_SHORT).show();
                }
                else{
                    new Video16.loadHinh1().execute(link.getText().toString());
                }
            }
        });
    }




    private class loadHinh1 extends AsyncTask<String, Integer, Bitmap> {
        Bitmap bmp = null;
        @Override
        protected Bitmap doInBackground(String... strings) {
            try {
                URL u = new URL(strings[0]);
                bmp = BitmapFactory.decodeStream(u.openConnection().getInputStream());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return bmp;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            img.setImageBitmap(bitmap);
        }
    }
}