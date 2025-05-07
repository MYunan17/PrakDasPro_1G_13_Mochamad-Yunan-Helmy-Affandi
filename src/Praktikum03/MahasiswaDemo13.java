package Praktikum03;

import java.util.Scanner;

import pertemuan2.mahasiswa13;

public class MahasiswaDemo13 {
    public static void main(String[] args) {
        Mahasiswa13 [] arrayofMahasiswa = new Mahasiswa13[3];
        Scanner sc = new Scanner (System.in) ;
        String dump;
        for (int i = 0; i < 3; i++) {
            arrayofMahasiswa[i] = new Mahasiswa13();

            System.out.println("Massukan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM     : ");
            arrayofMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayofMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayofMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dump = sc.nextLine();
            arrayofMahasiswa[i].ipk = Float.parseFloat(dump);
            System.out.println("--------------------------------------------");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            arrayofMahasiswa[i].cetakinfo();
            System.out.println("--------------------------------------------");
        }

        Mahasiswa13 [] myarrayOfMahasiswa13 = new Mahasiswa13[3];
        myarrayOfMahasiswa13[0].nim = "244107060033";
        myarrayOfMahasiswa13[0].nama = "AGNES TITANIA KINANTI";
        myarrayOfMahasiswa13[0].kelas = "SIB-1E";
        myarrayOfMahasiswa13[0].ipk = (float) 3.75;

        

        
    }
}
