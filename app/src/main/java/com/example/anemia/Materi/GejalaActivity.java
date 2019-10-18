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

public class GejalaActivity extends AppCompatActivity {
    LinearLayout mline_gejala1,mline_gejala2,mline_gejala3;
    TextView mtv_gejala1, mtv_gejala2, mtv_gejala3;
    boolean showingGejala1 = true;
    boolean showingGejala2 = true;
    boolean showingGejala3 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gejala);
        mtv_gejala1 = findViewById(R.id.tv_gejala1);
        mline_gejala1 = findViewById(R.id.gejala1);
        mtv_gejala2 = findViewById(R.id.tv_gejala2);
        mline_gejala2 = findViewById(R.id.gejala2);
        mtv_gejala3 = findViewById(R.id.tv_gejala3);
        mline_gejala3 = findViewById(R.id.gejala3);

        mtv_gejala1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lays();
            }
        });
        mtv_gejala2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layr();
            }
        });
        mtv_gejala3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layc();
            }
        });

    }
    private void lays(){
        ViewGroup.LayoutParams params3 = mline_gejala1.getLayoutParams();
        if (showingGejala1==true){
            Drawable draw2 = getResources().getDrawable(R.drawable.atas);
            mtv_gejala1.setCompoundDrawablesWithIntrinsicBounds(draw2, null, null, null);
            params3.height = 400;
            mline_gejala1.setLayoutParams(params3);
            showingGejala1= false;
        }else{
            Drawable draw = getResources().getDrawable(R.drawable.bawah);
            mtv_gejala1.setCompoundDrawablesWithIntrinsicBounds(draw, null, null, null);
            params3.height = 110;
            mline_gejala1.setLayoutParams(params3);
            showingGejala1 =true;
        }
    }
    private void layr(){
        ViewGroup.LayoutParams params3 = mline_gejala2.getLayoutParams();
        if (showingGejala2==true){
            Drawable draw2 = getResources().getDrawable(R.drawable.atas);
            mtv_gejala2.setCompoundDrawablesWithIntrinsicBounds(draw2, null, null, null);
            params3.height = 1100;
            mline_gejala2.setLayoutParams(params3);
            showingGejala2= false;
        }else{
            Drawable draw = getResources().getDrawable(R.drawable.bawah);
            mtv_gejala2.setCompoundDrawablesWithIntrinsicBounds(draw, null, null, null);
            params3.height = 110;
            mline_gejala2.setLayoutParams(params3);
            showingGejala2 =true;
        }
    }
    private void layc(){
        ViewGroup.LayoutParams params3 = mline_gejala3.getLayoutParams();
        if (showingGejala3==true){
            Drawable draw2 = getResources().getDrawable(R.drawable.atas);
            mtv_gejala3.setCompoundDrawablesWithIntrinsicBounds(draw2, null, null, null);
            params3.height = 600;
            mline_gejala3.setLayoutParams(params3);
            showingGejala3= false;
        }else{
            Drawable draw = getResources().getDrawable(R.drawable.bawah);
            mtv_gejala3.setCompoundDrawablesWithIntrinsicBounds(draw, null, null, null);
            params3.height = 110;
            mline_gejala3.setLayoutParams(params3);
            showingGejala3 =true;
        }


    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MateriActivity.class);
        startActivity(intent);
    }
}
