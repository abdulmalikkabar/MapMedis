package com.stmik.ayuprima.ayuprima.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.stmik.ayuprima.ayuprima.R;
import com.stmik.ayuprima.ayuprima.detail.DetailBerita;
import com.stmik.ayuprima.ayuprima.objeck.Berita;
import com.stmik.ayuprima.ayuprima.ulti.PicassoClient;

import java.util.List;

/**
 * Created by Malick on 2/16/2018.
 */

public class CustomAdapterBerita extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Berita> newsItems;


    public CustomAdapterBerita(Activity activity, List<Berita> newsItems) {
        this.activity = activity;
        this.newsItems = newsItems;
    }

    @Override
    public int getCount() {
        return newsItems.size();
    }

    @Override
    public Object getItem(int location) {
        return newsItems.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null)
            convertView = inflater.inflate(R.layout.model_informasi, null);


        //<de.hdodenhof.circleimageview.CircleImageView
        ImageView gambar1 = (ImageView) convertView.findViewById(R.id.new_gambar);
        TextView judul = (TextView) convertView.findViewById(R.id.news_judul);
        TextView timestamp = (TextView) convertView.findViewById(R.id.news_timestamp);
        TextView isi = (TextView) convertView.findViewById(R.id.news_isi);

        final Berita news = newsItems.get(position);

        PicassoClient.downloadImage(activity, news.getGambar(), gambar1);
        judul.setText(news.getJudul());
        timestamp.setText(news.getTgl_post());
        isi.setText(Html.fromHtml(news.getIsi()));


        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // openDetailActivity(m.getNm_masjid(),m.getAlamat(), m.getGambar(),m.getLat(),m.getLng(),m.getKet());
                //openDetailActivity(m.getNama_atm(),m.getAlamat(),m.getKet(),m.getGambar(),m.getLat(),m.getIng());

                openDetailActivity(news.getJudul(), news.getIsi2(), news.getTgl_post(), news.getGambar());

            }
        });

        return convertView;
    }

    private void openDetailActivity(String judul, String isi2, String tgl, String gambar) {

        Intent i = new Intent(activity, DetailBerita.class);

        //data
        i.putExtra("judul", judul);
        i.putExtra("isi", isi2);
        i.putExtra("tgl", tgl);
        i.putExtra("gambar", gambar);

        activity.startActivity(i);

    }

}