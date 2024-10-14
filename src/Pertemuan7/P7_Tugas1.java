package Pertemuan7;

import java.util.Scanner;

public class P7_Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String beli ;
        int i=1;
        double jumlahtiket,totalharga,harga=50000,harusdibayar,total=0,alltiket=0,dibayar;
        do {
            System.out.print("Apakah masih akan buka (ya/tidak) : ");
            beli = sc.next();
            if (beli.equalsIgnoreCase("tidak")) {
                System.out.println("Toko tutup ,Transaksi hari ini selesai !!");
                System.out.println("Total tiket yang terjual hari ini : " + alltiket);
                System.out.println("Total pendapatan hari ini : " + total);
                break;
            }
            System.out.println("Pembeli ke " + i );
            System.out.print("Massukan jumlah tiket yang akan dibeli: ");
            jumlahtiket = sc.nextInt();
            if (jumlahtiket>4 && jumlahtiket<15) {
                System.out.println("Mendapatkan diskon 10%");
                totalharga = jumlahtiket*harga;
                harusdibayar = totalharga - (totalharga*0.10);
                System.out.println("Jumlah yang harus dibayar : " + harusdibayar);
                total += harusdibayar;
                alltiket += jumlahtiket;
            }else if (jumlahtiket<4) {
                totalharga = jumlahtiket*harga;
                harusdibayar = totalharga;
                System.out.println("Jumlah yang harus di bayar : " + harusdibayar);
                total += harusdibayar;
                alltiket += jumlahtiket;
            }else if (jumlahtiket>15) {
                System.out.println("mendapatkan diskon 15%");
                totalharga = jumlahtiket*harga;
                harusdibayar = totalharga - (totalharga*0.15);
                System.out.println("Jumlah yang harus dibayar : " + harusdibayar);
                total += harusdibayar;
                alltiket += jumlahtiket;
            }else if (jumlahtiket <= 0) {
                System.out.println("Massukan jumlah tiket yang valid!");
                continue;
            }else {

            }
            i++;
        } while (beli.equalsIgnoreCase("ya"));
            

        
    }
}
