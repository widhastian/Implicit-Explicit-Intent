package com.example.impintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        TextView tvNama = findViewById(R.id.tv_nama); //menemukan menggunakan id

        //menerima data nama dari main activity 2
        Intent terima = getIntent();
        String terimaNama = terima.getStringExtra("mailNama");

        tvNama.setText(terimaNama); //membuat text view nama berisi data nama yang dikirimkan dari main activity 2

    }
}