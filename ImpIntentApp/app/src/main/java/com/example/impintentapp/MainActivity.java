package com.example.impintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi
        Button btn = findViewById(R.id.buttonBio);

        //membuat button bisa di click
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //tempat perpindahan activity
                Intent profile = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(profile); //menjalankan program
            }
        });
    }
    //baris 32-48 sebagai baris kode untuk link github, instagram, dan twitter
    public void Github(View view) {
        String url = "https://github.com/widhastian"; //url akun github
        Intent Github = new Intent(Intent.ACTION_VIEW);
        Github.setData(Uri.parse(url));
        startActivity(Github); //menjalankan program
    }
    public void Instagram(View view) {
        String url = "https://instagram.com/widhastian"; //url akun instagram
        Intent Instagram = new Intent(Intent.ACTION_VIEW);
        Instagram.setData(Uri.parse(url));
        startActivity(Instagram); //menjalankan program
    }
    public void Twitter(View view) {
        String url = "https://twitter.com/widhastian"; //url akun twitter
        Intent Twitter = new Intent(Intent.ACTION_VIEW);
        Twitter.setData(Uri.parse(url));
        startActivity(Twitter); //menjalankan program
    }
}