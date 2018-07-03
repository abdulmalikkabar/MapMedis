package com.stmik.ayuprima.ayuprima.objeck;

/**
 * Created by Malick on 2/12/2018.
 */

public class Hospital {

    String id ,nama,alamat,ket,no_telpon,lat,lng,gambar,gambar1,gambar2,jarak;

    public Hospital() {
    }


    public Hospital(String id, String nama, String alamat, String ket, String no_telpon, String lat, String lng, String gambar, String gambar1, String gambar2, String jarak) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.ket = ket;
        this.no_telpon = no_telpon;
        this.lat = lat;
        this.lng = lng;
        this.gambar = gambar;
        this.gambar1 = gambar1;
        this.gambar2 = gambar2;
        this.jarak = jarak;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }

    public String getNo_telpon() {
        return no_telpon;
    }

    public void setNo_telpon(String no_telpon) {
        this.no_telpon = no_telpon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getGambar1() {
        return gambar1;
    }

    public void setGambar1(String gambar1) {
        this.gambar1 = gambar1;
    }

    public String getGambar2() {
        return gambar2;
    }

    public void setGambar2(String gambar2) {
        this.gambar2 = gambar2;
    }

    public String getJarak() {
        return jarak;
    }

    public void setJarak(String jarak) {
        this.jarak = jarak;
    }
}
