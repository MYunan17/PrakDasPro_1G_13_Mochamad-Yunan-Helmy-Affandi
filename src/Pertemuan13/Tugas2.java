package Pertemuan13;

import java.util.Scanner;

public class Tugas2 {

    public static void penjualan(int[][]jumlahjual,String[]menu) {
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < jumlahjual.length; i++) {
            System.out.println("Penjualan hari ke - " + (i+1));
            for (int j = 0; j < menu.length; j++) {
                System.out.print(menu[j]+" : ");
                jumlahjual[i][j] = sc.nextInt();
            }
        }
        
        
    }
    public static void tampil(int[][] jumlahjual,String[] menu){
        System.out.println("\t   \tHari 1 \tHari 2 \tHari 3 \tHari 4 \tHari 5 \tHari 6 \tHari 7");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i]);
            for (int j = 0; j < jumlahjual.length; j++) {
                System.out.print("       "+jumlahjual[j][i]);
            }
            System.out.println();
        }
    }
    public static void tampilmenti(int[][] jumlahjual,String[] menu){

        int max = 0 ;
        String tertinggi = "";
         for (int i = 0; i < menu.length; i++) {
             int jual = 0;
             for (int j = 0; j < jumlahjual.length; j++) {
                 jual += jumlahjual[j][i];
             if (jual>max) {
                 max = jual;
                 tertinggi = menu[i];
 
             }
         }
        }
        System.out.println("Menu penjualan tertinggi "+tertinggi+"dengan total"+max +" penjualan");
    }
    public static void ratarata(int[][] jumlahjual,String[] menu){

    System.out.println("Rata rata penjualan per menu : ");
    for (int i = 0; i < 5; i++) {
        int total = 0;
        for (int j = 0; j < 7; j++) {
            total += jumlahjual[j][1];
        }
    double ratarata = (double) total/7;
    System.out.println(menu[i]+":"+ ratarata);
    }
    }
         
     public static void main(String[] args) {
         int[][]jumlahtotal= new int[7][5];
         String[]menu = {"Kopi      ","Teh       ","es degan  ","roti bakar","gorengan  "};
         penjualan(jumlahtotal, menu);
         tampil(jumlahtotal, menu);
         tampilmenti(jumlahtotal, menu);
         ratarata(jumlahtotal, menu);

    }
}

