/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujianpraktik;
import java.util.Scanner;
/**
 *
 * @author Nisrina Izdihar
 */
public class praktik1 {
    public static void main(String[] args){
        
        Scanner inputan = new Scanner(System.in);
        String barang;
        System.out.print("Nama Barang : ");
        barang = inputan.next();
        
        String kode;
        System.out.print("Kode Barang : ");
        kode = inputan.next();
        
        int harga;
        System.out.print("Harga barang : ");
        harga = inputan.nextInt();
        
        if(harga >= 100.000 && harga < 200.000)
        System.out.println("diskon 10%");
        
        else if(harga >= 200.000 && harga < 500.000)
        System.out.println("diskon 20%");
        
        else if(harga >= 500.000)
        System.out.println("diskon 50%");
        
        String namakasir;
        System.out.println("Nama Kasir : Nisrina Izdihar");
    }
}
           


