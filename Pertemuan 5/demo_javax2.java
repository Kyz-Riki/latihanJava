/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p05;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Asus
 */
public class demo_javax2 extends JFrame {
    JPanel jp=new JPanel();
    JTextField jt=new JTextField();
    JLabel jl=new JLabel("contoh label");
 
    public demo_javax2(){
        add(jl);
        add(jt);
        add(jp);
        jl.setBounds(15, 20, 80, 25);
        jt.setBounds(120, 20, 80, 25);
    }
    public static void main(String[] args){
    demo_javax2 demo2=new demo_javax2();
    demo2.setTitle("form dengan label dan textfield");
    demo2.setSize(300,300);
    demo2.setVisible(true);
    }
}

