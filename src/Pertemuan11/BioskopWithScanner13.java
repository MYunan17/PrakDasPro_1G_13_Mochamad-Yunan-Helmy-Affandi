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
                    System.out.println("");
                    System.out.print("Massukan nama : ");
                    String nama = sc.nextLine();
                    while (true) {
                        System.out.print("Massukan baris : ");
                        baris = sc.nextInt(); 
                        if (baris <1 || baris > 4) {
                            System.out.println("Kursi di baris ini tidak tersedia,silahkan input ulang ");
                            continue;
                        }else {
                            break;
                        }  
                    }
                    while (true) {
                        System.out.print("Massukan Kolom : ");
                        Kolom = sc.nextInt();
                        if (Kolom <1 || Kolom>2) {
                            System.out.println("Kursi di kolom ini tidak tersedia,silahkan input ulang  ");
                            continue;
                        }else{
                            break;  
                        }  
                    }

                    if (penonton[baris-1][Kolom-1] != null) {
                        System.out.println("Kursi sudah terisi ,silahkan melakukan input ulang");
                        continue;
                    }
        
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
                    String keluar = (penonton[i][k] != null) ? penonton[i][k] : "***";
                    System.out.println("Penonton baris " + (i+1)+" Kolom "+(k+1)+" : " + keluar);
                    if (penonton[i][k] == null) {
                        
                    }
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