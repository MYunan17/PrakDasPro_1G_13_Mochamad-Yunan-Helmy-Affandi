package Pertemuan9;

import java.util.Scanner;

public class P9_Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String Nama;
      
        for (int i = 1; i > 0; i++) {
            System.out.print("Massukan nama politeknik ke-" +i + " : ");
            Nama = sc.nextLine();   
            for (int a = 1; a <= 4 ; a++) {
                if (a==1) {
                    System.out.println("Nama atlet yang mengikuti badminton : ");
                    for (int j = 1; j <=5; j++) {
                        System.out.print("Atlet ke-" + j + " :");
                        Nama = sc.nextLine();
                    }
                }
                if (a==2) {
                    System.out.println("Nama atlet yang mengikuti Tenis meja : "); 
                    for (int j = 1; j <=5; j++) {
                        System.out.print("Atlet ke-" + j + " :");
                        Nama = sc.nextLine();
                    }
                }
                if (a==3) {
                    System.out.println("Nama atlet yang mengikuti Basket : "); 
                    for (int j = 1; j <=5; j++) {
                        System.out.print("Atlet ke-" + j + " :");
                        Nama = sc.nextLine();
                    }
                }
                if (a==4) {
                    System.out.println("Nama atlet yang mengikuti Bola voly : "); 
                    for (int j = 1; j <=5; j++) {
                        System.out.print("Atlet ke-" + j + " :");
                        Nama = sc.nextLine();
                    }
                }
                
            }
        }
        
            
    }
}
