package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Video19 extends AppCompatActivity {

    ToggleButton btn;
    EditText link;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video19);
        init();
    }

    public void init(){
        btn = findViewById(R.id.btnClick);
        link = findViewById(R.id.link1);
        img = findViewById(R.id.imgHinh);

        btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(btn.isChecked()){
                    if(link.getText().toString().trim().length()  == 0){
                        Toast.makeText(Video19.this, "Vui long nhập link", Toast.LENGTH_SHORT).show();
                    }else{
                        String nick = link.getText().toString().trim();
                        String yaho = "http://img.msg.yahoo.com/vl/displayImage/yahoo/"+nick;
                        new Video19.loadHinh().execute(yaho);
                    }

                }
                else{
                    if(link.getText().toString().trim().length()  == 0){
                        Toast.makeText(Video19.this, "Vui long nhập link", Toast.LENGTH_SHORT).show();
                    }else{
                        String group = link.getText().toString().trim();
                        String facebook = "https://graph.facebook.com/"+group+"/picture/?type=large";
                        new Video19.loadHinh().execute(facebook);
                    }
                }
            }
        });
    }

    private class loadHinh extends AsyncTask<String, Integer, Bitmap> {
        Bitmap bm = null;
        @Override
        protected Bitmap doInBackground(String... strings) {
            try {
                URL url = new URL(strings[0]);
                bm = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return bm;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            img.setImageBitmap(bitmap);
        }
    }
}