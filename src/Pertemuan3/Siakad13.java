package Pertemuan3;

import java.util.Scanner;

public class Siakad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
    String nama, nim ;
    char kelas ;
    byte absen ;
    Double nilaiKuis,nilaiTugas,nilaiUjian,nilai-Akhir;
    System.out.print("Masukkan Nama :");
    nama = sc.nextLine();
    System.out.print("Masukkan NIM :");
    nim = sc.nextLine();
    System.out.print("Masukkan Kelas :");
    kelas = sc.nextLine().charAt (4);
    System.out.print("Masukkan nomor absen :");
    absen = sc.nextByte();
    System.out.print("Nilai kuis :");
    nilaiKuis = sc.nextDouble();
    System.out.print("Nilai Tugas :");
    nilaiTugas = sc.nextDouble() ;
    System.out.print("Nilai Ujian :");
    nilaiUjian = sc.nextDouble() ;
    nilai-Akhir = (nilaiKuis + nilaiTugas + nilaiUjian)/3 ;
    System.out.println("Mahasiswa dengan Nama " + nama + " dan NIM :" + nim + " dari Kelas :" + kelas + " Absen :" + absen);
    System.out.println("Nilai akhir :" + nilaiAkhir);

    }
}
