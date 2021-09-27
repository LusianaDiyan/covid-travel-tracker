package com.example.eect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TravelhistActivity extends AppCompatActivity {
    private String title = "Travel History";
    private RecyclerView recyclerView;
    private ArrayList<Travel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travelhist);
        setActionBarTitle(title);

        recyclerView = findViewById(R.id.rv_travel);
        recyclerView.setHasFixedSize(true);

        list.addAll(TravelData.getListData());
        showRecyclerList();
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showRecyclerList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CardViewTravelAdapter cardViewTravelAdapter = new CardViewTravelAdapter(list);
        recyclerView.setAdapter(cardViewTravelAdapter);
    }
}
