package id.sch.smktelkom_mlg.learn.recyclerview_1.model;

import android.graphics.drawable.Drawable;

/**
 * Created by tomama on 1/31/2017.
 */

public class Hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}