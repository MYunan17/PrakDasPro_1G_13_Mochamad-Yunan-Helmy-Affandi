package Pertemuan11;

import java.util.Scanner;

public class siakad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nilai = new int [4][3];
        for ( int i = 0; i < nilai.length; i++) {
            System.out.println("input nilai mahasiswa ke-" + (i+1));
            double totalpersiswa = 0 ;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalpersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata rata : " + totalpersiswa/3);  
        }
        System.out.println("=======================================");
        System.out.println("Rata-rata Nilai setiap mata kuliah : ");
        for (int j = 0; j < 3; j++) {
          double totalpermatkul = 0 ;
           for (int i = 0; i < 4; i++) {
            totalpermatkul += nilai[i][j];
           }
           System.out.println("Mata Kuliah "+(j+1)+": "+ totalpermatkul/4);
        }
    }
}
