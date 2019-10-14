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
    Button btnhome, btnreload, btnmateri;
    String hasilakhir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        btnhome = findViewById(R.id.home);
        btnmateri = findViewById(R.id.belajar);
        btnreload = findViewById(R.id.ulangkuis);

        skor = findViewById(R.id.skore);
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
                Intent b = new Intent(getApplicationContext(), KuisActivity.class);
                startActivity(b);
            }
        });
    }
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Tidak bisa kembali ke kuis. Silahkan tekan tombol yang telah disediakan", Toast.LENGTH_SHORT).show();
    }
}

