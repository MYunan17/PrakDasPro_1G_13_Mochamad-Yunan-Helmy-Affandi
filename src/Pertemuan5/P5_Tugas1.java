package Pertemuan5;
import java.util.Scanner;

public class P5_Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
    String nama, nim ;
    char kelas ;
    byte absen ;
    float nilaiKuis,nilaiTugas,nilaiUTS,nilaiUAS,nilaiAkhir;
    System.out.print("Masukkan Nama :");
    nama = sc.nextLine();
    System.out.print("Masukkan NIM :");
    nim = sc.nextLine();
    System.out.print("Masukkan Kelas :");
    kelas = sc.nextLine().charAt (1);
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
    nilaiAkhir = (nilaiKuis + nilaiUTS + nilaiTugas + nilaiUAS) ;
    System.out.println("Mahasiswa dengan Nama " + nama + " dan NIM :" + nim + " dari Kelas :" + kelas + " Absen :" + absen);
    System.out.println("Nilai akhir :" + nilaiAkhir);

    if (nilaiAkhir>80 && nilaiAkhir<=100){
        System.out.println("Nilai Akhir Huruf : A");
        System.out.println("Kualifikasi : sangat baik");  
    }
    if (nilaiAkhir>73 && nilaiAkhir<=80){
        System.out.println("Nilai Akhir Huruf : B+");
        System.out.println("Kualifikasi : Lebih dari baik");  
    }
    if (nilaiAkhir>65 && nilaiAkhir<=73){
        System.out.println("Nilai Akhir Huruf : B");
        System.out.println("Kualifikasi : baik");  
    }
    if (nilaiAkhir>60 && nilaiAkhir<=65){
        System.out.println("Nilai Akhir Huruf : C+");
        System.out.println("Kualifikasi : Lebih dari cukup");  
    }
    if (nilaiAkhir>50 && nilaiAkhir<=60){
        System.out.println("Nilai Akhir Huruf :C");
        System.out.println("Kualifikasi : cukup");  
    }
    if (nilaiAkhir>39 && nilaiAkhir<=50){
        System.out.println("Nilai Akhir Huruf :  D");
        System.out.println("Kualifikasi : Kurang");  
    }
    if (nilaiAkhir<39){
        System.out.println("Nilai Akhir Huruf : E");
        System.out.println("Kualifikasi : Gagal");  
    }
    }
    
}