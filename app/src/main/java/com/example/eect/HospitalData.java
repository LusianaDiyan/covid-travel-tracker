package com.example.eect;

import java.util.ArrayList;

public class HospitalData {
    public static String[][] data = new String[][]{
            {"General Hospital Dr. Soetomo", "Jl. Mayjen Prof. Dr. Moestopo No.6-8, Airlangga, Kec. Gubeng, Kota SBY, Jawa Timur 60286","(031) 5501078"},
            {"Rumah Sakit Khusus Infeksi Universitas Airlangga","Kampus C Unair, Jl. Mulyorejo, Mulyorejo, Kec. Mulyorejo, Kota SBY, Jawa Timur 60115"," (031) 5961389"},
            {"Rumah Sakit Katholik Saint Vincentius a Paulo (RKZ) Surabaya","Jl. Diponegoro No.51, Darmo, Kec. Wonokromo, Kota SBY, Jawa Timur 60241","(031) 5677562"},
            {"Rumah Sakit Adi Husada Undaan Wetan","Jl. Undaan Wetan No.40-44, Ketabang, Kec. Genteng, Kota SBY, Jawa Timur 60272", " (031) 5318000"},
            {"Rumah Sakit Primasatya Husada Citra (PHC) Surabaya", "Jl. Prapat Kurung Selatan No.1, Tanjung Perak, Kec. Pabean Cantian, Kota SBY, Jawa Timur 60165", "(031) 3294801"},
            {"Rumah Sakit Umum Daerah Bhakti Dharma Husada", "Jl. Kendung No.115 - 117, Sememi, Kec. Benowo, Kota SBY, Jawa Timur 60198", "(031) 7409135"},
            {"Rumah Sakit Islam Jemursari Surabaya", "Jl. Raya Jemursari No.51-57, Jemur Wonosari, Kec. Wonocolo, Kota SBY, Jawa Timur 60237", "(031) 8471877"},
            {"Rumah Sakit Siloam Surabaya", "Jl. Raya Gubeng No.70, Gubeng, Kec. Gubeng, Kota SBY, Jawa Timur 60281", "(031) 99206900"},
            {"Rumah Sakit Umum Haji Surabaya", "Jl. Manyar Kertoadi, Klampis Ngasem, Kec. Sukolilo, Kota SBY, Jawa Timur 60116", "(031) 5924000"},
            {"Rumah Sakit Premier Surabaya", "Jl. Nginden Intan Barat No.B, Ngenden Jangkungan, Kec. Sukolilo, Kota SBY, Jawa Timur 60118", "(031) 5993211"},
            {"Rumah Sakit Husada Utama Surabaya","Jl. Mayjen Prof. Dr. Moestopo No.31-35, Pacar Keling, Kec. Tambaksari, Kota SBY, Jawa Timur 60131","(031) 5018335"},
            {"Rumah Sakit Bhayangkara Tk. II H.S. Samsoeri Mertojoso","Jl. Ahmad Yani No.116, Ketintang, Kec. Gayungan, Kota SBY, Jawa Timur 60231", "(031) 8292227"},
            {"Rumah Sakit Manyar Medical Centre", "Jl. Raya Manyar No.9, Manyar Sabrangan, Kec. Mulyorejo, Kota SBY, Jawa Timur 60284", "(031) 33311188"},
            {"Rumah Sakit National Hospital", "Jl. Boulevard Famili Sel. No.Kav.1, Babatan, Kec. Wiyung, Kota SBY, Jawa Timur 60227", "(031) 2975777"},
            {"Rumah Sakit Royal Surabaya","Jl. Rungkut Industri I No.1, Kendangsari, Kec. Tenggilis Mejoyo, Kota SBY, Jawa Timur 60292","(031) 8476111"},
            {"Rumah Sakit Tk. III Brawijaya", "Jl. Kesatriyan No.17, Sawunggaling, Kec. Wonokromo, Kota SBY, Jawa Timur 60242", "(031) 5670650"},
            {"Rumah Sakit Angkatan Laut Dr. Ramelan","Jl. Gadung No.1, Jagir, Kec. Wonokromo, Kota SBY, Jawa Timur 60244","(031) 8438153"},
            {"Rumah Sakit Jiwa Menur Surabaya","Jl. Raya Menur No.120, RT.009/RW.01, Kertajaya, Kec. Gubeng, Kota SBY, Jawa Timur 60282","(031) 5021635"},
            {"Rumah Sakit Umum Daerah Dr. Mohammad Soewandhie Surabaya", "Jl. Tambak Rejo No.45-47, Tambakrejo, Kec. Simokerto, Kota SBY, Jawa Timur 60142","(031) 3717141"},
            {"RSUD dr. Iskak Tulungagung","Jl. Dr. Wahidin Sudiro Husodo, Kedung Taman, Kedungwaru, Kec. Kedungwaru, Kabupaten Tulungagung, Jawa Timur 66223","(0355) 322609"},
            {"Dr.Soedono Hospital Madiun", "Jl. Dr. Sutomo No.59, Kartoharjo, Kec. Kartoharjo, Kota Madiun, Jawa Timur 63117", " (0351) 454657"},
            {"RSUD Kabupaten Kediri", "Jl. Pahlawan Kusuma Bangsa No.1, Cangkring, Pelem, Pare, Kediri, East Java 64213", " (0354) 391718"},
            {"RSUD Dr. Saiful Anwar Malang", "Jl. Jaksa Agung Suprapto No.2, Klojen, Kec. Klojen, Kota Malang, Jawa Timur 65111", " (0341) 362101"},
            {"Dr. R. Sosodoro Djatikoesoemo Hospital", "Jl. Veteran No.36, Jambean, Sukorejo, Kec. Bojonegoro, Kabupaten Bojonegoro, Jawa Timur 62115", "(0353) 3412133"},
            {"Regional General Hospital Sidoarjo", "Jl. Mojopahit No.667, Sidowayah, Celep, Kec. Sidoarjo, Kabupaten Sidoarjo, Jawa Timur 61215", "(031) 8961649"},
            {"Hospital Dr. R. Koesma", "Jalan Doktor Wahidin Sudirohusodo No.800, Sidorejo, Kecamatan Tuban, Jl. Dr. Wahidin Sh Gg. Bima No.800, Sidorejo, Kec. Tuban, Kabupaten Tuban", " (0356) 321010"},
            {"RSUD Pare Kediri","Jl. Pahlawan Kusuma Bangsa No. 1, Cangkring, Pelem, Pare, Kediri, Jawa Timur 64213", "0354-391718"},
            {"RSUD dr. Soebandi Jember","Jl. Dr. Soebandi No. 124, Cangkring, Patrang, Kec. Patrang, Kab. Jember, Jawa Timur 68111","0331-487441"}
    };

    public static ArrayList<hospital> getListData(){
        ArrayList<hospital> list = new ArrayList<>();
        for (String[] aData : data){
            hospital host = new hospital();
            host.setNameHos(aData[0]);
            host.setAddress(aData[1]);
            host.setCall(aData[2]);

            list.add(host);
        }
        return list;
    }
}
