package com.example.eect;

public class SoalTes {
    public String pertanyaan[] = {
            "Apakah Anda mengalami salah satu dari yang berikut: Kesulitan bernafas yang parah (Bernafas dengan sangat cepat atau berbicara dalam satu kata), Nyeri dada yang parah, Sulit untuk bangun, Merasa kebingungan, Penurunan kesadaran",
            "Apakah Anda mengalami salah satu dari yang berikut: Nafas yang pendek saat istirahat, Ketidakmampuan untuk berbaring karena kesulitan bernafas, Kondisi kesehatan kronis yang anda alami dirasakan lebih berat karena kesulitan bernapas",
            "Apakah Anda mengalami salah satu dari yang berikut:Demam, Batuk, Bersin, Sakit Tenggorokan, Sulit Bernafas",
            "Apakah anda pernah muncul gejala sekitar 14 hari setelah travelling ke luar negeri? (China, Italy, Iran, Korea Selatan, Prancis, Spanyol, Jerman, USA) atau ke kota terjangkit (Jakarta, Bali, Solo, Yogyakarta, Pontianak, Manado, Bandung dll)?",
            "Apakah Anda memberikan perawatan atau melakukan kontak dekat dengan seseorang dengan COVID-19 (kemungkinan atau dikonfirmasi) saat mereka sakit (batuk, demam, bersin, atau sakit tenggorokan)?",
            "Apakah Anda memiliki kontak dekat dengan seseorang yang bepergian ke luar Negeri dalam 14 hari terakhir yang menjadi sakit (batuk, demam, bersin, atau sakit tenggorokan)?"
    };

    private String pilihanJawaban[][] = {
            {"YA","Tidak"},
            {"YA","Tidak"},
            {"YA","Tidak"},
            {"YA","Tidak"},
            {"YA","Tidak"},
            {"YA","Tidak"},
    };

    //membuat array untuk jawaban benar
    private String jawabanBenar[] = {
            "YA",
            "YA",
            "YA",
            "YA",
            "YA",
            "YA",
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

    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
