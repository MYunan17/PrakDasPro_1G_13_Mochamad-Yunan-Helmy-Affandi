package Pertemuan1;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Jumlah Mata Kuliah : ");
    int jumlah = sc.nextInt();
    String[] mk = new String [jumlah];
    String[] NilaiHuruf = new String [jumlah];
    double[] BobotNilai = new double [jumlah];
    String[] Nilai1 = {"A","B+","C","C+","D"+"E"};
    int[] Nilai = new int [jumlah];
    for (int i = 0; i < mk.length; i++) {
        System.out.print("Mata Kuliah : ");
        mk[i] = sc.next();
      } 
    System.out.println("Program Menghitung IP Semester");
    for (int i = 0; i < jumlah; i++) {
        System.out.print("Massukan nilai Angka untuk MK " + mk[i] + " : ");
        Nilai[i] = sc.nextInt();
      }

    for (int i = 0; i < mk.length; i++) {
    if (Nilai[i]>80 && Nilai[i]>=100) {
            NilaiHuruf[i]=Nilai1[0];
    }else if (Nilai[i]>73 && Nilai[i]>=80) {
        NilaiHuruf[i]=Nilai1[1];
    }else if (Nilai[i]>65 && Nilai[i]>=73) {
        NilaiHuruf[i]=Nilai1[2];
    }else if (Nilai[i]>60 && Nilai[i]>=65) {
        NilaiHuruf[i]=Nilai1[3];
    }else if (Nilai[i]>50 && Nilai[i]>=60) {
        NilaiHuruf[i]=Nilai1[4];
    }else if (Nilai[i]>39 && Nilai[i]>=50) {
        NilaiHuruf[i]=Nilai1[5];
    }else if (Nilai[i]<=39) {
        NilaiHuruf[i]=Nilai1[6];
    }
}
    for (int i = 0; i < mk.length; i++) {
    if (Nilai[i]>80 && Nilai[i]>=100) {
            BobotNilai[i]= 4;
    }else if (Nilai[i]>73 && Nilai[i]>=80) {
            BobotNilai[i]= 3.5;
    }else if (Nilai[i]>65 && Nilai[i]>=73) {
            BobotNilai[i]= 3;
    }else if (Nilai[i]>60 && Nilai[i]>=65) {
            BobotNilai[i]= 2.5;
    }else if (Nilai[i]>50 && Nilai[i]>=60) {
            BobotNilai[i]= 2;
    }else if (Nilai[i]>39 && Nilai[i]>=50) {
            BobotNilai[i]= 1;
    }else if (Nilai[i]<=39) {
            BobotNilai[i]= 0;
    }
}

System.out.println("MK               \t       Nilai angka   \t             Nilai huruf     \t        Bobot Nilai");
for (int i = 0; i < Nilai.length; i++) {
    System.out.println(mk[i] +"\t\t\t\t" + Nilai[i] + "\t\t\t\t" + NilaiHuruf[i] +"\t\t\t\t" +BobotNilai[i]);
}
double ict = jumlah;
double ikt=0,ip=0 ;
for (int i = 0; i < Nilai.length; i++) {
     ikt += BobotNilai[i] ; 
}
ip=ikt/jumlah;
System.out.println("IP : " + ip);
}
}
