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
public class aksiScanner {
    public static void main(String argss[])
{
classScanner scan = new classScanner();

scan.inputScanner();
System.out.println("\nNama Mahasiswa : "+ scan.getnama());
System.out.println("Nilai Mahasiswa "+scan.rata());
}
}