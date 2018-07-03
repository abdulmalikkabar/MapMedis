package com.stmik.ayuprima.ayuprima.objeck;

/**
 * Created by Malick on 2/15/2018.
 */

public class Klinik {

    String id_klinik,nama_klinik,alamat,ket,no_telpon,lat,lng,gambar,gambar1,gambar2,jarak;


    public Klinik() {
    }


    public Klinik(String id_klinik, String nama_klinik, String alamat, String ket, String no_telpon, String lat, String lng, String gambar, String gambar1, String gambar2, String jarak) {
        this.id_klinik = id_klinik;
        this.nama_klinik = nama_klinik;
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


    public String getId_klinik() {
        return id_klinik;
    }

    public void setId_klinik(String id_klinik) {
        this.id_klinik = id_klinik;
    }

    public String getNama_klinik() {
        return nama_klinik;
    }

    public void setNama_klinik(String nama_klinik) {
        this.nama_klinik = nama_klinik;
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
