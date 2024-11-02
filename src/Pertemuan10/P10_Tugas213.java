package Pertemuan10;

import java.util.Scanner;

public class P10_Tugas213 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int  jumlah,total=0;
        System.out.print("Massukan jumlah pesanan : ");
        jumlah = sc.nextInt() ;
        String [] namapsn = new String[100];
        int [] hargapsn = new int[100];

        for (int i = 0; i < jumlah; i++) {
            sc.nextLine();
            System.out.print("Massukan makanan/minuman yang dipesan ke-" +(i+1)+" : ");
            namapsn[i] = sc.nextLine();
            System.out.print("Massukan harga makanan/minuman ke-"+(i+1)+" : ");
            hargapsn[i] = sc.nextInt();
            total += hargapsn[i];
        }
        System.out.println();
        System.out.println("Daftar makanan/minuman yang sudah dipesan : ");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i+1)+". " + namapsn[i]);
        }
        System.out.println();
        System.out.println("Total biaya dari semua pesanan : RP." + total);
    }
}