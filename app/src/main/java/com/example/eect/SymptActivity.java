package com.example.eect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class SymptActivity extends AppCompatActivity {
    TextView pagetitle, pagesubtitle;
    ImageView packagePlace;
    SeekBar packageRange;
    Animation atg, packageimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sympt);

        atg = AnimationUtils.loadAnimation(this, R.anim.atg);
        packageimg = AnimationUtils.loadAnimation(this, R.anim.packageimg);

        pagetitle = findViewById(R.id.pagetitle);
        pagesubtitle = findViewById(R.id.pagesubtitle);

        packagePlace = findViewById(R.id.sympt);

        packageRange = findViewById(R.id.packageRange);

        packageRange.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(progress == 25){
                    pagetitle.setText("Cough");
                    pagesubtitle.setText("It appears to spread from person to person among those in cloase contact");
                    packagePlace.setImageResource(R.drawable.cough);

                    // pass animation
                    packagePlace.startAnimation(packageimg);
                    pagetitle.startAnimation(atg);
                    pagesubtitle.startAnimation(atg);
                }
                else if(progress == 50){
                    pagetitle.setText("Headache");
                    pagesubtitle.setText("The severity of COVID-19 symptoms can range from very mild to severe");
                    packagePlace.setImageResource(R.drawable.headache);

                    // pass animation
                    packagePlace.startAnimation(packageimg);
                    pagetitle.startAnimation(atg);
                    pagesubtitle.startAnimation(atg);
                }
                else if(progress == 75){
                    pagetitle.setText("High Fever");
                    pagesubtitle.setText("People who are older or have existing chronic medical condition such as heart or lung disease");
                    packagePlace.setImageResource(R.drawable.highfever);

                    // pass animation
                    packagePlace.startAnimation(packageimg);
                    pagetitle.startAnimation(atg);
                    pagesubtitle.startAnimation(atg);
                }
                else if(progress == 100){
                    pagetitle.setText("Sore Troath");
                    pagesubtitle.setText("Breathlessness excited or tense, often to the point of holding the breath");
                    packagePlace.setImageResource(R.drawable.lung);

                    // pass animation
                    packagePlace.startAnimation(packageimg);
                    pagetitle.startAnimation(atg);
                    pagesubtitle.startAnimation(atg);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
