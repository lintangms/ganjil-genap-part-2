/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganjilgenappt2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ganjilgenappt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int n;
     int hasil = 0;
     System.out.println("Menghitung Bilangan 1 sampai n bilangan");

     Scanner angka = new Scanner(System.in);
     System.out.print("Masukan banyak bilangan = ");
     n = angka.nextInt();

     for (int i=1; i<=n; i++) {
	     hasil += i;
     }
     System.out.println("Hasil Bilangan = " + hasil);
    }

        
    }
    

