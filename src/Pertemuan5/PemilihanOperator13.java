package Pertemuan5;
import java.util.Scanner ;

public class PemilihanOperator13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        double angka1, angka2,hasil= 0 ;
        char operator ;

        System.out.print("Massukan angka 1 : ");
        angka1 = sc.nextDouble();
        System.out.print("Massukan angka 2 : ");
        angka2 = sc.nextDouble();
        System.out.print("Massukan operator (+ - * /) : ");
        operator = sc.next().charAt(0);
        

        
        if (operator =='/') {
            hasil = angka1 / angka2 ;
        } else if (operator == '+') {hasil = angka1 + angka2 ;
        } else if  (operator == '-') {hasil = angka1 - angka2 ;
        } else if  (operator == '*') {hasil = angka1 * angka2 ;
        } else { System.out.println("Invalid Number");}
        System.out.println(angka1 + "" + operator + "" + angka2 + "=" + hasil);
    }
}

    