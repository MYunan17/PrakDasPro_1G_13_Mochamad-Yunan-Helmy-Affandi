package Pertemuan5;

import java.util.Scanner;

public class P5_Tugas3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in) ;
       int jmlnsi,jmlfyghi,jmlmie ;
       double hargaNasi = 30000.0, hargafuyung = 25000.0, hargamie = 15000.0;
       System.out.print("Masukkan jumlah pembelian Nasi Goreng : ");
        jmlnsi = sc.nextInt();
        System.out.print("Masukkan jumlah pembelian Fuyunghai : ");
        jmlfyghi = sc.nextInt();
        System.out.print("Masukkan jumlah pembelian Mie Rebus : ");
        jmlmie = sc.nextInt();
        double totalHarga = (jmlnsi * hargaNasi) + (jmlfyghi * hargafuyung) + (jmlmie * hargamie);
        if (totalHarga<100000.00) {
            System.out.println("Item pembelian: " + jmlnsi + " Porsi Nasi Goreng, " + jmlfyghi + " porsi Fuyunghai, " + jmlmie + " porsi Mie rebus");
            System.out.println("Harga yang harus dibayar : " + totalHarga);
        }
        if (totalHarga>=100000.00 && totalHarga<200000.00) {
            System.out.println("Item pembelian: " + jmlnsi + " Porsi Nasi Goreng, " + jmlfyghi + " porsi Fuyunghai, " + jmlmie + " porsi Mie rebus");
            System.out.println("Anda mendapatkan diskons sebesar 2%");
            double diskon1 = totalHarga - (totalHarga*0.02);
            System.out.println("Harga yang harus dibayar : " + diskon1);
        }
        if (totalHarga>=200000.00 && totalHarga<500000.00) {
            System.out.println("Item pembelian: " + jmlnsi + " Porsi Nasi Goreng, " + jmlfyghi + "  porsi Fuyunghai, " + jmlmie + "  porsi Mie rebus");
            System.out.println("Anda mendapatkan diskons sebesar 5%");
            Double diskon2 = totalHarga - (totalHarga*0.05);
            System.out.println("Harga yang harus dibayar : " + diskon2);
        }
        if (totalHarga>=500000.00) {
            System.out.println("Item pembelian: " + jmlnsi + " Porsi Nasi Goreng, " + jmlfyghi + "  porsi Fuyunghai, " + jmlmie + "  porsi Mie rebus");
            System.out.println("Anda mendapatkan diskons sebesar 10%");
            Double diskon3 = totalHarga - (totalHarga*0.1);
            System.out.println("Harga yang harus dibayar : " + diskon3);

        }
        
    }
}
