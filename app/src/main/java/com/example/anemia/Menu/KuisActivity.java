package com.example.anemia.Menu;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    //    public int n = 15;
//    public static int[] Xn;
//    public int Xn0;
//    public int i;
//    public int a;
//    public int c;
//    public int m = 10;
//    public int Acak;
    DataSoal dataSoal;
    double skor, benar;
    RadioGroup grupoption;
    RadioButton optiona, optionb, optionc, optiond;
    TextView no_soal, tv_soal;
    Button buttonnext;
    String jawaban;
    public static int[] Xn;
    public int Xn0;
    public int i, a, c, m;
    public int soalQuis;
    public int nilaiAcak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);


        grupoption = findViewById(R.id.rgop);
        tv_soal = findViewById(R.id.soal);
        no_soal = findViewById(R.id.no);
        optiona = findViewById(R.id.optiona);
        optionb = findViewById(R.id.optionb);
        optionc = findViewById(R.id.optionc);
        optiond = findViewById(R.id.optiond);
        buttonnext = findViewById(R.id.submit);
        dataSoal = new DataSoal();

        lcm();
        update();
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cekJawaban();
            }
        });
    }
    public void lcm() {
        int n;
        n = 20;
        a = 13;
        m = 23;
        c = 5;
        Xn = new int[n];

        Random b = new Random();
        Xn0 = b.nextInt(m - 0) + 0;

        for (i = 1; i == 1; i++) {

            if (i == 1) {
                Xn[i] = (a * Xn0 + c) % m;
            } else if (i > 1 && i == 1) {
                Xn[i] = (a * Xn[i - 1] + c) % m;
            } else {
                Log.d("Algoritma LCM", "LCM Selesai");
                break;
            }

            nilaiAcak = Xn[i];

            Log.d("Hasil Algoritma LCM", "Xn[" + i + "] = " + nilaiAcak);
        }
    }


    public void update() {
        grupoption.clearCheck();
        Log.d("Nilai Acak", ">> " + nilaiAcak);
        nilaiAcak = nilaiAcak - 1;
        if (soalQuis == 10) {
            skor = (benar * 10);
            String skorx = String.valueOf(skor);
            Intent i = new Intent(KuisActivity.this, SkorActivity.class);
            i.putExtra("skorakhir", skorx);
            startActivity(i);
        } else {
            no_soal.setText(dataSoal.getId(nilaiAcak) + ">> " + i);
            tv_soal.setText(dataSoal.getSoal(nilaiAcak));
            optiona.setText(dataSoal.getOpsi1(nilaiAcak));
            optionb.setText(dataSoal.getOpsi2(nilaiAcak));
            optionc.setText(dataSoal.getOpsi3(nilaiAcak));
            optiond.setText(dataSoal.getOpsi4(nilaiAcak));
            jawaban = dataSoal.getJawaban(nilaiAcak);
        }
    }
//        if (z == 10){
//            skor = (benar*10);
//            String skorx = String.valueOf(skor);
//            Intent i = new Intent(KuisActivity.this, SkorActivity.class);
//            i.putExtra("skorakhir",skorx);
//            startActivity(i);
//        }else{
//            Random random = new Random();
//            ambil = random.nextInt(10);
//            tv_soal.setText(dSoal.getSoal(ambil));
//            optiona.setText(dSoal.getOpsi1(ambil));
//            optionb.setText(dSoal.getOpsi2(ambil));
//            optionc.setText(dSoal.getOpsi3(ambil));
//            optiond.setText(dSoal.getOpsi4(ambil));
//            jawaban = dSoal.getJawaban(ambil);
//        }
//        z++;
//    }

    public void cekJawaban() {
        lcm();
        if (optiona.isChecked()) {
            if (optiona.getText().toString().equals(jawaban)) {
                benarloh();
                endQuis();
            } else {
                Toast.makeText(getApplicationContext(), "Anda salah", Toast.LENGTH_SHORT).show();
                salah();
                update();
                endQuis();
            }
        }
        if (optionb.isChecked()) {
            if (optionb.getText().toString().equals(jawaban)) {
                benarloh();
                endQuis();
            } else {
                Toast.makeText(getApplicationContext(), "Anda salah", Toast.LENGTH_SHORT).show();
                salah();
                update();
                endQuis();
            }
        }
        if (optionc.isChecked()) {
            if (optionc.getText().toString().equals(jawaban)) {
                benarloh();
                endQuis();
            } else {
                Toast.makeText(getApplicationContext(), "Anda salah", Toast.LENGTH_SHORT).show();
                salah();
                update();
                endQuis();
            }
        }
        if (optiond.isChecked()) {
            if (optiond.getText().toString().equals(jawaban)) {
                benarloh();
                endQuis();
            } else {
                Toast.makeText(getApplicationContext(), "Anda salah", Toast.LENGTH_SHORT).show();
                salah();
                update();
                endQuis();
            }
        }
    }

    public void benarloh() {
        benar = benar + 1;
        Toast.makeText(getApplicationContext(), "Anda benar", Toast.LENGTH_SHORT).show();
        update();
    }

    public void endQuis(){
        soalQuis = soalQuis + 1;
    }

    public void salah() {
        benar = benar + 0;
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
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Tidak bisa kembali ke kuis. Silahkan selesaikan terlebih dahulu", Toast.LENGTH_SHORT).show();
    }
}
