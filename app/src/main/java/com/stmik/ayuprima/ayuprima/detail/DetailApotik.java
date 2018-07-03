package com.stmik.ayuprima.ayuprima.detail;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.stmik.ayuprima.ayuprima.R;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

import java.util.ArrayList;
import java.util.List;

import qdx.bezierviewpager_compile.BezierRoundView;
import qdx.bezierviewpager_compile.vPage.BezierViewPager;
import qdx.bezierviewpager_compile.vPage.CardPagerAdapter;

public class DetailApotik extends AppCompatActivity {

    FloatingActionMenu materialDesignFAM;
    FloatingActionButton telpon,rute;

    TextView nama;
    TextView alamat;
    TextView ket;
    ImageView gambar;


    String goolgeMap = "com.google.android.apps.maps"; // identitas package aplikasi google masps android
    Uri gmmIntentUri;
    Intent mapIntent;
    String koma=",";



List<String> listImage = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_apotik);

    buildImageList();
        CardPagerAdapter cardPagerAdapter = new CardPagerAdapter(this);
        cardPagerAdapter.addImgUrlList(listImage);

        BezierViewPager viewPager = (BezierViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(cardPagerAdapter);


        BezierRoundView roundView = (BezierRoundView) findViewById(R.id.roundview);
        roundView.attach2ViewPage(viewPager);


        gambar = (ImageView) findViewById(R.id.gambar);
        //thumb_image = (NetworkImageView) findViewById(R.id.gambar);
        ket =(TextView)findViewById(R.id.isi);
        alamat =(TextView)findViewById(R.id.alamat);
        nama =(TextView) findViewById(R.id.nama);


        //Menerima data
        Intent i=this.getIntent();
        String alamat1=i.getExtras().getString("alamat");
        String nama1=i.getExtras().getString("nama");
        String ket1=i.getExtras().getString("ket");
        final String lat=i.getExtras().getString("lat");
        final String  lng=i.getExtras().getString("lng");
        final String telpon2=i.getExtras().getString("no_telpon");



        //BIND
        // namaTxt.setText(nama);
        nama.setText(nama1);
        ket.setText(Html.fromHtml(ket1));
        alamat.setText(alamat1);


        materialDesignFAM = (FloatingActionMenu) findViewById(R.id.material_design_android_floating_action_menu);
        telpon = (FloatingActionButton) findViewById(R.id.telpon);
        rute = (FloatingActionButton) findViewById(R.id.rute);


        telpon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+telpon2));
                startActivity(intent);



            }
        });
        rute.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu second item clicked
                // Buat Uri dari intent string. Gunakan hasilnya untuk membuat Intent.
                gmmIntentUri = Uri.parse("google.navigation:q=" + lat + koma + lng);
                mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage(goolgeMap);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(DetailApotik.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }
        });



}

    private void buildImageList() {

        Intent i=this.getIntent();
        String gambar=i.getExtras().getString("gambar");
        String gambar1=i.getExtras().getString("gambar1");
        String gambar2=i.getExtras().getString("gambar2");

        listImage.add(gambar);
        listImage.add(gambar1);
        listImage.add(gambar2);
    }



}
