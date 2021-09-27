package com.example.eect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class PreventionActivity extends AppCompatActivity {
    TextView pagetitle, pagesubtitle;
    ImageView packagePlace;
    SeekBar packageRange;
    Animation atg, packageimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);

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
                    pagetitle.setText("Wash Your Hand Often");
                    pagesubtitle.setText("Clean hands with soap and water or alcohol-based hand rub");
                    packagePlace.setImageResource(R.drawable.handwash);

                    // pass animation
                    packagePlace.startAnimation(packageimg);
                    pagetitle.startAnimation(atg);
                    pagesubtitle.startAnimation(atg);
                }
                else if(progress == 50){
                    pagetitle.setText("Wear A Face Mask");
                    pagesubtitle.setText("Wearing protective masks when going to ocrowded place");
                    packagePlace.setImageResource(R.drawable.wearmask);

                    // pass animation
                    packagePlace.startAnimation(packageimg);
                    pagetitle.startAnimation(atg);
                    pagesubtitle.startAnimation(atg);
                }
                else if(progress == 75){
                    pagetitle.setText("Keep A Physical Distancing");
                    pagesubtitle.setText("Keep a distance between two or more people about 2 meters");
                    packagePlace.setImageResource(R.drawable.distanc);

                    // pass animation
                    packagePlace.startAnimation(packageimg);
                    pagetitle.startAnimation(atg);
                    pagesubtitle.startAnimation(atg);
                }
                else if(progress == 100){
                    pagetitle.setText("Stay At Home");
                    pagesubtitle.setText("To keep your body stay health");
                    packagePlace.setImageResource(R.drawable.stayhome);

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
