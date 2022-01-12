package com.example.ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Answer extends AppCompatActivity implements  View.OnClickListener{
    ImageView answerA_choose,answerB_choose,answerC_choose,answerD_choose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        init();
    }
    public void init(){
        answerA_choose = findViewById(R.id.answerA_choose);
        answerB_choose = findViewById(R.id.answerB_choose);
        answerC_choose  = findViewById(R.id.answerC_choose);
        answerD_choose = findViewById(R.id.answerD_choose);

        onClick(answerA_choose);
        onClick(answerB_choose);
        onClick(answerC_choose);
        onClick(answerD_choose);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.answerA:
                answerA_choose.setVisibility(View.VISIBLE);
                break;
            case  R.id.answerB:
                answerB_choose.setVisibility(View.VISIBLE);
                break;
            case  R.id.answerC:
                answerC_choose.setVisibility(View.VISIBLE);
                break;
            case  R.id.answerD:
                answerD_choose.setVisibility(View.VISIBLE);
                break;
            default:
                Toast.makeText(Answer.this, "Mời chọn phương án đúng", Toast.LENGTH_SHORT).show();

        }
    }
}