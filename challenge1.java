/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba1;

import java.util.Scanner;

/**
 *
 * @author nuris
 */
public class challenge1 {
   public static void main(String[] args) {
      double penjualan;
      double komisi;
      double uangjasa;
      double total;
      
      //Scanner
      Scanner baca = new Scanner(System.in);
      
//Input   
System.out.println("total penjualan anda");
System.out.println("silahkan masukkan hasil penjualan anda");
penjualan = baca.nextInt();

//Pengulangan
System.out.println("/golongan a,b atau c");
if(penjualan >= 20000) {
    System.out.println("Selamat anda masuk golongan A");
    uangjasa = penjualan + 10000;
 System.out.println(" penjualan " + "Rp" + penjualan);
 System.out.println("/n+uang total");
 total = (penjualan * 10/100) + uangjasa;
 System.out.println("uang total " + total);
 
} else if (penjualan >= 50000) {
    System.out.println("selamat anda masuk golongan C");
    uangjasa = penjualan + 30000;
    System.out.println("penjualan " + "Rp" + penjualan);
    System.out.println("/n+uang total");
    total = uangjasa + (penjualan * 20/100);
    System.out.println("uang total: " + total);
    
}else
    if (penjualan >= 20000) {
        System.out.println("Selamat anda masuk golongan B");
        uangjasa = penjualan + 20000;
        System.out.println("penjualan " + "Rp" + penjualan);
        System.out.println("/n+uangtotal");
        total = (penjualan * 15/100);
        System.out.println("uang total: " + total);
        
    }else 
        if (penjualan >= 100000);
             System.out.println("Selamat anda masuk golongan D");
             uangjasa = penjualan + 50000;
             System.out.println("penjualan " + "Rp" + penjualan);
             System.out.println("/n+uangtotal");
             total = (penjualan * 30/100);
             System.out.println("uang total: " + total);
           
  if (penjualan >= 150000);
       System.out.println("Selamat anda masuk golongan E");
       uangjasa = penjualan + 75000;
       System.out.println("penjualan " + "Rp" + penjualan);
       System.out.println("/n+uangtotal");
       total = (penjualan * 40/100);
       System.out.println("uang total: " + total);
               
   
  

    
    
    
}
     
 
         
 
         
         
         
     
     
     
        
               
               
            
       
       
       
       
   }
}
