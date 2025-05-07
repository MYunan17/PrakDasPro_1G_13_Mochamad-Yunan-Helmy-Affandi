package Praktikum03;

import java.util.Scanner;

public class dosendemo13 {
    public static void main(String[] args) {
    String kode,nama;
    Boolean jeniskelamin;
    int usia;
    Scanner sc = new Scanner (System.in);
    dosen13 [] arrayofDosen = new dosen13[3];
    for (int i = 0; i < 3; i++) {
        System.out.println("Massukan data dosen ke-" + (i+1));
        System.out.print("Kode         : ");
        kode = sc.nextLine();
        System.out.print("nama         : ");
        nama = sc.nextLine();
        System.out.print("jeniskelamin : ");
        jeniskelamin = sc.next().equalsIgnoreCase("l")? true : false;
        System.out.print("usia         : ");
        usia = sc.nextInt();
        arrayofDosen[i] = new dosen13(kode,nama,jeniskelamin,usia);
        sc.nextLine();
    }
    for (dosen13 dsn : arrayofDosen) {
        System.out.println("----------------------");
        System.out.println("Kode         : " + dsn.kode);
        System.out.println("Nama         : " + dsn.nama);
        System.out.println("Jenis Kelamin: " + (dsn.jeniskelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia         : " + dsn.usia);
        System.out.println("----------------------");
    }

    DataDosen13 dataDosen13 = new DataDosen13();
    dataDosen13.datasemuaDosen(arrayofDosen);
    dataDosen13.jumlahdosenperjeniskelamin(arrayofDosen);
    dataDosen13.reratausiadosenperjeniskelamin(arrayofDosen);
    dataDosen13.infoDosenPalingTua(arrayofDosen);
    dataDosen13.infoDosenPalingmuda(arrayofDosen);


    }
    
}
