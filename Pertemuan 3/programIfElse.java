/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p03;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class programIfElse {
    public static void main(String argss[])
   {
    Scanner input = new Scanner(System.in);
    String keterangan,nama;
    int nilai;
    
    System.out.print("Masukan nama mahasiswa : ");
    nama = input.nextLine();
    System.out.print("Masukan nilai mahasiswa : ");
    nilai = input.nextInt();
        if (nilai > 75){
        keterangan = "Lulus";
        }else{
            keterangan = "Gagal";
        }
    System.out.println("Hasil nilai akhir ");
    System.out.println("===========================================");
    System.out.println("Nama Mahasiswa               :"+nama);
    System.out.println("Nilai Mahasiswa              :"+nilai);
    System.out.println("Keterangan                   :"+keterangan);
    System.out.println("===========================================");
   }
}

