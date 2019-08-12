package com.example.anemia.Menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.anemia.MainActivity;
import com.example.anemia.Materi.AnemiaActivity;
import com.example.anemia.Materi.GejalaActivity;
import com.example.anemia.Materi.JenisAnemiaActivity;
import com.example.anemia.Materi.KomplikasiActivity;
import com.example.anemia.Materi.PemeriksaanDiagActivity;
import com.example.anemia.Materi.PengobatanActivity;
import com.example.anemia.R;

public class MateriActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_anemia,btn_jenis,btn_komplikasi,btn_gejala,btn_pengobatan,btn_pemeriksaan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        btn_anemia = findViewById(R.id.anemia);
        btn_anemia.setOnClickListener(this);

        btn_gejala = findViewById(R.id.gejala);
        btn_gejala.setOnClickListener(this);

        btn_jenis = findViewById(R.id.klasifikasi);
        btn_jenis.setOnClickListener(this);

        btn_komplikasi = findViewById(R.id.komplikasi);
        btn_komplikasi.setOnClickListener(this);

        btn_pemeriksaan = findViewById(R.id.pemeriksaan);
        btn_pemeriksaan.setOnClickListener(this);

        btn_pengobatan = findViewById(R.id.pengobatan);
        btn_pengobatan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.anemia:
                Intent anemiaIntent = new Intent(MateriActivity.this, AnemiaActivity.class);
                startActivity(anemiaIntent);
                break;
            case R.id.gejala:
                Intent gejalaIntent = new Intent(MateriActivity.this, GejalaActivity.class);
                startActivity(gejalaIntent);
                break;
            case R.id.klasifikasi:
                Intent klasifikasiIntent = new Intent(MateriActivity.this, JenisAnemiaActivity.class);
                startActivity(klasifikasiIntent);
                break;
            case R.id.komplikasi:
                Intent komplikasiIntent = new Intent(MateriActivity.this, KomplikasiActivity.class);
                startActivity(komplikasiIntent);
                break;
            case R.id.pemeriksaan:
                Intent pemeriksaanIntent = new Intent(MateriActivity.this, PemeriksaanDiagActivity.class);
                startActivity(pemeriksaanIntent);
                break;
            case R.id.pengobatan:
                Intent pengobatanIntent = new Intent(MateriActivity.this, PengobatanActivity.class);
                startActivity(pengobatanIntent);
                break;
        }
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }}
