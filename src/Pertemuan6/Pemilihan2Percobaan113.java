package Pertemuan6;

import java.util.Scanner;

public class Pemilihan2Percobaan113 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner (System.in);
        int Tahun;
        System.out.print("Massukan Tahun : ");
        Tahun = input13.nextInt();
       if ((Tahun%4) == 0) {
            if ((Tahun%100) !=0) 
                System.out.println("Tahun Kabisat");  
       } else {
            System.out.println("Bukan Tahun Kabisat");
       }
    }
}
