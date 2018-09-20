/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author ASUS
 */
public class Koperasi {
    
    private String namabarang;
    private int harga;
    private int kodebarang;
    private int jumlah;
    
    public Koperasi(String namabarang, int harga, int kodebarang, int jumlah) {
        this.namabarang = namabarang;
        this.harga = harga;
        this.kodebarang = kodebarang;
        this.jumlah = jumlah;
    }

    public void info () {
        System.out.println("Nama Barang yang dibeli: "+this.namabarang);
        System.out.println("Harga : "+this.harga);
        System.out.println("Kode Barang : "+this.kodebarang);
        System.out.println("Jumlah : "+this.jumlah);
        
    }
}
