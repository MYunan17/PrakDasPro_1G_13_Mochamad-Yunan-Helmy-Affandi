package Pertemuan13;

import java.util.Scanner;

public class Kubus13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int s,lp,volum ;

        System.out.print("Massukan sisi : ");
        s = sc.nextInt();

        volum=hitungvolume(s);
        System.out.println("Volume kubus : "+ volum);

        lp=hitunglp(s);
        System.out.println("Luas permukaan kubus : " + lp);
    }
    public static int hitungvolume (int sisi){
        int volume = sisi * sisi * sisi ;
        return volume;
    }
    public static int hitunglp (int sisi){
        int luasper = 6 * sisi * sisi ;
        return luasper;
    }
}
