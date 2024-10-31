package Pertemuan9;

import java.util.Scanner;

public class RataNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float nilai,totalNilai,ratanilai;
        int i=1,j;
        while (i<=5) {
            totalNilai = 0;
            System.out.println("Input nilai mahasiswa ke " + i);
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilai= sc.nextFloat();
                totalNilai += nilai;
            }
            ratanilai = totalNilai/5;
            System.out.println("Rata rata nilai mahasiswa ke " + i + " : " + ratanilai);
            i++;
        }
        
           
        }
    }
