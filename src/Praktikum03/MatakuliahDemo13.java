package Praktikum03;

import java.util.Scanner;

public class MatakuliahDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Massukan Jumlah Matakuliah : ");
        int jumlahmatkul = sc.nextInt();
        Matakuliah13[] arrayofMatakuliah = new Matakuliah13[jumlahmatkul];
        String kode,nama,dump;
        int sks,jumlahjam;
        for (int i = 0; i < arrayofMatakuliah.length; i++) {
            System.out.println("Massukan Data Matakuliah ke-" + (i+1));
            arrayofMatakuliah[i] = new Matakuliah13("", "", 0, 0);
            arrayofMatakuliah[i].tambahdata();
            System.out.println("-------------------------------------------");
        }
        for (int i = 0; i < arrayofMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayofMatakuliah[i].cetakinfo();
            System.out.println("-------------------------------------------");
        }

        
    }

    
}
