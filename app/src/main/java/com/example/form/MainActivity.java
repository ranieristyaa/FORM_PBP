package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inNama;
    EditText inTempat;
    EditText inTanggal;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitBtn = findViewById(R.id.submit);
        inNama = findViewById(R.id.edtTextNama);
        inTempat = findViewById(R.id.edtTextTempat);
        inTanggal = findViewById(R.id.edtTextTgl);

        submitBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                String nama = inNama.getText().toString();
                String tempat = inTempat.getText().toString();
                String tanggal = inTanggal.getText().toString();
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Nama",nama);
                intent.putExtra("Tempat Lahir",tempat);
                intent.putExtra("Tanggal Lahir",tanggal);
                startActivity(intent);

            }
        });


    }
}