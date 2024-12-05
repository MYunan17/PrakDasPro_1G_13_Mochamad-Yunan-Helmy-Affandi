package Pertemuan13;

import java.util.Scanner;

public class Kafe13 {
    public static void menu(String namaPelangan, boolean ismember,String diskon) {
        System.out.println("Selamat datang, "+ namaPelangan + "!");
        if (ismember) {
            System.out.println("Anda adalah member,dapatkan diskon 10% untuk setiap pembelian");
        }
        System.out.println(" ");
        if (diskon.equalsIgnoreCase("diskon50")) {
            System.out.println("Kode promo digunakan !!!, anda mendapatkan diskon sebesar 50%");
        }else if (diskon.equalsIgnoreCase("diskon30")) {
            System.out.println("Kode promo digunakan !, anda mendapatkan diskon sebesar 30%");
        }else System.out.println("kode invalid");


        System.out.println("========= MENU RESTO KAFE =========");
        System.out.println("1. Kopi hitam  - RP 15.000");
        System.out.println("2. Cappuccino - RP 20.000");
        System.out.println("3. Latte - RP 22.000");
        System.out.println("4. Teh Tarik - RP 12.000");
        System.out.println("5. Roti Bakar - RP 10.000");
        System.out.println("6.Mie Roti Goreng - RP 18.000");
        System.out.println("==================================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static int hitungTotalharga13 (int pilihanmenu,int banyakitem) {
        int [] hargaitems = {15000,20000,22000,12000,10000,18000};

        int hargaTotal = hargaitems[pilihanmenu - 1] * banyakitem;
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Massukan nama : ");
        String nama = sc.next();
        System.out.print("apakah anda member ? (true/false) : ");
        boolean member = sc.nextBoolean();
        System.out.print("Massukan kode diskon : ");
        String kode = sc.next();
        menu(nama,member,kode);
        
        int total= 0;

        while (true) {
            System.out.print("\nMassukan nomor menu yang ingin anda pesan ");
            int pilihanmenu = sc.nextInt();
            System.out.print("Massukan jumlah item yang ingin anda pesan ");
            int banyakitems = sc.nextInt();
            System.out.print("Tambah pesanan lagi ? (y/n): ");
            String tambah = sc.next();
            int totalharga = hitungTotalharga13(pilihanmenu, banyakitems);
            total += totalharga;
            if (tambah.equalsIgnoreCase("n")) {
                if (kode.equalsIgnoreCase("diskon30")) {
                     int bayar = total * 70/100 ;
                    System.out.println("Total harga untuk pesanan Anda : Rp" +bayar);
                    System.out.println("Terimakasih sudah belanja");
                    break;
                }else if (kode.equalsIgnoreCase("diskon50")) {
                    int bayar = total * 50/100 ;
                    System.out.println("Total harga untuk pesanan Anda : Rp" +bayar);
                    System.out.println("Terimakasih sudah belanja");
                    break;
                }else {
                    System.out.println("Total harga untuk pesanan Anda : Rp" +totalharga);
                    System.out.println("Terimakasih sudah belanja");
                    break;
                }
                
        }
            
        }

        
    }
}
