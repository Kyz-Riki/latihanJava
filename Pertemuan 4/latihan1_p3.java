/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p04;

/**
 *
 * @author Asus
 */

public class latihan1_p3 {
    public static void main(String[] args) {
        // Jumlah bilangan dalam deret Fibonacci yang ingin ditampilkan
        int n = 8;

        // Menampilkan deret Fibonacci
        System.out.println("Deret Fibonacci dengan " + n + " bilangan adalah:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Fungsi rekursif untuk menghasilkan deret Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
