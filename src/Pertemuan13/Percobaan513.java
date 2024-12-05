package Pertemuan13;

import java.util.Scanner;
public class Percobaan513 {
    public static void TampilHinggakei(int i) { 
        for (int j = 0; j <= i; j++) {
            System.out.println(j);
        }
    }
    public static int jumlah (int bil1,int bil2) { 
       return (bil1+bil2);
    }
    public static void Tampiljumlah (int bil1,int bil2) { 
       TampilHinggakei(jumlah(bil1,bil2));
    }

    public static void main (String[] args) {
        int temp = jumlah (1,1);
        Tampiljumlah(temp, 5);
    }
    

}

