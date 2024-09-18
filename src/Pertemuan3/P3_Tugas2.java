package Pertemuan3;
import java.util.Scanner;

 public class P3_Tugas2 {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah jam Pekerja: ");
    int Jmljmkrj;
    Jmljmkrj = input.nextInt();
    System.out.print("Masukkan jumlah upah pekerja : ");
    double uphprjm ;
    uphprjm = input.nextDouble();
    double gajiktr = Jmljmkrj * uphprjm;
    System.out.println("Gaji sebelum bonus: " + gajiktr);
    double bonusgji = gajiktr * 0.1;
    System.out.println("Bonus:" + bonusgji);
    double bonusgaji = bonusgji + gajiktr ;
    double pajak = bonusgaji * 0.05;
    System.out.println("Pajak gaji: " + pajak );
    double bersih = (bonusgaji - pajak);
    System.out.println("Gaji bersih pekerja: " + bersih);
}
}