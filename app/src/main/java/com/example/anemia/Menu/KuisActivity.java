package com.example.anemia.Menu;

import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.anemia.R;

import java.util.Random;

public class KuisActivity extends AppCompatActivity {

//    public int n = 15;
//    public static int[] Xn;
//    public int Xn0;
//    public int i;
//    public int a;
//    public int c;
//    public int m = 10;
//    public int Acak;
    RadioGroup grupoption;
    RadioButton optiona, optionb, optionc,optiond;
    TextView soal;
    Button buttonnext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

        grupoption = findViewById(R.id.rgop);
        optiona = findViewById(R.id.optiona);
        optionb = findViewById(R.id.optionb);
        optionc = findViewById(R.id.optionc);
        optiond = findViewById(R.id.optiond);
    }

//    public void AcakKuis(){
//    Xn = new int[n];
//    Random b = new Random();
//    Xn0 = b.nextInt(m - 0 )+0;
//
//    for (i = 1; i <= 11; i++){
//        if (i==1){
//            Xn[i] = ( a * Xn0 + c ) % m;
//        }
//        else if (i > 1 && i <= 10){
//            Xn[i] = (a * Xn[i-1] + c) % m;
//        }
//        else {
//            Log.w("LCM Selesai","selesai");
//            break;
//        }
//        Acak = Xn[i];
//
//    }
//


//}

}
