package com.example.anemia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.anemia.Menu.KuisActivity;
import com.example.anemia.Menu.MateriActivity;

import java.util.Random;

public class SkorActivity extends AppCompatActivity {
    TextView skor;
    Button btnhome, btnreload,btnmateri;
    String hasilakhir;
    int n;
    public static int[] Xn;
    public int Xn0;
    public int i,a,c,m;
    public int nilaiAcak;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        btnhome = findViewById(R.id.home);
        btnmateri = findViewById(R.id.belajar);
        btnreload = findViewById(R.id.ulangkuis);

        skor = findViewById(R.id.skornya);
        hasilakhir = getIntent().getStringExtra("skorakhir");

        skor.setText(hasilakhir);

        btnmateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MateriActivity.class);
                startActivity(i);
            }
        });

        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.addCategory(Intent.CATEGORY_HOME);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

        btnreload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lcm();
            }
        });
    }
    @Override
    public void onBackPressed(){
        Toast.makeText(getApplicationContext(), "Tidak bisa kembali ke kuis. Silahkan tekan tombol yang telah disediakan", Toast.LENGTH_SHORT).show();
    }
    public void lcm() {
        n = 20;
        a = 11;
        m = 10;
        c = 5;
        Xn = new int[n];

        Random b = new Random();
        Xn0 = b.nextInt(m - 0) + 0;

        for (i = 1; i <= 11; i++) {

            if (i == 1) {
                Xn[i] = (a * Xn0 + c) % m;
            } else if (i > 1 && i <= 10) {
                Xn[i] = (a * Xn[i - 1] + c) % m;
            } else {
                Log.d("Algoritma LCM", "LCM Selesai");
                break;
            }

            nilaiAcak = Xn[i];

            Log.d("Algoritma LCM 2","Xn[" + i + "] = " + nilaiAcak);
        }
    }
}
