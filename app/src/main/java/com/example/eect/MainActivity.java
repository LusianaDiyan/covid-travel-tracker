package com.example.eect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    ImageView bgapp, clover;
    LinearLayout textsplash, texthome, menus;
    Animation frombottom;

    ImageView medical, travel, diagnosis, quarantin, covid, medicine;
    LinearLayout test, news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);


        bgapp = (ImageView) findViewById(R.id.bgapp);
        clover = (ImageView) findViewById(R.id.clover);
        textsplash = (LinearLayout) findViewById(R.id.textsplash);
        texthome = (LinearLayout) findViewById(R.id.texthome);
        menus = (LinearLayout) findViewById(R.id.menus);

        bgapp.animate().translationY(-1900).setDuration(800).setStartDelay(300);
        clover.animate().alpha(0).setDuration(800).setStartDelay(600);
        textsplash.animate().translationY(140).alpha(0).setDuration(800).setStartDelay(300);

        texthome.startAnimation(frombottom);
        menus.startAnimation(frombottom);

        medical = findViewById(R.id.medical);
        medical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MedicalActivity.class);
                startActivity(intent);
            }
        });

        travel = findViewById(R.id.travel);
        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TravelhistActivity.class);
                startActivity(intent);
            }
        });

        diagnosis = findViewById(R.id.diagnose);
        diagnosis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DiagnosisActivity.class);
                startActivity(intent);
            }
        });

        quarantin = findViewById(R.id.quarantine);
        quarantin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QuarantineActivity.class);
                startActivity(intent);
            }
        });

        covid = findViewById(R.id.datacovid);
        covid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DataActivity.class);
                startActivity(intent);
            }
        });

        medicine = findViewById(R.id.medicine);
        medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MedicineActivity.class);
                startActivity(intent);
            }
        });

        test = findViewById(R.id.tescovid);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TesActivity.class);
                startActivity(intent);
            }
        });

        news = findViewById(R.id.news);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ArtikelActivity.class);
                startActivity(intent);
            }
        });
    }
}
