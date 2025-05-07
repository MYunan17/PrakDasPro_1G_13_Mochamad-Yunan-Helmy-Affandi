package Pertemuan1;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long n ;
        System.out.print("Massukan NIM : ");
        long NIM =sc.nextLong();
        n = NIM%100;
        
        System.out.println(n);
        if (n<10) {
            n+=10;
           System.out.println("N : " + n);
        }
        for (int i = 1; i < n+1; i++) {
            if (i%2!=0 || i == 6 || i == 10 ) {
                System.out.print("*");
            }else
                System.out.print(i);
            
            
        }
    }
}
