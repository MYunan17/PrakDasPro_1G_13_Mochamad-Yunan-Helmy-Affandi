package Pertemuan11;

import java.util.Scanner;

public class BioskopWithScanner13 {

    public static void main(String[] args) {
        String[] [] penonton = new String [4][2];
        Scanner sc = new Scanner (System.in);
        int baris,Kolom;
        while (true) {
            System.out.println("Menu 1: Input data penonton");
            System.out.println("Menu 2: Tampilkan daftar penonton");
            System.out.println("Menu 3: Exit");
            System.out.print("Massukan menu : ");
            String menu = sc.nextLine() ;
            if (menu.equals("1")) {
                while (true) {
                    System.out.print("Massukan nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Massukan baris : ");
                    baris = sc.nextInt();
                    System.out.print("Massukan Kolom : ");
                    Kolom = sc.nextInt();
        
                    sc.nextLine();
                    penonton[baris-1][Kolom-1] = nama ;   
                    
                    System.out.print("Input penonton lainnya? (y/n) : ");
                    String next = sc.nextLine();
                    if (next.equalsIgnoreCase("N")) {
                        break;
                    }
                    
                }  
            }
            if (menu.equals("2")) {
                System.out.println("Daftar penonton : ");
                int i=0;
                while (i<4) {
                int k = 0 ;
                while (k<2) {
                    System.out.println("Penonton baris " + (i+1)+" Kolom "+(k+1)+" : " + penonton[i][k]);
                    k++;
                }
                i++;
            }    
            }
            if (menu.equals("3")) {
                System.out.println("Layanan dihentikan");
                break;
            }

        }
    }
}