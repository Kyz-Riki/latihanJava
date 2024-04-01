/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p03;

/**
 *
 * @author Asus
 */
import java.io.*;
public class bufferedReader {
    public static void main(String argss[]) throws Exception
{
InputStreamReader keyreader = new InputStreamReader(System.in);
BufferedReader input = new BufferedReader(keyreader);
String kata1, kata2;

System.out.print("Masukan kata pertama : ");
kata1 = input.readLine();
System.out.print("Masukan kata kedua : ");
kata2 = input.readLine();
System.out.println("\nHasil input string "+ kata1 +" "+ kata2);
}
}
