package com.example.anemia;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

import static java.util.concurrent.ThreadLocalRandom.current;

public class DataSoal {
    private String pertanyaan[]={
            "Anemia merupakan suatu penyakit yang disebabkan kurangnya...",
            "Jenis penyakit anemia yang disebabkan oleh kurangnya zat besi yang berperan dalam pembentukkan hemoglobin adalah..",
            "Berikut merupakan komplikasi yang dialami bayi yang dilahirkan oleh ibu yang mengindap anemia, kecuali",
            "Gejala anemia dapat digolongkan menjadi berapa jenis?",
            "Salah satu pengobatan yang dapat dilakukan oleh pengidap anemia adalah",
            "Berikut makanan yang dianjurkan dikonsumsi oleh penderita anemia, kecuali...",
            "Yang paling rentan terserang anemia adakah",
            "Jenis pemeriksaan laboratorium untuk diagnosis anemia yang hanya dikerjakan atas indikasi khusus adalah",
            "Berikut yang bukan merupakan gejala umum anemia adalah",
            "Kelelahan, pucat, mudah memar, pendafarahan gusi merupakan gejala dari anemia",
    };

    private String jawaban[]={
            "Hemoglobin dalam Darah",
            "Anemia Defisiensi Besi",
            "Berat badan bayi di atas normal",
            "3 jenis",
            "Transfusi Darah",
            "Jagung",
            "Wanita produktif(masih mengalami menstruasi)",
            "Pemeriksaaan Khusus",
            "Mual",
            "Aplastik",
    };

    private String opsi[][]={
            {"Hemoglobin dalam Darah","Mineral","Kandungan Zat Besi","Tekanan Darah"} ,
            {"Anemia Hemolitik","Anemia Megaloblastik","Anemia Defisiensi Besi","Anemia Kronis"},
            {"Kelahiran prematur sebelum minggu ke-37","Hasil Tes Kemampuan Mental yang Kurang","Masalah pada kandungan Zat besi dalam darah","Berat badan bayi di atas normal"},
            {"4 jenis","3 jenis","5 jenis","2 jenis"},
            {"Olahraga yang cukup","Suplemen nafsu makan","Transfusi Darah","Berjemur"},
            {"Daging","Bayam","Kacang-kacangan","Jagung"},
            {"Anak-anak","Laki-laki dewasa","Wanita produktif(masih mengalami menstruasi)","Semua kalangan"},
            {"Pemeriksaan spesial","Pemeriksaan sumsum tulang","Pemeriksaan darah seri anemia","Pemeriksaan Khusus"},
            {"Letih","Lesu","Mual","Lunglai"},
            {"Bulan Sabit","Hemolitik","Megaloblastik","Aplastik"},


    };

    public  String getSoal(int a){
        String soal = pertanyaan[a];
        return  soal;
    }

    public String getOpsi1(int a){
        String pila = opsi[a][0];
        return pila;
    }
    public String getOpsi2(int a){
        String pilb = opsi[a][1];
        return pilb;
    }
    public String getOpsi3(int a){
        String pilc = opsi[a][2];
        return pilc;
    }

    public String getOpsi4(int a){
        String pilc = opsi[a][3];
        return pilc;
    }

    public String getJawaban(int a){
        String jwbn = jawaban[a];
        return jwbn;
    }
}