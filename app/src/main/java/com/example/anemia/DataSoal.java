package com.example.anemia;

public class DataSoal {
    private String pertanyaan[]={
            "Yang menyebabkan penderita anemia rentan terhadap penyakit adalah karena kekurangan....",
            "Kortikosteroid merupakan salah satu cara untuk mengobati anemia, di mana fungsi obat ini adalah untuk...",
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
            "Glossitis merupakan gejala dari jenis anemia...",
            "Berikut merupakan komplikasi dari anemia, kecuali",
            "Selain zat besi dan asam folat, zat gizi lain yang berperan penting dalam pembuatan hemoglobin adalah",

            "Secara garis besar patogenesis anemia penyakit kronis dititikberatkan pada 3 abnormalitas utama, salah satunya merupakan ketahanan hidup eritrosit yang memendek akibat terjadinya lisis......lebih dini",
            "Di negara barat kadar hemoglobin paling rendah untuk laki-laki adalah",
            "Jenis pemeriksaan anemia yang dibutuhkan untuk diagnosis definitif pada beberapa jenis anemia adalah",
            "Bentuk anemia derajat ringan sampai sedang yang terjadi akibat infeksi kronis, peradangan trauma atau penyakit neoplastik yang telah berlangsung 1–2 bulan dan tidak disertai penyakit hati, ginjal dan endokrin adalah...",
            "Salah satu pemeriksaan yang hanya dikerjakan atas indikasi khusus pada jenis anemia megaloblastik adalah...",

            "Fungsi dari hemoglobin adalah...",
            "Berikut merupakan jenis makanan yang dapat membantu mencegah anemia, kecuali...",
            "Salah satu gejala anemia defisiensi besi adalah pica. Apakah yang dimaksud dengan pica?",
            "Erythropoietin adalah obat yang membantu sumsum tulang membuat lebih banyak...",


    };

    private String jawaban[]={
            "Zat Besi",
            "Menekan sistem kekebalan tubuh",
            "Hemoglobin dalam Darah",
            "Anemia Defisiensi Besi",
            "Berat badan bayi di atas normal",

            "3 jenis",
            "Transfusi Darah",
            "Jagung",
            "Remaja Putri",
            "Pemeriksaaan Khusus",

            "Mual",
            "Aplastik",
            "Megaloblastik",
            "Gangguan Pernapasan",
            "Vitamin B12",

            "Eritrosit",
            "14g/l",
            "Pemeriksaan sumsum tulang",
            "Anemia Kronis",
            "Tes supresi deoksiuridin",

            "Pengangkut oksigen dari paru-paru ke seluruh tubuh",
            "Makanan yang kaya akan zat kalsium",
            "Suka pilih-pilih makanan",
            "Sel darah",
    };

    private String opsi[][]={
            {"Zat Besi","Hemoglobin","Oksigen","Karbohidrat"},
            {"Suplemen zat besi","Menambah kandungan protein","Menekan sistem kekebalan tubuh","Membantu sumsum tulang Anda membuat lebih banyak sel darah"},
            {"Hemoglobin dalam Darah","Mineral","Protein","Tekanan Darah"} ,
            {"Anemia Hemolitik","Anemia Megaloblastik","Anemia Defisiensi Besi","Anemia Kronis"},
            {"Kelahiran prematur sebelum minggu ke-37","Hasil Tes Kemampuan Mental yang Kurang","Masalah pada kandungan Zat besi dalam darah","Berat badan bayi di atas normal"},

            {"4 jenis","3 jenis","5 jenis","2 jenis"},
            {"Olahraga yang cukup","Suplemen nafsu makan","Transfusi Darah","Berjemur"},
            {"Daging","Bayam","Kacang-kacangan","Jagung"},
            {"Anak-anak","Laki-laki dewasa","Remaja Putri","Semua kalangan"},
            {"Pemeriksaan spesial","Pemeriksaan sumsum tulang","Pemeriksaan darah seri anemia","Pemeriksaan Khusus"},

            {"Letih","Lesu","Mual","Lunglai"},
            {"Bulan Sabit","Hemolitik","Megaloblastik","Aplastik"},
            {"Megaloblastik","Defisiensi Besi","Kronis","Kehamilan"},
            {"Kematian","Gangguan Pernapasan","Kelelahan Berat","Gangguan Jantung"},
            {"Vitamin D","Fosfor","Vitamin B12","Kalsium"},

            {"Trombosit","Leukosit","Aplastik","Eritrosit"},
            {"14g/l","13g/l","12g/l","11g/l"},
            {"Pemeriksaan darah seri","Pemeriksaan sumsum tulang","Pemeriksaan khusus","Pemeriksaan penyaring"},
            {"Anemia Aplastik","Anemia Hemolitik","Anemia Kronis","Anemia Megaloblastik"},
            {"Tes supresi deoksiuridin","Bilirubin serum","Elektroforesis hemoglobin","Pengecatan besi pada sumsum tulang"},

            {"Memperlancar peredaran darah","Pengangkut oksigen dari paru-paru ke seluruh tubuh","Pengangkut karbondioksida dari paru-paru ke seluruh tubuh","Pengangkut electron di dalam proses pembentukan energi di dalam sel"},
            {"Makanan yang kaya akan zat kalsium","Makanan yang kaya akan zat besi","Makanan yang kaya akan asam folat","Makanan yang kaya akan vitamin B12"},
            {"Warna kulit yang pucat","Peradangan atau infeksi lidah","Suka pilih-pilih makanan","Sesak nafas"},
            {"Protein","Zat Besi","Sel tulang","Sel darah"},
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