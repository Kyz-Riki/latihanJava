/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p04;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class latArray {
    public static void main(String[] args) {
        int i;
        int[] nilai_akhir;
        nilai_akhir = new int [6];
        Scanner input = new Scanner(System.in);
        for (i=0;i<6;i++){
            System.out.println("Masukan Array ke "+i+" = ");
            nilai_akhir[i] = input.nextInt();
            
        }
        System.out.println("\n\nData Yang Diinput ke Elemnet Array \n");
        for (i=0; i<6; i++){
            System.out.println("Nilai Akhir Index "+i);
            System.out.println(" = "+nilai_akhir[i]);
        }
    }
}
