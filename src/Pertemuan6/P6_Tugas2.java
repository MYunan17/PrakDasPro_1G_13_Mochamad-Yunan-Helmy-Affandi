package Pertemuan6;

import java.util.Scanner;

public class P6_Tugas2 {
    public static void main(String[] args) {
        Scanner input13= new Scanner(System.in);
        int jumlahbeli;
        double diskon,jumlahharga,harga;
        String jenisbuku;
        System.out.print("Massukan jenis buku yang akan di beli :");
        jenisbuku = input13.nextLine();
        System.out.print("Massukan jumlah buku yang akan di beli : ");
        jumlahbeli = input13.nextInt();

        if (jenisbuku.equalsIgnoreCase("kamus")&&jumlahbeli>2) {
            harga = 10000;
            jumlahharga = jumlahbeli * harga ;
            diskon = jumlahharga - (jumlahharga*0.13);
            System.out.println("Diskon yang didapatkan adalah 13%");
            System.out.println("Total yang harus dibayar :" + diskon);
        } else if (jenisbuku.equalsIgnoreCase("Kamus")) {
            harga = 10000;
            jumlahharga = jumlahbeli * harga ;
            diskon = jumlahharga - (jumlahharga*0.10);
            System.out.println("Diskon yang didapat adalah 10%");
            System.out.println("Total yang harus dibayar :" + diskon);
        } 

        else if (jenisbuku.equalsIgnoreCase("Novel")&&jumlahbeli>3) {
            System.out.println("Diskon yang didapat adalah 9%");
            harga = 5000;
            jumlahharga = jumlahbeli * harga ;
            diskon = jumlahharga - (jumlahharga*0.9);
        }else if (jenisbuku.equalsIgnoreCase("Novel")) {
            System.out.println("Diskon yang didapat adalah 8%");
            harga = 5000;
            jumlahharga = jumlahbeli * harga ;
            diskon = jumlahharga - (jumlahharga*0.8);
            System.out.println("Total yang harus dibayar :" + diskon);
         }
        else {
            if (jumlahbeli>5) {
               System.out.println("Diskon yang didapat adalah 5%");
            harga = 5000;
            jumlahharga = jumlahbeli * harga ;
            diskon = jumlahharga - (jumlahharga*0.5);
            System.out.println("Total yang harus dibayar :" + diskon);
            }
        }
    }
}
