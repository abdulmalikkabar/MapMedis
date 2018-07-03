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

import com.stmik.ayuprima.ayuprima.R;
import com.stmik.ayuprima.ayuprima.detail.DetailApotik;
import com.stmik.ayuprima.ayuprima.objeck.Apotik;
import com.stmik.ayuprima.ayuprima.ulti.PicassoClient;

import java.util.List;

/**
 * Created by Malick on 2/13/2018.
 */

public class CustomAdapterApotik extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<Apotik> apotiks;


    public CustomAdapterApotik(Activity activity, List<Apotik> apotiks) {
        this.activity = activity;
        this.apotiks = apotiks;
    }

    @Override
    public int getCount() {
        return apotiks.size();
    }

    @Override
    public Object getItem(int location) {
        return apotiks.get(location);
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
            convertView = inflater.inflate(R.layout.model_apotik, null);


        //<de.hdodenhof.circleimageview.CircleImageView
        ImageView gambar=(ImageView) convertView.findViewById(R.id.gambar);
        TextView nama = (TextView) convertView.findViewById(R.id.nama);
        TextView jarak = (TextView) convertView.findViewById(R.id.jarak);

        final Apotik m = apotiks.get(position);

        //thumbNail.setImageUrl(m.getGambar(), imageLoader);
        PicassoClient.downloadImage(activity,m.getGambar(),gambar);
        nama.setText(m.getNm_apotik());
        jarak.setText(m.getJarak() + " Km");

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // openDetailActivity(m.getNm_masjid(),m.getAlamat(), m.getGambar(),m.getLat(),m.getLng(),m.getKet());
                //openDetailActivity(m.getNama_atm(),m.getAlamat(),m.getKet(),m.getGambar(),m.getLat(),m.getIng());

                openDetailActivity(m.getNm_apotik(),m.getAlamat(),m.getKet(),m.getGambar(),m.getGambar1(),m.getGambar2(),m.getLat(),m.getIng(),m.getTelpon());

            }
        });

        return convertView;
    }

    private void openDetailActivity(String nm_apotik, String alamat, String ket, String gambar, String gambar1, String gambar2, String lat, String ing, String telpon) {

        Intent i = new Intent(activity,DetailApotik.class);

        //data
        i.putExtra("nama", nm_apotik);
        i.putExtra("alamat", alamat);
        i.putExtra("ket",ket);
        i.putExtra("no_telpon",telpon);
        i.putExtra("gambar", gambar);
        i.putExtra("gambar1", gambar1);
        i.putExtra("gambar2", gambar2);
        i.putExtra("lat",lat);
        i.putExtra("lng",ing);


        activity.startActivity(i);

    }
}

