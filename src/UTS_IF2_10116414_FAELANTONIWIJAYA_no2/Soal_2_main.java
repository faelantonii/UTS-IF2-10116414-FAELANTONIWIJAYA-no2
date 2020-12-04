/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_IF2_10116414_FAELANTONIWIJAYA_no2;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan tabungan nasabah
 */
public class Soal_2_main {
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan();
        Scanner scan = new Scanner (System.in);
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal\t: ");
        int saldo = scan.nextInt();       
        System.out.print("Jumlah uang yang diambil: ");
        int jumlah = scan.nextInt();     
        System.out.println("\nSaldo Anda Sekarang\t: "+tabungan.ambilUang(saldo-jumlah));        
    }
}
