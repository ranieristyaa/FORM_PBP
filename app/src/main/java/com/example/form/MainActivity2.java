package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String nama = intent.getStringExtra("Nama");
        String tempat = intent.getStringExtra("Tempat Lahir");
        String tanggal = intent.getStringExtra("Tanggal Lahir");

        TextView nhasil = findViewById(R.id.hasil);
        nhasil.setText("Nama:"+nama+"\nTempat Lahir:"+tempat+"\nTanggal Lahir:"+tanggal);
    }
}