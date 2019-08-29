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

import java.util.Random;

public class PenyebabActivity extends AppCompatActivity {
    LinearLayout mline_penyebab1,mline_penyebab2,mline_penyebab3;
    TextView mtv_penyebab1, mtv_penyebab2, mtv_penyebab3;
    boolean showingPenyebab1 = true;
    boolean showingPenyebab2 = true;
    boolean showingPenyebab3 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyebab);

        mtv_penyebab1 = findViewById(R.id.tv_penyebab1);
        mline_penyebab1 = findViewById(R.id.penyebab1);

        mtv_penyebab2 = findViewById(R.id.tv_penyebab2);
        mline_penyebab2 = findViewById(R.id.penyebab2);

        mtv_penyebab3 = findViewById(R.id.tv_penyebab3);
        mline_penyebab3 = findViewById(R.id.penyebab3);


        mtv_penyebab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pens();
            }
        });
        mtv_penyebab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                penr();
            }
        });
        mtv_penyebab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                penc();
            }
        });

    }
    private void pens(){
        ViewGroup.LayoutParams params3 = mline_penyebab1.getLayoutParams();
        if (showingPenyebab1==true){
            Drawable draw2 = getResources().getDrawable(R.drawable.bawah);
            mtv_penyebab1.setCompoundDrawablesWithIntrinsicBounds(draw2, null, null, null);
            params3.height = 900;
            mline_penyebab1.setLayoutParams(params3);
            showingPenyebab1= false;
        }else{
            Drawable draw = getResources().getDrawable(R.drawable.atas);
            mtv_penyebab1.setCompoundDrawablesWithIntrinsicBounds(draw, null, null, null);
            params3.height = 110;
            mline_penyebab1.setLayoutParams(params3);
            showingPenyebab1 =true;
        }
    }
    private void penr(){
        ViewGroup.LayoutParams params3 = mline_penyebab2.getLayoutParams();
        if (showingPenyebab2==true){
            Drawable draw2 = getResources().getDrawable(R.drawable.bawah);
            mtv_penyebab2.setCompoundDrawablesWithIntrinsicBounds(draw2, null, null, null);
            params3.height = 450;
            mline_penyebab2.setLayoutParams(params3);
            showingPenyebab2= false;
        }else{
            Drawable draw = getResources().getDrawable(R.drawable.atas);
            mtv_penyebab2.setCompoundDrawablesWithIntrinsicBounds(draw, null, null, null);
            params3.height = 110;
            mline_penyebab2.setLayoutParams(params3);
            showingPenyebab2 =true;
        }
    }
    private void penc(){
        ViewGroup.LayoutParams params3 = mline_penyebab3.getLayoutParams();
        if (showingPenyebab3==true){
            Drawable draw2 = getResources().getDrawable(R.drawable.bawah);
            mtv_penyebab3.setCompoundDrawablesWithIntrinsicBounds(draw2, null, null, null);
            params3.height = 600;
            mline_penyebab3.setLayoutParams(params3);
            showingPenyebab3= false;
        }else{
            Drawable draw = getResources().getDrawable(R.drawable.atas);
            mtv_penyebab3.setCompoundDrawablesWithIntrinsicBounds(draw, null, null, null);
            params3.height = 110;
            mline_penyebab3.setLayoutParams(params3);
            showingPenyebab3 =true;
        }


    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MateriActivity.class);
        startActivity(intent);
    }
}
