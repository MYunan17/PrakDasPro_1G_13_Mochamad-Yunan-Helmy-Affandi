package Pertemuan3;

import java.util.Scanner;

public class Siakad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
    String nama, nim ;
    char kelas ;
    byte absen ;
    Float nilaiKuis,nilaiTugas,nilaiUTS,nilaiUAS,nilaiAkhir;
    System.out.print("Masukkan Nama :");
    nama = sc.nextLine();
    System.out.print("Masukkan NIM :");
    nim = sc.nextLine();
    System.out.print("Masukkan Kelas :");
    kelas = sc.nextLine().charAt (4);
    System.out.print("Masukkan nomor absen :");
    absen = sc.nextByte();
    System.out.print("Nilai kuis :");
    nilaiKuis = sc.nextFloat()* (20/100f);
    System.out.print("Nilai Tugas :");
    nilaiTugas = sc.nextFloat()* (15/100f) ;
    System.out.print("Nilai UTS :");
    nilaiUTS = sc.nextFloat()* (30/100f) ;
    System.out.print("Nilai UAS :");
    nilaiUAS = sc.nextFloat()* (35/100f) ;
    nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUAS + nilaiUTS) ;
    System.out.println("Mahasiswa dengan Nama " + nama + " dan NIM :" + nim + " dari Kelas :" + kelas + " Absen :" + absen);
    System.out.println("Nilai akhir :" + nilaiAkhir);

    }
}
