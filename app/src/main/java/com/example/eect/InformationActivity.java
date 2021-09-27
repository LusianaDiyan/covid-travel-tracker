package com.example.eect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {
    TextView pagetitle, pagesubtitle;
    ImageView packagePlace;
    SeekBar packageRange;
    Animation atg, packageimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

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
                    pagetitle.setText("Symptoms");
                    pagesubtitle.setText("Early Symptoms of covid-19 indication");
                    packagePlace.setImageResource(R.drawable.sym);

                    // pass animation
                    packagePlace.startAnimation(packageimg);
                    pagetitle.startAnimation(atg);
                    pagesubtitle.startAnimation(atg);
                }
                else if(progress == 50){
                    pagetitle.setText("Contagion");
                    pagesubtitle.setText("The Way COVID-19 Spreads");
                    packagePlace.setImageResource(R.drawable.contagion);

                    // pass animation
                    packagePlace.startAnimation(packageimg);
                    pagetitle.startAnimation(atg);
                    pagesubtitle.startAnimation(atg);
                }
                else if(progress == 75){
                    pagetitle.setText("Prevention");
                    pagesubtitle.setText("Anticipation To Reduce The Impact of COVID-19 Distribution");
                    packagePlace.setImageResource(R.drawable.prevention);

                    // pass animation
                    packagePlace.startAnimation(packageimg);
                    pagetitle.startAnimation(atg);
                    pagesubtitle.startAnimation(atg);
                }
                else if(progress == 100){
                    pagetitle.setText("Prohibition");
                    pagesubtitle.setText("A Ban On Activities To Avoid Spreading");
                    packagePlace.setImageResource(R.drawable.larangan);

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
