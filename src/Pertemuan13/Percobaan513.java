package Pertemuan13;

import java.util.Scanner;
public class Percobaan513 {
    public static void main(String [] args) { 
        Scanner input = new Scanner (System.in);
        int p,l,t,L, vol;
        System.out.print("Masukkan panjang  : ");
        p = input.nextInt ();
        System.out.print("Masukkan lebar : ");
        l= input.nextInt();
        System.out.print("Masukkan tinggi : ");
        t= input.nextInt();  

        L=p*l;
        System.out.println ("Luas Persegi panjang adalah "+L);

        vol = t*l*p;
        System.out.println ("Volume balok adalah "+vol);
    }        
    
    
}
