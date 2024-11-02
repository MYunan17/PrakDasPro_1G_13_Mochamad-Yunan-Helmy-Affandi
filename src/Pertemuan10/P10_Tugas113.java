package Pertemuan10;

import java.util.Scanner;

public class P10_Tugas113 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jumlah;
        double total=0,rata,tertinggi=0,terendah=100;
        System.out.print("Massukan jumlah nilai mahasiwa yang akan di input : ");
        jumlah = sc.nextInt();
        int [] nilaimhs = new int [1000];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Massukan nilai mahasiswa ke-"+(i+1)+ " : ");
            nilaimhs[i] = sc.nextInt();

        }
        for (int i = 0; i < jumlah; i++) {
            total += nilaimhs[i];
            if (nilaimhs[i]>tertinggi) {
                tertinggi = nilaimhs[i];
            }
            if (nilaimhs[i]<terendah) {
                terendah = nilaimhs[i];
            }
        }
        rata = total/jumlah;
        System.out.println("Jumlah rata rata nilai mahasiswa adalah " +rata);
        System.out.println("Nilai tertinggi mahasiswa adalah "+tertinggi);
        System.out.println("Nilai terendah mahasiswa adalah "+terendah);
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai mahasiswa ke-"+(i+1)+" : "+nilaimhs[i]);
        }
    }
}