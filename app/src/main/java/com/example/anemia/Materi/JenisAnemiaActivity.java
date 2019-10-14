package com.example.anemia.Materi;

import android.content.Intent;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.anemia.Menu.MateriActivity;
import com.example.anemia.R;

public class JenisAnemiaActivity extends AppCompatActivity {

    LinearLayout mline_jenis1,mline_jenis2,mline_jenis3,mline_jenis4,mline_jenis5;
    TextView mtv_jenis1, mtv_jenis2, mtv_jenis3, mtv_jenis4, mtv_jenis5;
    boolean showingjenis1 = true;
    boolean showingjenis2 = true;
    boolean showingjenis3 = true;
    boolean showingjenis4 = true;
    boolean showingjenis5 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_anemia);

        mtv_jenis1 = findViewById(R.id.tv_jenis1);
        mline_jenis1 = findViewById(R.id.jenis1);
        mtv_jenis2 = findViewById(R.id.tv_jenis2);
        mline_jenis2 = findViewById(R.id.jenis2);
        mtv_jenis3 = findViewById(R.id.tv_jenis3);
        mline_jenis3 = findViewById(R.id.jenis3);
        mtv_jenis4 = findViewById(R.id.tv_jenis4);
        mline_jenis4 = findViewById(R.id.jenis4);
        mtv_jenis5 = findViewById(R.id.tv_jenis5);
        mline_jenis5 = findViewById(R.id.jenis5);


        mtv_jenis5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                laye();
            }
        });
        mtv_jenis4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layd();
            }
        });

        mtv_jenis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lays();
            }
        });
        mtv_jenis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layr();
            }
        });
        mtv_jenis3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layc();
            }
        });

    }
    private void layd(){
        ViewGroup.LayoutParams params3 = mline_jenis4.getLayoutParams();
        if (showingjenis4==true){
            Drawable draw2 = getResources().getDrawable(R.drawable.bawah);
            mtv_jenis4.setCompoundDrawablesWithIntrinsicBounds(draw2, null, null, null);
            params3.height = 600;
            mline_jenis4.setLayoutParams(params3);
            showingjenis4= false;
        }else{
            Drawable draw = getResources().getDrawable(R.drawable.atas);
            mtv_jenis4.setCompoundDrawablesWithIntrinsicBounds(draw, null, null, null);
            params3.height = 110;
            mline_jenis4.setLayoutParams(params3);
            showingjenis4 =true;
        }
    }
    private void laye(){
        ViewGroup.LayoutParams params3 = mline_jenis5.getLayoutParams();
        if (showingjenis5==true){
            Drawable draw2 = getResources().getDrawable(R.drawable.bawah);
            mtv_jenis5.setCompoundDrawablesWithIntrinsicBounds(draw2, null, null, null);
            params3.height = 700;
            mline_jenis5.setLayoutParams(params3);
            showingjenis5= false;
        }else{
            Drawable draw = getResources().getDrawable(R.drawable.atas);
            mtv_jenis5.setCompoundDrawablesWithIntrinsicBounds(draw, null, null, null);
            params3.height = 110;
            mline_jenis5.setLayoutParams(params3);
            showingjenis5 =true;
        }
    }
    private void lays(){
        ViewGroup.LayoutParams params3 = mline_jenis1.getLayoutParams();
        if (showingjenis1==true){
            Drawable draw2 = getResources().getDrawable(R.drawable.bawah);
            mtv_jenis1.setCompoundDrawablesWithIntrinsicBounds(draw2, null, null, null);
            params3.height = 500;
            mline_jenis1.setLayoutParams(params3);
            showingjenis1= false;
        }else{
            Drawable draw = getResources().getDrawable(R.drawable.atas);
            mtv_jenis1.setCompoundDrawablesWithIntrinsicBounds(draw, null, null, null);
            params3.height = 110;
            mline_jenis1.setLayoutParams(params3);
            showingjenis1 =true;
        }
    }
    private void layr(){
        ViewGroup.LayoutParams params3 = mline_jenis2.getLayoutParams();
        if (showingjenis2==true){
            Drawable draw2 = getResources().getDrawable(R.drawable.bawah);
            mtv_jenis2.setCompoundDrawablesWithIntrinsicBounds(draw2, null, null, null);
            params3.height = 1000;
            mline_jenis2.setLayoutParams(params3);
            showingjenis2= false;
        }else{
            Drawable draw = getResources().getDrawable(R.drawable.atas);
            mtv_jenis2.setCompoundDrawablesWithIntrinsicBounds(draw, null, null, null);
            params3.height = 110;
            mline_jenis2.setLayoutParams(params3);
            showingjenis2 =true;
        }
    }
    private void layc(){
        ViewGroup.LayoutParams params3 = mline_jenis3.getLayoutParams();
        if (showingjenis3==true){
            Drawable draw2 = getResources().getDrawable(R.drawable.bawah);
            mtv_jenis3.setCompoundDrawablesWithIntrinsicBounds(draw2, null, null, null);
            params3.height = 800;
            mline_jenis3.setLayoutParams(params3);
            showingjenis3= false;
        }else{
            Drawable draw = getResources().getDrawable(R.drawable.atas);
            mtv_jenis3.setCompoundDrawablesWithIntrinsicBounds(draw, null, null, null);
            params3.height = 110;
            mline_jenis3.setLayoutParams(params3);
            showingjenis3 =true;
        }


    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MateriActivity.class);
        startActivity(intent);
    }
}

