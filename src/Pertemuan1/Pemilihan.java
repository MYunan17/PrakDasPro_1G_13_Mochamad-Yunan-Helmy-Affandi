package Pertemuan1;

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int nilaiakhir;
        String nilaihuruf;

        System.out.println("Program menghitung nilai akhir");
        System.out.println("=============================");
        System.out.print("Massukan Nilai Tugas : ");
        int tugas = sc.nextInt();
        System.out.print("Massukan Nilai Kuis : ");
        int Kuis = sc.nextInt();
        System.out.print("Massukan Nilai UTS : ");
        int UTS = sc.nextInt();
        System.out.print("Massukan Nilai UAS : ");
        int UAS = sc.nextInt();
        System.out.println("=============================");
        nilaiakhir = tugas*20/100 + Kuis*20/100 + UTS*30/100 + UAS*30/100  ;
        if (tugas<0 || tugas>100 || Kuis<0 || Kuis>100 || UTS<0 || UTS>100 || UAS<0 || UAS>100) {
            System.out.println("Nilai Tidak Valid ");

        }else if(tugas>0 && tugas<=100 || Kuis>0 && Kuis<=100 || UTS>0 && UTS<=100 || UAS>0 && UAS<=100) {
            System.out.println("Nilai Akhir : "+nilaiakhir);
            if (nilaiakhir>80 && nilaiakhir>=100) {
                System.out.println("Nilai Huruf : A");
                System.out.println("=============================");
                System.out.println("Selamat anda lulus !!!");
            }else if (nilaiakhir>74 && nilaiakhir<=80){
                System.out.println("Nilai Huruf : B+");
                System.out.println("=============================");
                System.out.println("Selamat anda lulus !!!");
            }else if (nilaiakhir>65 && nilaiakhir<=73){
                System.out.println("Nilai Huruf : B");
                System.out.println("=============================");
                System.out.println("Selamat anda lulus !!!");
            }else if (nilaiakhir>60 && nilaiakhir<=65){
                System.out.println("Nilai Huruf : C+");
                System.out.println("=============================");
                System.out.println("Selamat anda lulus !!!");
            }else if (nilaiakhir>50 && nilaiakhir<=60){
                System.out.println("Nilai Huruf : C");
                System.out.println("=============================");
                System.out.println("Selamat anda lulus !!!");
            }else if (nilaiakhir>39 && nilaiakhir<=50){
                System.out.println("Nilai Huruf : D");
                System.out.println("=============================");
                System.out.println("Selamat anda Tidak lulus !!!");
            }else if (nilaiakhir<=39){
                System.out.println("Nilai Huruf : E");
                System.out.println("=============================");
                System.out.println("Selamat anda Tidak lulus !!!");
            }
           
        }

    }
}
