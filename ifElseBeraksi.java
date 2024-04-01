/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p03;

/**
 *
 * @author Asus
 */
public class ifElseBeraksi {
    public static void main(String argss[]){
        ifElseClass ifClass = new ifElseClass();
        
        ifClass.setInputData();
        ifClass.getketerangan();
         System.out.println("Hasil nilai akhir ");
         System.out.println("===========================================");
         System.out.println("Nama Mahasiswa               :"+ifClass.nama);
         System.out.println("Nilai Mahasiswa              :"+ifClass.nilai);
         System.out.println("Keterangan                   :"+ifClass.getketerangan());
         System.out.println("===========================================");
    }
}
