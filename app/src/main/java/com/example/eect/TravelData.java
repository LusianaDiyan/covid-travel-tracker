package com.example.eect;

import java.util.ArrayList;
import java.util.Collection;

public class TravelData {
    public static String[][] data = new String[][]{
            {"Hypermart - Royal Plaza", "Royal Plaza, Jl. Ahmad Yani No.16-18, Pada tanggal 4 Mei 2020"},
            {"KFC Ahmad Yani Surabaya","Jl. Ahmad Yani No.76 - 86, Ketintang, Pada tanggal 3 Mei 2020"},
            {"Kober Mie Setan","Jl. Semolowaru Utara No.12, RT.004/RW.09, Semolowaru, Kota SBY Pada tanggal 2 Mei 2020"},
            {"ITS Stadium","Jl. Teknik Mesin No.173, Keputih, Pada tanggal 30 April 2020"},
            {"Asrama Mahasiswa ITS","Asrama Mahasiswa ITS, Jl. Teknik Elektro, Keputih, Sukolilo, Pada tanggal 28 April 2020"},
            {"Sakinah Supermarket Surabaya","Jl. Arief Rahman Hakim No.32, Keputih, Pada tanggal 28 April 2020"},
            {"Awal Cerita Kopi 2.0","Jl. Keputih Tegal No.72, Keputih, Kec. Sukolilo, Pada tanggal 27 April 2020"}
    };

    /*public static ArrayList<Travel> getListData(){
        ArrayList<Travel> list = new ArrayList<>();
        for (String[] aData : data){
            Travel travel = new Travel();
            travel.setName(aData[0]);
            travel.setDetail(aData[1]);

            list.add(travel);
        }
        return list();
    }*/

    public static ArrayList<Travel> getListData() {
        ArrayList<Travel> list = new ArrayList<>();
        for (String[] aData : data){
            Travel travel = new Travel();
            travel.setName(aData[0]);
            travel.setDetail(aData[1]);

            list.add(travel);
        }
        return list();
    }

    private static ArrayList<Travel> list() {
        ArrayList<Travel> list = new ArrayList<>();
        for (String[] aData : data){
            Travel travel = new Travel();
            travel.setName(aData[0]);
            travel.setDetail(aData[1]);

            list.add(travel);
        }
        return list;
    }
}
