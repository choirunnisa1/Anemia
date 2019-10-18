package com.example.anemia.Materi;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.anemia.R;

public class PemeriksaanDiagActivity extends AppCompatActivity {
    LinearLayout mline_diag1,mline_diag2,mline_diag3,mline_diag4;
    TextView mtv_diag1, mtv_diag2, mtv_diag3,  mtv_diag4;
    boolean showingDiag1 = true;
    boolean showingDiag2 = true;
    boolean showingDiag3 = true;
    boolean showingDiag4 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemeriksaan_diag);

        mtv_diag1 = findViewById(R.id.tv_diag1);
        mline_diag1 = findViewById(R.id.diag1);

       mtv_diag2 = findViewById(R.id.tv_diag2);
       mline_diag2 = findViewById(R.id.diag2);

       mtv_diag3 = findViewById(R.id.tv_diag3);
       mline_diag3 = findViewById(R.id.diag3);

       mtv_diag4 = findViewById(R.id.tv_diag4);
       mline_diag4 = findViewById(R.id.diag4);



        mtv_diag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diags();
            }
        });
        mtv_diag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diagr();
            }
        });
        mtv_diag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diagk();
            }
        });
        mtv_diag4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diagl();
            }
        });

    }
    private void diags(){
        ViewGroup.LayoutParams params3 = mline_diag1.getLayoutParams();
        if (showingDiag1==true){
            Drawable draw2 = getResources().getDrawable(R.drawable.atas);
            mtv_diag1.setCompoundDrawablesWithIntrinsicBounds(draw2, null, null, null);
            params3.height = 450;
            mline_diag1.setLayoutParams(params3);
            showingDiag1= false;
        }else{
            Drawable draw = getResources().getDrawable(R.drawable.bawah);
            mtv_diag1.setCompoundDrawablesWithIntrinsicBounds(draw, null, null, null);
            params3.height = 110;
            mline_diag1.setLayoutParams(params3);
            showingDiag1 =true;
        }
    }
    private void diagr(){
        ViewGroup.LayoutParams params3 = mline_diag2.getLayoutParams();
        if (showingDiag2==true){
            Drawable draw2 = getResources().getDrawable(R.drawable.atas);
            mtv_diag2.setCompoundDrawablesWithIntrinsicBounds(draw2, null, null, null);
            params3.height = 450;
            mline_diag2.setLayoutParams(params3);
            showingDiag2= false;
        }else{
            Drawable draw = getResources().getDrawable(R.drawable.bawah);
            mtv_diag2.setCompoundDrawablesWithIntrinsicBounds(draw, null, null, null);
            params3.height = 110;
            mline_diag2.setLayoutParams(params3);
            showingDiag2 =true;
        }
    }
    private void diagk(){
        ViewGroup.LayoutParams params3 = mline_diag3.getLayoutParams();
        if (showingDiag3==true){
            Drawable draw2 = getResources().getDrawable(R.drawable.atas);
            mtv_diag3.setCompoundDrawablesWithIntrinsicBounds(draw2, null, null, null);
            params3.height = 600;
            mline_diag3.setLayoutParams(params3);
            showingDiag3= false;
        }else{
            Drawable draw = getResources().getDrawable(R.drawable.bawah);
            mtv_diag3.setCompoundDrawablesWithIntrinsicBounds(draw, null, null, null);
            params3.height = 110;
            mline_diag3.setLayoutParams(params3);
            showingDiag3 =true;
        }
    }
    private void diagl(){
        ViewGroup.LayoutParams params3 = mline_diag4.getLayoutParams();
        if (showingDiag4==true){
            Drawable draw2 = getResources().getDrawable(R.drawable.atas);
            mtv_diag4.setCompoundDrawablesWithIntrinsicBounds(draw2, null, null, null);
            params3.height = 800;
            mline_diag4.setLayoutParams(params3);
            showingDiag4= false;
        }else{
            Drawable draw = getResources().getDrawable(R.drawable.bawah);
            mtv_diag4.setCompoundDrawablesWithIntrinsicBounds(draw, null, null, null);
            params3.height = 110;
            mline_diag4.setLayoutParams(params3);
            showingDiag4 =true;
        }
    }

}
