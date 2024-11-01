package Pertemuan10;

import java.util.Scanner;

public class ArrayRataNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] nilaiMhs= new int [10];
        double total = 0;
        double rata2;
        int lulus=0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Massukan nilai mahasiwa ke-"+(i+1)+" : ");
            nilaiMhs[i]=sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i]>70) {
                lulus++;
            }
        }
        
       
        rata2 = total/nilaiMhs.length;
        System.out.println("Jumlah mahasiswa yang lulus = " + lulus);
        System.out.println("Rata-rata nilai = "+rata2);
    }
}
