package Pertemuan10;

import java.util.Scanner;

public class ArrayRataNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jumlah;
        System.out.print("Massukan jumlah mahasiswa : ");
        jumlah = sc.nextInt();
        int[] nilaiMhs= new int [10];
        double total1 = 0,total2 = 0;
        double rata2,rata1;
        int lulus=0,TidakLulus=0;
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Massukan nilai mahasiwa ke-"+(i+1)+" : ");
            nilaiMhs[i]=sc.nextInt();
        }
        for (int i = 0; i < jumlah; i++) {
            if (nilaiMhs[i]>70) {
                lulus++;
                total1 += nilaiMhs[i];
            }
            if (nilaiMhs[i]>=0 && nilaiMhs[i]<=70) {
                total2 += nilaiMhs[i];
                TidakLulus++;
            }
        }
        rata1 = total1/lulus;
        rata2 = total2/TidakLulus;
        System.out.println("Nilai Rata-rata mahasiswa yang lulus = " + rata1);
        System.out.println("Nilai Rata-rata mahasiswa yang tidak lulus = " + rata2);
        
    }
}
