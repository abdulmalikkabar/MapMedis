package com.stmik.ayuprima.ayuprima.objeck;

/**
 * Created by Malick on 2/13/2018.
 */

public class Apotik {

    String id_apotik,nm_apotik,alamat,ket,telpon,lat,ing,gambar,gambar1,gambar2,jarak;

    public Apotik() {
    }

    public Apotik(String id_apotik, String nm_apotik, String alamat, String ket, String telpon, String lat, String ing, String gambar, String gambar1, String gambar2, String jarak) {

        this.id_apotik = id_apotik;
        this.nm_apotik = nm_apotik;
        this.alamat = alamat;
        this.ket = ket;
        this.telpon = telpon;
        this.lat = lat;
        this.ing = ing;
        this.gambar = gambar;
        this.gambar1 = gambar1;
        this.gambar2 = gambar2;
        this.jarak = jarak;
    }


    public String getId_apotik() {
        return id_apotik;
    }

    public void setId_apotik(String id_apotik) {
        this.id_apotik = id_apotik;
    }

    public String getNm_apotik() {
        return nm_apotik;
    }

    public void setNm_apotik(String nm_apotik) {
        this.nm_apotik = nm_apotik;
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

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getIng() {
        return ing;
    }

    public void setIng(String ing) {
        this.ing = ing;
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
