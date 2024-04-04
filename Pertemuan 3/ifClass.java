/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p03;

/**
 *
 * @author Asus
 */
public class ifClass {
    public double totBeli,potongan;
    public void setTotalBeli(double a){
        totBeli=a;  
    }
    public double getPotongan(){
        if (totBeli >= 80000){
            potongan = 0.3 * totBeli;
        }
        return potongan;
        
    }
    public double getjumlahBayar()
    {
        return(totBeli - potongan);
    }
}
