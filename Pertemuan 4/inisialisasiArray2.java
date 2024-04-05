/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p04;

/**
 *
 * @author Asus
 */
public class inisialisasiArray2 {
    public static void main(String[] args) {
        int i,j;
        int [][] nilai_akhir = {{512,256, 128}, {64, 32, 16}, {8, 4, 2}};
        System.out.println("\nData yang diinput ke elet array \n");
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                System.out.println("Nilai akhir index ["+i+"]["+j+"] = ");
                System.out.println(" = "+nilai_akhir[i][j]);
            }
        }
    }
}
