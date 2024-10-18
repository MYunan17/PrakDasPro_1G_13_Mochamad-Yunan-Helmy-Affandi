package Pertemuan7;

import java.util.Scanner;

public class P7_Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jenis,total=0,durasi;
        do {
            System.out.print("Massukan input jenis kendaraaan (1.Mobil 2.Motor 0.batal/keluar) : ");
            jenis =sc.nextInt();
            if (jenis == 1 || jenis == 2) {
            System.out.print("Massukan jumlah durasi : ");
            durasi = sc.nextInt();
            if (durasi>5) {
                total+= 12500;
            }else if (jenis==1) {
                total+= durasi*3000;
            }else if (jenis==2){
                total+= durasi*2000;
            }
        }

        }while (jenis != 0);
        System.out.println("Total pendapatan hari ini : " + total);
            
        
    }
}
