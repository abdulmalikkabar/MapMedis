package com.stmik.ayuprima.ayuprima.detail;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.stmik.ayuprima.ayuprima.R;
import com.stmik.ayuprima.ayuprima.ulti.PicassoClient;

public class DetailBerita extends AppCompatActivity {



    TextView isi;
    TextView tgl;
    ImageView gambar;
    CollapsingToolbarLayout judul;


    String goolgeMap = "com.google.android.apps.maps"; // identitas package aplikasi google masps android
    Uri gmmIntentUri;
    Intent mapIntent;
    String koma=",";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_berita);

        judul = (CollapsingToolbarLayout) findViewById(R.id.judul);
        gambar = (ImageView) findViewById(R.id.gambar);
        isi =(TextView)findViewById(R.id.isi);
        tgl =(TextView)findViewById(R.id.tgl);



        //Menerima data
        Intent i=this.getIntent();

        String judulb=i.getExtras().getString("judul");
        String isib=i.getExtras().getString("isi");
        String tglb=i.getExtras().getString("tgl");
        String Gambarurl=i.getExtras().getString("gambar");




        //BIND
        // namaTxt.setText(nama);
        judul.setTitle(judulb);
        tgl.setText(tglb);
        isi.setText(Html.fromHtml(isib));
        PicassoClient.downloadImage(this,Gambarurl, gambar);
        // thumb_image.setImageUrl(Gambar, imageLoader);

    }
}
