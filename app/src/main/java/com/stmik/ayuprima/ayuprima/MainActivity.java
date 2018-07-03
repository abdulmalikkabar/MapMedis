package com.stmik.ayuprima.ayuprima;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageView hospital = (ImageView) findViewById(R.id.rumah);
        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),ActivityHospital.class);
                startActivity(i);
            }
        });




        ImageView apt = (ImageView) findViewById(R.id.apotik);
        apt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getApplicationContext(),ActivityApotik.class);
                startActivity(intent);
            }
        });




        ImageView Klinik = (ImageView) findViewById(R.id.klinik);
        Klinik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getApplicationContext(),ActivityKlinik.class);
                startActivity(intent);
            }
        });


        ImageView Berita = (ImageView) findViewById(R.id.berita);
        Berita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getApplicationContext(),ActivityInformasi.class);
                startActivity(intent);
            }
        });


        ImageView Ab = (ImageView) findViewById(R.id.about);
        Ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getApplicationContext(),ActivityAbout.class);
                startActivity(intent);
            }
        });









    }
}
