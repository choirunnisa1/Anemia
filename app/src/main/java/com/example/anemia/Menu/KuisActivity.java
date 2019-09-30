package com.example.anemia.Menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.anemia.DataSoal;
import com.example.anemia.R;
import com.example.anemia.SkorActivity;

import java.util.ArrayList;
import java.util.Random;

public class KuisActivity extends AppCompatActivity {

    DataSoal dataSoal;
    double skor, benar;
    RadioGroup grupoption;
    Button optiona, optionb, optionc, optiond;
    TextView no_soal, tv_soal;
//    Button buttonnext;
    String jawaban;

    ArrayList<Integer> randomSoal;
    int indexKuis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

        randomSoal = new ArrayList<>();
        indexKuis = 0;

//        grupoption = findViewById(R.id.rgop);
        tv_soal = findViewById(R.id.soal);
        no_soal = findViewById(R.id.no);
        optiona = findViewById(R.id.optiona);
        optionb = findViewById(R.id.optionb);
        optionc = findViewById(R.id.optionc);
        optiond = findViewById(R.id.optiond);
//        buttonnext = findViewById(R.id.submit);
        dataSoal = new DataSoal();

        lcm();

        cekJawaban();


//        buttonnext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (grupoption.getCheckedRadioButtonId() == -1) {
//                    Toast.makeText(KuisActivity.this, "Belum ada yang dipilih", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                endQuis();
//                cekJawaban();
//            }
//        });
    }


    public void lcm() {
        int i;
        int n = 20;
        int a = 13;
        int m = 23;
        int c = 5;
        int Xn0;
        int[] Xn = new int[n];

        Random b = new Random();
        Xn0 = b.nextInt(m - 1) + 1;
        Log.d("Xn0 = ",String.valueOf(Xn0));

        for (i = 1; i <= 11; i++) {

            if (i == 1) {
                Xn[i] = (a * Xn0 + c) % m;
            } else if (i > 1 && i <= 10) {
                Xn[i] = (a * Xn[i - 1] + c) % m;
            } else {
                Log.d("Algoritma LCM", "LCM Selesai");
                break;
            }

            if (Xn[i] == 0) Xn[i] = 1;

            randomSoal.add(Xn[i]);
        }

        updateSoal();

        Log.d("RANDOMSOAL", randomSoal.toString());
    }

    public void cekJawaban(){
        optiona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endQuis();
                if (optiona.getText()==jawaban){
                    benar();
                }else{
                    Toast.makeText(getApplicationContext(), "Anda salah", Toast.LENGTH_SHORT).show();
                    salah();
                    updateSoal();
                }
            }
        });

        optionb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endQuis();
                if (optionb.getText()==jawaban){
                    benar();
                }else{
                    Toast.makeText(getApplicationContext(), "Anda salah", Toast.LENGTH_SHORT).show();
                    salah();
                    updateSoal();
                }
            }
        });

        optionc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endQuis();
                if (optionc.getText()==jawaban){
                    benar();
                }else{
                    Toast.makeText(getApplicationContext(), "Anda salah", Toast.LENGTH_SHORT).show();
                    salah();
                    updateSoal();
                }
            }
        });

        optiond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endQuis();
                if (optiond.getText()==jawaban){
                    benar();
                }else{
                    Toast.makeText(getApplicationContext(), "Anda salah", Toast.LENGTH_SHORT).show();
                    salah();
                    updateSoal();
                }
            }
        });

    }

    public void updateSoal() {
//        grupoption.clearCheck();
        if (indexKuis == 10) {
            skor = (benar * 10);
            String skorx = String.valueOf(skor);
            Intent i = new Intent(KuisActivity.this, SkorActivity.class);
            i.putExtra("skorakhir", skorx);
            startActivity(i);
        } else {
            no_soal.setText("" + (indexKuis + 1));
            tv_soal.setText(dataSoal.getSoal(randomSoal.get(indexKuis) - 1));
            optiona.setText(dataSoal.getOpsi1(randomSoal.get(indexKuis) - 1));
            optionb.setText(dataSoal.getOpsi2(randomSoal.get(indexKuis) - 1));
            optionc.setText(dataSoal.getOpsi3(randomSoal.get(indexKuis) - 1));
            optiond.setText(dataSoal.getOpsi4(randomSoal.get(indexKuis) - 1));
            jawaban = dataSoal.getJawaban(randomSoal.get(indexKuis) - 1);
        }
    }
//

    public void benar() {
        benar = benar + 1;
        Toast.makeText(getApplicationContext(), "Anda benar", Toast.LENGTH_SHORT).show();
        updateSoal();
    }

    public void endQuis() {
        indexKuis = indexKuis + 1;
    }

    public void salah() {
        benar = benar + 0;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Tidak bisa kembali ke kuis. Silahkan selesaikan terlebih dahulu", Toast.LENGTH_SHORT).show();
    }



}
