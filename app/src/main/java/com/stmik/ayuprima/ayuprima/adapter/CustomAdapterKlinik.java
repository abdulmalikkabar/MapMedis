package com.stmik.ayuprima.ayuprima.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.stmik.ayuprima.ayuprima.R;
import com.stmik.ayuprima.ayuprima.detail.DetailApotik;
import com.stmik.ayuprima.ayuprima.objeck.Klinik;
import com.stmik.ayuprima.ayuprima.ulti.PicassoClient;

import java.util.List;

/**
 * Created by Malick on 2/15/2018.
 */

public class CustomAdapterKlinik extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<Klinik> kliniks;
    ImageLoader imageLoader;

    public CustomAdapterKlinik(Activity activity, List<Klinik> kliniks) {
        this.activity = activity;
        this.kliniks = kliniks;
    }

    @Override
    public int getCount() {
        return kliniks.size();
    }

    @Override
    public Object getItem(int location) {
        return kliniks.get(location);
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
            convertView = inflater.inflate(R.layout.model_klinik, null);


        //<de.hdodenhof.circleimageview.CircleImageView
        ImageView gambar=(ImageView) convertView.findViewById(R.id.gambar);
        TextView nama = (TextView) convertView.findViewById(R.id.nama);
        TextView jarak = (TextView) convertView.findViewById(R.id.jarak);

        final Klinik m = kliniks.get(position);

        //thumbNail.setImageUrl(m.getGambar(), imageLoader);
        PicassoClient.downloadImage(activity,m.getGambar(),gambar);
        nama.setText(m.getNama_klinik());
        jarak.setText(m.getJarak() + " Km");

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // openDetailActivity(m.getNm_masjid(),m.getAlamat(), m.getGambar(),m.getLat(),m.getLng(),m.getKet());
                //openDetailActivity(m.getNama_atm(),m.getAlamat(),m.getKet(),m.getGambar(),m.getLat(),m.getIng());

                openDetailActivity(m.getNama_klinik(),m.getAlamat(),m.getKet(),m.getGambar(),m.getGambar1(),m.getGambar2(),m.getLat(),m.getLng(),m.getNo_telpon());

            }
        });

        return convertView;
    }

    private void openDetailActivity(String nama_klinik, String alamat, String ket, String gambar, String gambar1, String gambar2, String lat, String lng, String no_telpon) {

        Intent i = new Intent(activity,DetailApotik.class);

        //data
        i.putExtra("nama", nama_klinik);
        i.putExtra("alamat", alamat);
        i.putExtra("ket",ket);
        i.putExtra("no_telpon",no_telpon);
        i.putExtra("gambar", gambar);
        i.putExtra("gambar1", gambar1);
        i.putExtra("gambar2", gambar1);
        i.putExtra("lat",lat);
        i.putExtra("lng",lng);


        activity.startActivity(i);

    }
}

