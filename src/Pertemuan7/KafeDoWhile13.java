package Pertemuan7;

import java.util.Scanner;

public class KafeDoWhile13 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int kopi,teh,roti,hargakopi=12000,hargateh=7000,hargaroti=20000,totalHarga;
    String namapelangan;
    do {
    System.out.print("Massukan nama pelanggan (ketik 'batal' untuk keluar) : ");
    namapelangan = sc.nextLine();
    if (namapelangan.equalsIgnoreCase("Batal")) {
        System.out.println("Transaksi dibatalkan");
        break;
    }
    System.out.print("Jumlah kopi : ");
    kopi = sc.nextInt();
    System.out.print("Jumlah teh : ");
    teh = sc.nextInt();
    System.out.print("Jumlah roti : ");
    roti = sc.nextInt();
    totalHarga = (kopi * hargakopi) + (teh * hargateh) + (roti * hargaroti);
    System.out.println("Total yang harus dibayar : Rp " + totalHarga);
    sc.nextLine();
    } while (true);
    System.out.println("Semua transaksi selesai.");
}
    
}