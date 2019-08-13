package com.example.anemia;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

import static java.util.concurrent.ThreadLocalRandom.current;

public class DataSoal {
    // Jumlah Soal yang ingin ditampilkan
    int jumlahSoalTampil = 10;

    static void shuffle(int[] array) {
        int n = array.length;
        Random random = new Random();
        // Loop over array.
        for (int i = 0; i < array.length; i++) {
            // Get a random index of the array past the current index.
            // ... The argument is an exclusive bound.
            //     It will not go past the array's end.
            int randomValue = i + random.nextInt(n - i);
            // Swap the random element with the present element.
            int randomElement = array[randomValue];
            array[randomValue] = array[i];
            array[i] = randomElement;
        }
    }
    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "5 - 1 =",
            "7 - 4 =",
            "9 - 7 =",
            "6 - 4 =",
            "9 - 3 =",

    };

    //----------------- Algoritma Fisher Yates
    public ArrayList<Integer> fisherYates(){
        // Menampilkan urutan awal soal dalam Log Warning
        Log.w("FisherYates", "indexAwalSoal"+" = "+getIndexArrayString(pertanyaan));

        // Menampilkan jumlah soal yang ditampilkan
        Log.w("jumlahSoalDitampilkan", String.valueOf(jumlahSoalTampil));
        ArrayList<Integer> hasil = new ArrayList<>();

        ArrayList<Integer> awal = new ArrayList<>();

        for (int i = 0; i < pertanyaan.length ; i++) {
            awal.add(i);
        }

        // Generate Random Index
        //for (int i = 0; i < pertanyaan.length ; i++) {
        for (int i = 0; i < jumlahSoalTampil ; i++) {

            //　Mengacak index yang digunakan (Mengambil nilai acak)
            Integer indexNomor = new Random().nextInt(awal.size());

            // Menambahkan hasil acakan pada array baru
            hasil.add(awal.get(indexNomor));

            // Menampilkan urutan soal setelah diacak dalam Log Warning
            Log.w("FisherYates","indexSoalAcak Ke-"+String.valueOf(i+1)+ " = "+getIndexArrayListInteger(hasil));

            awal.remove(indexNomor);
        }

        return hasil;
    }

    // Implementing Fisher–Yates shuffle
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    static void shuffleArray(int[] ar)
    {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
    //membuat array untuk pilihan jawaban
    private String pilihanJawaban[][] = {
            {"4","7","2"},
            {"2","3","4"},
            {"1","2","3"},
            {"2","4","6"},
            {"1","5","6"},
    };

    //membuat array untuk jawaban benar
    private String jawabanBenar[] = {
            "4",
            "3",
            "2",
            "2",
            "6",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }

    public String[] getPertanyaanAwal(){
        return pertanyaan;
    }

    public String getIndexArrayString(String[] array){
        int nArray = array.length;
        String indexArray = "";
        for (int i = 0; i < nArray; i++) {
            indexArray = indexArray + String.valueOf(i);
            if (i < nArray-1)
                indexArray = indexArray + ", ";
        }
        return indexArray;
    }

    public String getIndexArrayListInteger(ArrayList<Integer> arrayList){
        int nArray = arrayList.size();
        String indexArray = "";
        for (int i = 0; i < nArray; i++) {
            indexArray = indexArray + String.valueOf(arrayList.get(i));
            if (i < nArray-1)
                indexArray = indexArray + ", ";
        }
        return indexArray;
    }


}
