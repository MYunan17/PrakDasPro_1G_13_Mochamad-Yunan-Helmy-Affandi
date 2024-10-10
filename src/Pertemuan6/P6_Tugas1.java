package Pertemuan6;

import java.util.Scanner;

public class P6_Tugas1 {

    public static void main(String[] args) {
        Scanner input13= new Scanner (System.in);
        int bil1,bil2,bil3;
        System.out.print("Massukan Bilangan 1 : " );
        bil1 = input13.nextInt();
        System.out.print("Massukan Bilangan 2 : " );
        bil2 = input13.nextInt();
        System.out.print("Massukan Bilangan 3 : " );
        bil3 = input13.nextInt();
        if (bil1>bil2) {
            System.out.println(bil1+" adalah bilangan terbesar");
        }
        if (bil2>bil3) {
            System.out.println(bil2+" adalah Bilangan terbesar");
        }
        if (bil3>bil1) {
            System.out.println(bil3+" adalah Bilangan terbesar");
        }

    }
}