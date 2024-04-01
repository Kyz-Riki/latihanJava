/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p03;
import java.util.*;
/**
 *
 * @author Asus
 */

public class programIf {
   public static void main(String argss[])
   {
double tot_beli, potongan=0, jum_bayar=0;
Scanner input = new Scanner(System.in);

System.out.print("Total pembelian Rp. ");
tot_beli = input.nextDouble();
    if (tot_beli >= 15000)
    potongan = 0.2 *tot_beli;
System.out.println("Besarnya Potongan : Rp. "+ potongan);
jum_bayar = tot_beli - potongan;
System.out.println("Jumlah yang harus dibayar : Rp. "+jum_bayar);
}
}
