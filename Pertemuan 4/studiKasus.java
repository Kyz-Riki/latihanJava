/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class studiKasus {

    public static void main(String[] args) {
        String nama, tanggal;
        int data,i, k;
        String [] kode, nb;
        int [] jumlah;
        
        String[] kodebarang = {"P001", "V001","M001"};
        String[] namabarang = {"Printer","VGA Card","MotherBoard"};
        int[] hargabarang = {700000, 75000, 950000};
        System.out.println("-----------------------------------------");
        System.out.println("Kode Barang   Nama Barang    Harga Barang");
        for (i=0; i<3; i++){
        System.out.println(kodebarang[i] + namabarang[i] + hargabarang[i]);
        }
        System.out.println("-----------------------------------------");
        Scanner input = new Scanner (System.in);
        System.out.println("\n        PT.PERMATA \"PRAMATA\"");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Masukan Nama Petugas  : ");
        nama = input.nextLine();
        System.out.print("Tanggal               : ");
        tanggal = input.nextLine();
        System.out.println("\n");
        System.out.print("Jumlah Data yang akan dimasukan  : ");
        data = input.nextInt();
        
        kode = new String[data];
        jumlah = new int[data];
        
        int[] hb, th;
        
        hb = new int[data];
        th = new int[data];
        nb = new String[data];
        
        System.out.println("-------------------------------------------");
        for (i=0; i<data; i++){
        int t = 0;
        k = i + 1;
        System.out.println("Data Ke-"+k);
        System.out.print("Kode barang : ");
        kode[i] = input.next();
        switch(kode[i]){
        case "P001":
        hb[i] = 700000;
        nb[i] = " Printer   ";
        break;
        case "V001":
        hb[i] = 75000 ;
        nb[i] = "VGA Card   ";
        break;
        case "M001":
        hb[i] = 950000;
        nb[i] = "MotherBoard";
        break;
        default:
        System.out.println("Kode tidak ada!");
        t = 1;
        break;
        }
            if (t==1){
                t=0;
                i -= 1;
                continue;
            }
            System.out.print("Jummlah     : ");
            jumlah[i] = input.nextInt();
            th[i] = hb[i]*jumlah[i];
            System.out.println("--------------------------------------");            
        }
        System.out.println("\n\n");
        System.out.println("PT.PERMATA \"PRATAMA\"");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Nama Petugas                 : "+nama+"                   Tanggal  : "+tanggal);
        System.out.println("Jummlah Data yang di masukan : "+data);
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Data Ke    Kode Barang    Nama Barang    Harga Barang    Jumlah Barang    Total Barang");
        System.out.println("---------------------------------------------------------------------------------------");
        for (i=0; i<data; i++){
            k = i + 1;
        System.out.println(" "+k+"          "+kode[i]+"             "+nb[i]+"      "+hb[i]+"           "+jumlah[i]+"           "+th[i]);    
        }
        
        
    }
}