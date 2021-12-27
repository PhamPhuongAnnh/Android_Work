package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Video14 extends AppCompatActivity implements View.OnClickListener{

    EditText so1, so2;
    TextView kq;
    Button btnCong, btnTru, btnNhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video14);
        init();
    }

    public void init(){
        so1 = findViewById(R.id.so1);
        so2 = findViewById(R.id.So2);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        kq = findViewById(R.id.KQ);

        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int number1 , number2 ;


        switch (v.getId()){
            case R.id.btnCong:

                if(so1.getText().toString().trim().length()<=0 || so2.getText().toString().trim().length()<=0){
                    Toast.makeText(Video14.this, "Mời nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                }
                else{
                    number1 = Integer.parseInt(so1.getText().toString());
                    number2 = Integer.parseInt(so2.getText().toString());
                    String cong = String.valueOf(number1+number2);
                    kq.setText(number1+ "+" +number2 +"= "+cong);
                }
                break;
            case R.id.btnTru:

                if(so1.getText().toString().trim().length()<=0 || so2.getText().toString().trim().length()<=0){
                    Toast.makeText(Video14.this, "Mời nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                }
                else{
                    number1 = Integer.parseInt(so1.getText().toString());
                    number2 = Integer.parseInt(so2.getText().toString());
                    String tru = String.valueOf(number1-number2);
                    kq.setText(number1+ "-" +number2 +"= "+tru);

                }

                break;
            case R.id.btnNhan:

                if(so1.getText().toString().trim().length()<=0 || so2.getText().toString().trim().length()<=0){
                    Toast.makeText(Video14.this, "Mời nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                }else{
                    number1 = Integer.parseInt(so1.getText().toString());
                    number2 = Integer.parseInt(so2.getText().toString());
                    String nhan = String.valueOf(number1*number2);
                    kq.setText(number1+ "*" +number2 +"= "+nhan);
                }

                break;

        }


    }
}