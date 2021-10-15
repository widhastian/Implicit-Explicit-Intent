package com.example.impintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    //inisialisasi
    private EditText etNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etNama = findViewById(R.id.editTextnama); //menemukan menggunakan id
        Button btnMasuk = findViewById(R.id.btn_Masuk); //menemukan menggunakan id

        //membuat button bisa diclik sekaligus mengirim data nama
        btnMasuk.setOnClickListener(view -> {
            String nama = etNama.getText().toString();

            //jika kolom nama kosong maka akan mengeluarkan peringatan sebagai berikut
            if(nama.trim().equals("")){
                etNama.setError("Nama tidak boleh kosong");
            } else {
                Intent masuk = new Intent(MainActivity2.this, Biodata.class);
                masuk.putExtra("mailNama", nama); //jika nama sudah terisi maka akan terbuka halaman biodata
                                                        //dan memasukkan data nama tadi di text View nama
                startActivity(masuk); //menjalankan program
            }
        });

    }
}