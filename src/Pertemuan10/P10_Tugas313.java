package Pertemuan10;

import java.util.Scanner;

public class P10_Tugas313 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int hasil=-1;
        String key;
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar","Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        System.out.println("List menu : ");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1)+". "+menu[i]);
        }
        System.out.print("Massukan makanan yang akan dipesan : ");
        key = sc.nextLine();
        for (int i = 0; i < menu.length; i++) {
            if (key.equalsIgnoreCase(menu[i])) {
                hasil = i+1;
                System.out.println("Menu " +key + " tersedia di list menu");
            }   
        }
        if (hasil == -1) {
            System.out.println("Menu tidak tersedia di list menu !");
        }
        
    }
}