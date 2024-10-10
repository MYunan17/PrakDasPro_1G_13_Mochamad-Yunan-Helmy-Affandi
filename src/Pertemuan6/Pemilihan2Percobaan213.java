package Pertemuan6;

import java.util.Scanner;

public class Pemilihan2Percobaan213 {
    public static void main(String[] args) {
        String member ;
        int pilihan_menu;
        double diskon,jumlah_beli,total_bayar,harga;
        Scanner sc13 = new Scanner (System.in);
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("Massukan angka dari menu yang dipilh : ");
        pilihan_menu = sc13.nextInt();
        sc13.nextLine();
        System.out.print("Apakah punya member (y/n) ? =");
        member = sc13.nextLine();
        System.out.println("-------------------------------------");
        if (member.equalsIgnoreCase("y")) {
            diskon =0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl : " + harga);
            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice tea : " + harga);
            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling : " + harga);               
            }else {
                System.out.println("Massukan pilihan menu dengan benar");
                return;
            }
            total_bayar=harga-(harga*diskon);
            System.out.println("Total bayar setelah diskon : " + total_bayar);
        }
        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
              harga = 14000;
              System.out.println("Harga ricebowl" + harga );  
              
            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice tea : " + harga);
            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling : " + harga);
            }else {
                System.out.println("Massukan pilihan menu dengan benar");
                return;
            }
            System.out.println("Total bayar : " + harga);
        }else {
            System.out.println("Member tidak valid");
        }
        System.out.println("------------------------------------");
    }
}
