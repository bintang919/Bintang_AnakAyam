/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintanganakayam;

import java.util.Scanner;

/**
 *
 * @author LABKOM01-RPL11
 */
public class BintangAnakAyam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

int bintang_a,bintang_b,bintang_c;

System.out.println("Masukkan anak ayam");
bintang_a=sc.nextInt();

for (bintang_c=1;bintang_c<bintang_a;){
System.out.print("Anak ayam turun " +bintang_a);
System.out.print(" Turun " +bintang_c);
bintang_a=bintang_a-bintang_c;
System.out.println(" Tinggal "+bintang_a);
}
System.out.print("Anak Ayam Turun "+bintang_a);
System.out.print(", Turun "+bintang_a);
System.out.println(", Tinggal Induknya ");

}
}
    
    

