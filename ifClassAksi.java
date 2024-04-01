/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p03;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class ifClassAksi {
    public static void main(String argss[]){
        double tot_beli;
        Scanner input = new Scanner(System.in);
        ifClass fungsiIf = new ifClass();
        System.out.print("Masukan total pembelian Rp. ");
        fungsiIf.totBeli = input.nextDouble();
        System.out.println("Jumlah potongan : Rp. "+fungsiIf.getPotongan());
        System.out.println("Jumlah bayar : Rp. "+fungsiIf.getjumlahBayar());

    }
}
