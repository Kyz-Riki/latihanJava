/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p04;

/**
 *
 * @author Asus
 */
public class latihan1_p1 {
    public static void main(String[] args) {
        // Inisialisasi variabel untuk menyimpan jumlah deret
        int total = 0;
        int i = 1;

        // Loop while untuk menghasilkan deret bilangan genap dan menjumlahkannya
        while (i <= 10) {
            int bilanganGenap = i * 2;
            total += bilanganGenap;
            i++;
        }

        // Menampilkan hasil
        System.out.println("Hasil penjumlahan 10 deret bilangan genap adalah: " + total);
    }
}
