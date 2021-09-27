package com.example.eect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MedicineActivity extends AppCompatActivity {
    TextView nameuser, walletuser, review, network, plugins, myapps, mainmenus,
            pagetitle, pagesubtitle;

    Button btnguide;
    Animation atg, atgtwo, atgthree;
    ImageView imageView3;
    LinearLayout symptoms, contagion, prevention, prohibition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);

        atg = AnimationUtils.loadAnimation(this, R.anim.atg);
        atgtwo = AnimationUtils.loadAnimation(this, R.anim.atgtwo);
        atgthree = AnimationUtils.loadAnimation(this, R.anim.atgthree);

        nameuser = findViewById(R.id.nameuser);
        walletuser = findViewById(R.id.walletuser);

        imageView3 = findViewById(R.id.imageView3);

        review = findViewById(R.id.review);
        network = findViewById(R.id.network);
        plugins = findViewById(R.id.plugins);
        myapps = findViewById(R.id.myapps);
        mainmenus = findViewById(R.id.mainmenus);

        pagetitle = findViewById(R.id.pagetitle);
        pagesubtitle = findViewById(R.id.pagesubtitle);

        btnguide = findViewById(R.id.btnguide);

        btnguide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MedicineActivity.this,InformationActivity.class);
                startActivity(a);
            }
        });

        // pass an animation
        imageView3.startAnimation(atg);

        pagetitle.startAnimation(atgtwo);
        pagesubtitle.startAnimation(atgtwo);

        btnguide.startAnimation(atgthree);

        symptoms = findViewById(R.id.symp);
        symptoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MedicineActivity.this, SymptActivity.class);
                startActivity(intent);
            }
        });

        contagion = findViewById(R.id.contag);
        contagion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MedicineActivity.this, ContagionActivity.class);
                startActivity(intent);
            }
        });

        prevention = findViewById(R.id.prevention);
        prevention.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MedicineActivity.this, PreventionActivity.class);
                startActivity(intent);
            }
        });

        prohibition = findViewById(R.id.prohib);
        prohibition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MedicineActivity.this, ProhibitionActivity.class);
                startActivity(intent);
            }
        });
    }
}
