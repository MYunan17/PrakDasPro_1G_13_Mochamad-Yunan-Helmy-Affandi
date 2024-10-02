package Pertemuan5;
import java.util.Scanner ;

public class PemilihanBilangan13 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int angka = 11 ;
        String hasil ; 
        hasil = (angka % 2 == 0) ? "Bilangan genap" : "Bilangan ganjil" ;
        System.out.println(angka + " Termasuk " + hasil);

}
}
