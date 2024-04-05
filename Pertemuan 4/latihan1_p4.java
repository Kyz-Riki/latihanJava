/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p04;

/**
 *
 * @author Asus
 */
public class latihan1_p4 {
    public static void main(String[] args) {
        // Batas atas bilangan untuk dicari bilangan prima
        int batasAtas = 20;
        
        System.out.println("Bilangan prima dari 2 hingga " + batasAtas + " adalah:");
        for (int i = 2; i <= batasAtas; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Fungsi untuk memeriksa apakah suatu bilangan adalah bilangan prima
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
