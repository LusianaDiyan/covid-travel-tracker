package com.example.eect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class QuarantineActivity extends AppCompatActivity {
    LinearLayout tadarus, game, forum, radar, bansos, berita, hoax, edu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarantine);

        tadarus = findViewById(R.id.tadarus);
        tadarus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineActivity.this, TadarusActivity.class);
                startActivity(intent);
            }
        });

        game = findViewById(R.id.game);
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineActivity.this, GameActivity.class);
                startActivity(intent);
            }
        });

        forum = findViewById(R.id.forcov);
        forum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineActivity.this, ForumActivity.class);
                startActivity(intent);
            }
        });

        radar = findViewById(R.id.radar);
        radar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineActivity.this, RadarActivity.class);
                startActivity(intent);
            }
        });

        bansos = findViewById(R.id.bansos);
        bansos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineActivity.this, BansosActivity.class);
                startActivity(intent);
            }
        });

        berita = findViewById(R.id.berita);
        berita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineActivity.this, BeritaActivity.class);
                startActivity(intent);
            }
        });

        hoax = findViewById(R.id.hoax);
        hoax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineActivity.this, HoaxActivity.class);
                startActivity(intent);
            }
        });

        edu = findViewById(R.id.edukasi);
        edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineActivity.this, EdukasiActivity.class);
                startActivity(intent);
            }
        });
    }
}
