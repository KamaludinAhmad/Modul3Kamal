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
public class Kopsis extends Koperasi{
    private int kodepembelian;
 
    public Kopsis(String namabarang, int kartupelajarmoklet, int harga, int kodebarang, int jumlah) {
        super(namabarang, harga, kodebarang, jumlah);
        this.kodepembelian=kartupelajarmoklet;
        
   }
    public void info(){
        System.out.println("NO. Kode Pembelian : " + this.kodepembelian);
          super.info();
}
}
