package Pertemuan5;
import java.util.Scanner;

public class PemilihanHariDenganIf13 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int Dayno;
        System.out.print("Input Day Number : ") ;
        Dayno = sc.nextInt();
        if (Dayno >=1 && Dayno <=5) {
        System.out.println("Weekday");
        } 
        if (Dayno == 6 || Dayno ==7) {
        System.out.println("Weekend ");
    } 
        if (Dayno < 1 ||Dayno >7) {
        System.out.println("Invalid Number") ;  
        }      
}
        }
    
   

