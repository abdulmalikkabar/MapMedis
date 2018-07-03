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
import com.stmik.ayuprima.ayuprima.detail.DetailHospital;
import com.stmik.ayuprima.ayuprima.objeck.Hospital;
import com.stmik.ayuprima.ayuprima.ulti.PicassoClient;

import java.util.List;

/**
 * Created by Malick on 2/12/2018.
 */

public class CustomAdapterHospita  extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<Hospital> hospitals;
    ImageLoader imageLoader;

    public CustomAdapterHospita(Activity activity, List<Hospital> hospitals) {
        this.activity = activity;
        this.hospitals = hospitals;
    }

    @Override
    public int getCount() {
        return hospitals.size();
    }

    @Override
    public Object getItem(int location) {
        return hospitals.get(location);
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
            convertView = inflater.inflate(R.layout.model_rs, null);


        //<de.hdodenhof.circleimageview.CircleImageView
        ImageView gambar=(ImageView) convertView.findViewById(R.id.gambar);
        TextView nama = (TextView) convertView.findViewById(R.id.nama);
        TextView jarak = (TextView) convertView.findViewById(R.id.jarak);

        final Hospital m = hospitals.get(position);

        //thumbNail.setImageUrl(m.getGambar(), imageLoader);
        PicassoClient.downloadImage(activity,m.getGambar(),gambar);
        nama.setText(m.getNama());
        jarak.setText(m.getJarak() + " Km");

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // openDetailActivity(m.getNm_masjid(),m.getAlamat(), m.getGambar(),m.getLat(),m.getLng(),m.getKet());
                //openDetailActivity(m.getNama_atm(),m.getAlamat(),m.getKet(),m.getGambar(),m.getLat(),m.getIng());

                openDetailActivity(m.getNama(),m.getAlamat(),m.getKet(),m.getGambar(),m.getGambar1(),m.getGambar2(),m.getLat(),m.getLng(),m.getNo_telpon());

            }
        });

        return convertView;
    }

    private void openDetailActivity(String nama, String alamat, String ket, String gambar, String gambar1, String gambar2, String lat, String lng, String no_telpon) {

        Intent i = new Intent(activity,DetailHospital.class);

        //data
        i.putExtra("nama", nama);
        i.putExtra("alamat", alamat);
        i.putExtra("ket",ket);
        i.putExtra("no_telpon",no_telpon);
        i.putExtra("gambar", gambar);
        i.putExtra("gambar1", gambar1);
        i.putExtra("gambar2", gambar2);
        i.putExtra("lat",lat);
        i.putExtra("lng",lng);


        activity.startActivity(i);

    }
}

