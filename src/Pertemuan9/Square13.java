package Pertemuan9;

import java.util.Scanner;

public class Square13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Massukan nilai N : ");
        int N =sc.nextInt();
        for (int iouter = 1; iouter <=N; iouter++) {
            for (int i= 0; i <=N; i++) {
                System.out.print("*");
            }
           System.out.println();
        }
    }
}
