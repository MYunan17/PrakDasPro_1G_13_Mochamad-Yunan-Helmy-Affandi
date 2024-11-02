package Pertemuan10;

import java.util.Scanner;

public class SearchNilai13 {
    public static void main(String[] args) {
        int[] arrNilai = new int[100];
        int key = 0;
        int hasil = -1,jumlah;
        Scanner sc = new Scanner (System.in);
        System.out.print("Massukan banyaknya nilai yang akan di input : ");
        jumlah = sc.nextInt();
        for (int i= 0; i < jumlah; i++) {
            System.out.print("Massukan nilai Mahasiswa ke-"+(i+1)+" : ");
            arrNilai[i] = sc.nextInt();
        }
         System.out.print("Massukan nilai yang ingin dicari : ");
            key = sc.nextInt();

        for (int i = 0; i < jumlah; i++) {
            if (key == arrNilai[i]) {
                hasil = i+1;
                System.out.println();
                System.out.println("Nilai " +key+" ditemukan , merupakan nilai Mahasiswa ke-"+hasil);
                System.out.println();
                break;
            }
            
        }
      if (hasil == -1){
       System.out.println();
       System.out.println("Nilai yang dicari tidak ditemukan !!!");
       System.out.println();
     }
   }
}
