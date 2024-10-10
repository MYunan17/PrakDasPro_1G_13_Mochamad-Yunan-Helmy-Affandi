package Pertemuan6;

import java.util.Scanner;

public class P6_Tugas3 {
    public static void main(String[] args) {
    Scanner input13= new Scanner (System.in);
    String merk,kategori ;
    int ukuran ;
    System.out.print("Merk sepatu :");
    merk = input13.nextLine();
    System.out.print("Massukan Kategori Sepatu : ");
    kategori = input13.nextLine();
    System.out.print("Massukan ukuran Sepatu : ");
    ukuran = input13.nextInt();
    
    if (merk.equalsIgnoreCase("Converse")) {
        if (kategori.equalsIgnoreCase("Slip On")) {
            if (ukuran == 36) {
             System.out.println("Harga 800000");
            } else if (ukuran == 37) {
            System.out.println("Harga 800000");
            } else if (ukuran == 38) {
             System.out.println("Harga 800000");
            } else if (ukuran == 39) {
            System.out.println("Harga 800000");
            } else if (ukuran == 40) {
            System.out.println("Harga 800000");
            }
        } else if (kategori.equalsIgnoreCase("High Top")) {
            if (ukuran == 40) {
                System.out.println("Harga 1200000");
            } else if (ukuran == 41) {
                System.out.println("Harga 1200000");
            } else if (ukuran == 42) {
                 System.out.println("Harga 1200000");
                } else if (ukuran == 43) {
                System.out.println("Harga 1200000");
            } else if (ukuran == 44) {
                System.out.println("Harga 1200000");
            }
        }
    } else if (merk.equalsIgnoreCase("Sketcher")) {
        if (kategori.equalsIgnoreCase("Woman")) {
            if (ukuran == 36) {
                System.out.println("Harga 1000000");
            } else if (ukuran == 37) {
                System.out.println("Harga 1000000");
            } else if (ukuran == 38) {
                System.out.println("Harga 1000000");
            } else if (ukuran == 39) {
                System.out.println("Harga 1000000");
            } else if (ukuran == 40) {
                System.out.println("Harga 1000000");
            } else if (ukuran == 41) {
                System.out.println("Harga 1000000");
            }
        } else if (kategori.equalsIgnoreCase("Man")) {
            if (ukuran == 41) {
                System.out.println("Harga 1800000");
            } else if (ukuran == 42) {
                System.out.println("Harga 1800000");
            } else if (ukuran == 43) {
                System.out.println("Harga 1800000");
            } else if (ukuran == 44) {
                System.out.println("Harga 1800000");
            }
        }
    } else if (merk.equalsIgnoreCase("Nike")) {
        if (kategori.equalsIgnoreCase("Kids")) {
            if (ukuran == 36) {
                System.out.println("Harga 750000");
            } else if (ukuran == 37) {
                System.out.println("Harga 750000");
            } else if (ukuran == 38) {
                System.out.println("Harga 750000");
            } else if (ukuran == 39) {
                System.out.println("Harga 750000");
            } else if (ukuran == 40) {
                System.out.println("Harga 750000");
            }
        } else if (kategori.equalsIgnoreCase("Adult")) {
            if (ukuran == 40) {
                System.out.println("Harga 1500000");
            } else if (ukuran == 41) {
                System.out.println("Harga 1500000");
            } else if (ukuran == 42) {
                System.out.println("Harga 1500000");
            } else if (ukuran == 43) {
                System.out.println("Harga 1500000");
            } else if (ukuran == 44) {
                System.out.println("Harga 1500000");
            }
        }
    }
}
}