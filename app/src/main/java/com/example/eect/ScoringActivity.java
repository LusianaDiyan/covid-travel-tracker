package com.example.eect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ScoringActivity extends AppCompatActivity {
    TextView tvNilai, tvComment;
    Button mbtnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoring);

        tvComment = findViewById(R.id.txt_comment);
        tvNilai = findViewById(R.id.txt_nilai);
        mbtnMenu = (Button) findViewById(R.id.btn_cobalagi);

        mbtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ScoringActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        int nilai = getIntent().getExtras().getInt("nilai");
        //tvNilai.setText(String.valueOf(nilai));

        if(nilai >= 80) {
            tvComment.setText("Kami sarankan Anda untuk melakukan tes lanjutAN di rumah sakit rujukan");
        }else {
            tvComment.setText("Anda kemungkinan besar tidak terinfeksi oleh COVID-19, Namun anda disarankan untuk tetap tinggal dirumah. Infeksi anda mungkin disebabkan virus selain COVID-19, Oleh karena itu anda tidak perlu dites oleh COVID-19. Meskipun demikian, hindarilah keluar rumah jika memungkinkan. Penyakit anda akan sembuh sendiri dengan cukup makan dan istirahat \n");
        }
    }
}
