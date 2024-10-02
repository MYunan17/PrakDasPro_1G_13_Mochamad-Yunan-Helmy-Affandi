package Pertemuan5;
import java.util.Scanner ;

public class PemilihanBilangan13 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int angka ;
        System.out.print("Massukan angka : ");
        angka = sc.nextInt();
        if (angka % 2  ==0 ) {
            System.out.println("Angka " + angka + " terbilang bilangan genap");
        } else {
            System.out.println("Angka " + angka + " terbilang bilangan ganjil");
        }
    

}
}
