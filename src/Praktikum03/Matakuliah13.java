package Praktikum03;

import java.util.Scanner;

public class Matakuliah13 {
    Scanner sc = new Scanner (System.in) ;
    public String kode,dump;
    public String nama;
    public int sks;
    public int jumlahjam;

    public Matakuliah13(String kode,String nama,int sks,int jumlahjam){
    this.kode = kode;
    this.nama = nama;
    this.sks = sks;
    this.jumlahjam = jumlahjam;
    }

    void tambahdata(){
        System.out.print("Kode          : ");
        kode = sc.nextLine();
        System.out.print("Nama          : ");
        nama = sc.nextLine();
        System.out.print("Sks           : ");
        dump = sc.nextLine();
        sks = Integer.parseInt(dump);
        System.out.print("jumlah jam    : ");
        dump = sc.nextLine();
        jumlahjam = Integer.parseInt(dump);
    }

    void cetakinfo(){
        System.out.println("KODE           : " + kode);
        System.out.println("NAMA           : " + nama);
        System.out.println("SKS            : " + sks);
        System.out.println("Jumlah jam     : " + jumlahjam);
    }


}
