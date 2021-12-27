package com.example.a12cunghoangdao;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NoiDung extends AppCompatActivity implements View.OnClickListener{
    ImageView  img_content,img_content1,img_content2,img_content3,img_content4,img_content5,img_content6,img_content7,img_content8,img_content9,img_content10,img_content11,img_content12;
    TextView dauDe, content;
    Button btnXemThem;
    int iv1 =0, txt_dauDe=0 ,txt_content=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noi_dung);
        intit();

    }

    public void intit(){
        img_content = findViewById(R.id.iv_content);
        dauDe = findViewById(R.id.dauDe_content);
        content = findViewById(R.id.txt);
        btnXemThem = findViewById(R.id.btnXemThem);
        iv1=(R.drawable.ic_bao_binh);
        txt_dauDe=(R.string.bao_binh_title1);
        txt_content=(R.string.bao_binh_text);


        img_content1 = findViewById(R.id.baobinh);
        img_content2 = findViewById(R.id.maKet);
        img_content3 = findViewById(R.id.thienBinh);
        img_content4 = findViewById(R.id.bocap);
        img_content5 = findViewById(R.id.xuNu);
        img_content6 = findViewById(R.id.songngu);
        img_content7 = findViewById(R.id.songtu);
        img_content8= findViewById(R.id.bachduong);
        img_content9 = findViewById(R.id.nhanMa);
        img_content10 = findViewById(R.id.kimngu);
        img_content11 = findViewById(R.id.sutu);
        img_content12 = findViewById(R.id.cugiai);

        img_content1.setOnClickListener(this);
        img_content2.setOnClickListener(this);
        img_content3.setOnClickListener(this);
        img_content4.setOnClickListener(this);
        img_content5.setOnClickListener(this);
        img_content6.setOnClickListener(this);
        img_content7.setOnClickListener(this);
        img_content8.setOnClickListener(this);
        img_content9.setOnClickListener(this);
        img_content10.setOnClickListener(this);
        img_content11.setOnClickListener(this);
        img_content12.setOnClickListener(this);
        btnXemThem.setOnClickListener(this);

    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.baobinh:
                img_content.setImageResource(R.drawable.ic_bao_binh);
                dauDe.setText(R.string.bao_binh_title1);
                content.setText(R.string.bao_binh_text);

                iv1=(R.drawable.ic_bao_binh);
                txt_dauDe=(R.string.bao_binh_title1);
                txt_content=(R.string.bao_binh_text);
                break;
            case R.id.maKet:
                img_content.setImageResource(R.drawable.ic_ma_ket);
                dauDe.setText(R.string.ma_ket_title1);
                content.setText(R.string.ma_ket_text);

                iv1=(R.drawable.ic_ma_ket);
                txt_dauDe=(R.string.ma_ket_title1);
                txt_content=(R.string.ma_ket_text);
                break;
            case  R.id.thienBinh:
                img_content.setImageResource(R.drawable.ic_thien_binh);
                dauDe.setText(R.string.thien_binh_title1);
                content.setText(R.string.thien_binh_text);
                iv1=(R.drawable.ic_thien_binh);
                txt_dauDe=(R.string.thien_binh_title1);
                txt_content=(R.string.thien_binh_text);

                break;
            case R.id.bocap:
                img_content.setImageResource(R.drawable.ic_bocap);
                dauDe.setText(R.string.bo_cap_title1);
                content.setText(R.string.bo_cap_text);

                iv1=(R.drawable.ic_bocap);
                txt_dauDe=(R.string.bo_cap_title1);
                txt_content=(R.string.bo_cap_text);
                break;
            case R.id.xuNu:
                img_content.setImageResource(R.drawable.ic_xu_nu);
                dauDe.setText(R.string.xu_nu_title1);
                content.setText(R.string.xu_nu_text);

                iv1=(R.drawable.ic_xu_nu);
                txt_dauDe=(R.string.xu_nu_title1);
                txt_content=(R.string.xu_nu_text);
                break;
            case R.id.songngu:
                img_content.setImageResource(R.drawable.ic_song_ngu);
                dauDe.setText(R.string.song_ngu_title1);
                content.setText(R.string.song_ngu_text);

                iv1=(R.drawable.ic_song_ngu);
                txt_dauDe=(R.string.song_ngu_title1);
                txt_content=(R.string.song_ngu_text);
                break;
            case R.id.songtu:
                img_content.setImageResource(R.drawable.ic_song_tu);
                dauDe.setText(R.string.song_tu_title1);
                content.setText(R.string.song_tu_text);

                iv1=(R.drawable.ic_song_tu);
                txt_dauDe=(R.string.song_tu_title1);
                txt_content=(R.string.song_tu_text);
                break;
            case R.id.bachduong:
                img_content.setImageResource(R.drawable.ic_bach_duong);
                dauDe.setText(R.string.bach_duong_title1);
                content.setText(R.string.bach_duong_text);

                iv1=(R.drawable.ic_bach_duong);
                txt_dauDe=(R.string.bach_duong_title1);
                txt_content=(R.string.bach_duong_text);
                break;
            case R.id.nhanMa:
                img_content.setImageResource(R.drawable.ic_nhan_ma);
                dauDe.setText(R.string.nhan_ma_title1);
                content.setText(R.string.nhan_ma_text);

                iv1=(R.drawable.ic_nhan_ma);
                txt_dauDe=(R.string.nhan_ma_title1);
                txt_content=(R.string.nhan_ma_text);
                break;
            case R.id.kimngu:
                img_content.setImageResource(R.drawable.ic_kim_nguu);
                dauDe.setText(R.string.kim_nguu_title1);
                content.setText(R.string.kim_nguu_text);
                iv1=(R.drawable.ic_kim_nguu);
                txt_dauDe=(R.string.kim_nguu_title1);
                txt_content=(R.string.kim_nguu_text);

                break;
            case R.id.sutu:
                img_content.setImageResource(R.drawable.ic_su_tu);
                dauDe.setText(R.string.su_tu_title1);
                content.setText(R.string.su_tu_text);
                iv1=(R.drawable.ic_su_tu);
                txt_dauDe=(R.string.su_tu_title1);
                txt_content=(R.string.su_tu_text);
                break;
            case  R.id.cugiai:
                img_content.setImageResource(R.drawable.ic_cu_giai);
                dauDe.setText(R.string.cu_giai_title1);
                content.setText(R.string.cu_giai_text);
                iv1=(R.drawable.ic_cu_giai);
                txt_dauDe=(R.string.cu_giai_title1);
                txt_content=(R.string.cu_giai_text);
                break;
            case R.id.btnXemThem:
                if(iv1 == 0|| txt_dauDe == 0 || txt_content==0){
                    Toast.makeText(NoiDung.this, "Không có dữ liệu", Toast.LENGTH_SHORT);
                }
                else{
                    Intent intent = new Intent(NoiDung.this, NoiDung1.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("key1", iv1);
                    bundle.putInt("key2", txt_dauDe);
                    bundle.putInt("key3", txt_content);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                break;
        }
    }
}