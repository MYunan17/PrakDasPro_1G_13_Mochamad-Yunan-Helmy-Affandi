package Pertemuan7;
import java.util.Scanner ;
public class SiakadFor13 {
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in) ;
        double nilai,tertinggi=0,terendah=100;
        int Lulus=0, TidakLulus=0;
        for (int i =1; i <= 10; i++){
            System.out.print("Massukan nilai mahasiswa ke-" + i + ": ");
            nilai =sc.nextDouble();
            if (nilai>tertinggi) {
                tertinggi = nilai;
            }
            if (nilai<terendah) {
                terendah = nilai;
            }
            if (nilai >= 60 ) {
                Lulus ++;
            }else{
                TidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Jumlah Mahasiswa lulus : " + Lulus);
        System.out.println("Jumlah Mahasiswa tidak lulus : " + TidakLulus);

    }
}
