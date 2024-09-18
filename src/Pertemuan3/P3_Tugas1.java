package Pertemuan3;

import java.util.Scanner;

public class P3_Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tarflistrik = 1500.0;
        System.out.print("Masukkan jumlah penggunaan listrik dalam KWH : "); 
        int penlistrik ;
        penlistrik = input.nextInt();
        boolean lebih500kwhatautidak = penlistrik > 500;
        System.out.println("Melebihi 500 KWH (True/False) : " + lebih500kwhatautidak);
        double tariflistrik = penlistrik * tarflistrik ;
        System.out.println("Tarif listrik yang harus dibayar : " + tariflistrik);
    }
}
