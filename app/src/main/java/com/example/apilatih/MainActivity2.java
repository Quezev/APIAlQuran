package com.example.apilatih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView Idsurah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int id = getIntent().getIntExtra("id",1);
        Idsurah = findViewById(R.id.idsur);
        Idsurah.setText("Surah Ke: "+(id));

        int urutan = getIntent().getIntExtra("urutan",1);
        Idsurah = findViewById(R.id.urutansur);
        Idsurah.setText("Urutan turunnya surah: "+(urutan));

        int jumlahay = getIntent().getIntExtra("jumlahay",1);
        Idsurah = findViewById(R.id.jumay);
        Idsurah.setText("Jumlah Ayat: "+(jumlahay));

        String namasurah = getIntent().getExtras().getString("namasurah");
        Idsurah = findViewById(R.id.namasur);
        Idsurah.setText("Nama Surah: "+(namasurah));

        String tempat = getIntent().getExtras().getString("tempat");
        Idsurah = findViewById(R.id.tempsur);
        Idsurah.setText("Tempat turunnya Surah: "+(tempat));

        String namaarab = getIntent().getExtras().getString("namaarab");
        Idsurah = findViewById(R.id.namaar);
        Idsurah.setText("("+(namaarab)+")");

        String artisur = getIntent().getExtras().getString("artisur");
        Idsurah = findViewById(R.id.artisurat);
        Idsurah.setText("Terjemahan Surah: "+(artisur));

    }
}