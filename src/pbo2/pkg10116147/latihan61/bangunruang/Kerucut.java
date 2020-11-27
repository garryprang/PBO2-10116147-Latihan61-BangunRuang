/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan61.bangunruang;

/**
 *
 * @author 
 * Nama      : Garry Prang
 * Kelas     : PBO-2
 * NIM       : 10116147
 * Deskripsi : Program untuk menghitung volume bangun ruang.
 * 
 */

public class Kerucut extends BangunRuang{
    
    @Override
    public double hitungVolume(double jarijari){
        double phi, r2, tinggi, luasAlas, volume;
        phi = 22.0/7.0;
        r2 = jarijari*jarijari;
        tinggi = 9.0;
        
        luasAlas = phi * r2;
        
        volume = 1.0/3.0 * luasAlas * tinggi;
        return volume;
    }
}
