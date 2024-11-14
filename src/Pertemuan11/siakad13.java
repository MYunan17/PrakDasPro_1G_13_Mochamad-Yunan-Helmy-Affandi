package Pertemuan11;

import java.util.Scanner;

public class siakad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0 ,k = 0;
        System.out.print("Massukan jumlah mahasiswa : ");
        n = sc.nextInt();
        System.out.print("Massukan jumlah mata kuliah : ");
        k = sc.nextInt();
        int[][] nilai = new int [n][k];
        for ( int i = 0; i < nilai.length; i++) {
            System.out.println("input nilai mahasiswa ke-" + (i+1));
            double totalpersiswa = 0 ;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalpersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata rata : " + totalpersiswa/nilai[i].length);  
        }
        System.out.println("=======================================");
        System.out.println("Rata-rata Nilai setiap mata kuliah : ");
        for (int j = 0; j < nilai[0].length; j++) {
          double totalpermatkul = 0 ;
           for (int i = 0; i < nilai.length; i++) {
            totalpermatkul += nilai[i][j];
           }
           System.out.println("Mata Kuliah "+(j+1)+": "+ totalpermatkul/nilai.length);
        }
    }
}
