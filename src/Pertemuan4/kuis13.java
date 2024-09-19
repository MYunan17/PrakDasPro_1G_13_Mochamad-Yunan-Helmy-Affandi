package Pertemuan4 ;

import java.util.Scanner;

public class kuis13 {
public static void main(String[] args)  {
    Scanner input = new Scanner(System.in) ;
    String nama13, NIM13 ;
    byte Absen13 ;
    System.out.print(" Nama  : ");
    nama13 = input.nextLine() ;
    System.out.print(" NIM   : ");
    NIM13 = input.nextLine() ;
    System.out.print(" Absen : ");
    Absen13 = input.nextByte() ;
    System.out.println("============= QUIZ 1 T1-1G =============");
    byte Tanggal13 ,Bulan13 ;
    int Tahun13 ;
    System.out.print("Masukkan Tanggal Berangkat : ");
    Tanggal13 = input.nextByte();
    System.out.print("Masukkan bulan berangkat : ");
    Bulan13 = input.nextByte();
    System.out.print("Masukkan tahun berangkat : ");
    Tahun13 = input.nextInt() ;
    System.out.println("Tanggal Berangkat  : "+ Tanggal13 + "-" + Bulan13 + "-" + Tahun13) ;

    byte tglpulang13,blnpulang13 ;
    int thnPulang13 ;
    System.out.print("Masukkan tanggal Pulang : ");
    tglpulang13 = input.nextByte();
    System.out.print("Masukkan bulan pulang : " );
    blnpulang13 = input.nextByte();
    System.out.print("Masukkan Tahun pulang  : " );
    thnPulang13 = input.nextInt();
    System.out.println("Tanggal Kepulangan : "+ tglpulang13 + "-" + blnpulang13 + "-" + thnPulang13) ;
    double lamastd13 ;
    lamastd13 = (tglpulang13 + Tanggal13)  ;

    System.out.println("Lama studi: " + lamastd13 + "-") ;


}
    
}
