package com.example.eect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TesActivity extends AppCompatActivity {
    RadioGroup radiogr1,radiogr2,radiogr3,radiogr4,radiogr5, radiogrup6;
    private Button proses;
    private RadioButton value_no1,value_no2,value_no3,value_no4,value_no5, value_no6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tes);

        radiogr1 = findViewById(R.id.radiogroup1);
        radiogr2 = findViewById(R.id.radiogroup2);
        radiogr3 = findViewById(R.id.radiogroup3);
        radiogr4 = findViewById(R.id.radiogroup4);
        radiogr5 = findViewById(R.id.radiogroup5);
        radiogrup6 = findViewById(R.id.radiogroup6);

        proses = findViewById(R.id.button_proses);
        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int pointa = radiogr1.getCheckedRadioButtonId();
                value_no1 = (RadioButton) findViewById(pointa);

                int pointb = radiogr2.getCheckedRadioButtonId();
                value_no2 = (RadioButton) findViewById(pointb);

                int pointc = radiogr3.getCheckedRadioButtonId();
                value_no3 = (RadioButton) findViewById(pointc);

                int pointd = radiogr4.getCheckedRadioButtonId();
                value_no4 = (RadioButton) findViewById(pointd);

                int pointe = radiogr5.getCheckedRadioButtonId();
                value_no5 = (RadioButton) findViewById(pointe);

                int pointf = radiogrup6.getCheckedRadioButtonId();
                value_no6 = (RadioButton) findViewById(pointf);

                int nilai = 0; // variabel untuk menampung nilai

                if(value_no1.getText().toString().toLowerCase().equals("ya")){
                    nilai = nilai + 20;
                }
                if(value_no2.getText().toString().toLowerCase().equals("ya")){
                    nilai = nilai + 20;
                }
                if(value_no3.getText().toString().toLowerCase().equals("ya")){
                    nilai = nilai + 20;
                }
                if(value_no4.getText().toString().toLowerCase().equals("ya")){
                    nilai = nilai + 20;
                }
                if(value_no5.getText().toString().toLowerCase().equals("ya")){
                    nilai = nilai + 20;
                }
                if(value_no6.getText().toString().toLowerCase().equals("ya")){
                    nilai = nilai + 20;
                }

                Intent i = new Intent(TesActivity.this, ScoringActivity.class);
                i.putExtra("nilai",nilai);
                startActivity(i);
                finish();
            }
        });

    }
}
