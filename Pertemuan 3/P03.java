/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p03;

/**
 *
 * @author Asus
 */

import java.util.Scanner;
public class P03 {

public static void main(String[] args)
{
Scanner input = new Scanner(System.in);

String nama;
int n2;
double n1,n3;

System.out.println("Masukan Nama Mahasiswa : ");
nama = input.nextLine();
System.out.println("Masukan Nilai 1 : ");
n1 = input.nextDouble();
System.out.println("Masukan Nilai 2 : ");
n2 = input.nextInt();

n3 = n1 + n2;
System.out.println("\nNama Mahasiswa : "+ nama);
System.out.println("Nilai Mahasiswa : "+ n3);       
}
}
