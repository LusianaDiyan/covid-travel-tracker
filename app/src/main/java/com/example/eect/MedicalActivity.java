package com.example.eect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MedicalActivity extends AppCompatActivity {
    private String title = "Rumah Sakit Rujukan COVID-19";
    private RecyclerView recyclerView;
    private ArrayList<hospital> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);
        setActionBarTitle(title);

        recyclerView = findViewById(R.id.rv_hospital);
        recyclerView.setHasFixedSize(true);

        list.addAll(HospitalData.getListData());
        showRecyclerList();
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showRecyclerList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CardviewHospitalAdapter cardviewHospitalAdapter = new CardviewHospitalAdapter(list);
        recyclerView.setAdapter(cardviewHospitalAdapter);
    }
}
