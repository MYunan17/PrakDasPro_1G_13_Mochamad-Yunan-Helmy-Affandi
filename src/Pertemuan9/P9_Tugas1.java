package Pertemuan9;

import java.util.Scanner;

public class P9_Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N : ");
        int N = sc.nextInt();

       for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= N; j++) {
            if (i == 1 || i == N || j == 1 || j == N) {
                System.out.print(N +" "); 
            } else {
                System.out.print("  "); 
            }
        }
        System.out.println();
       }
    }
}
