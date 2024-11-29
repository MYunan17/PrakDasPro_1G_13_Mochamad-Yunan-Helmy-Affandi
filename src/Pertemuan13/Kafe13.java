package Pertemuan13;

public class Kafe13 {
    public static void menu(String namaPelangan, boolean ismember ,String diskon) {
        System.out.println("Selamat datang, "+ namaPelangan + "!");
        if (ismember) {
            System.out.println("Anda adalah member,dapatkan diskon 10% untuk setiap pembelian");
        }
        System.out.println(" ");
        if (diskon.equalsIgnoreCase("diskon50")) {
            System.out.println("Kode promo digunakan !!!, anda mendapatkan diskon sebesar 50%");
        }else if (diskon.equalsIgnoreCase("diskon30")) {
            System.out.println("Kode promo digunakan !, anda mendapatkan diskon sebesar 30%");
        }else System.out.println("kode invalid");


        System.out.println("========= MENU RESTO KAFE =========");
        System.out.println("1. Kopi hitam  - RP 15.000");
        System.out.println("2. Cappuccino - RP 20.000");
        System.out.println("3. Latte - RP 22.000");
        System.out.println("4. Teh Tarik - RP 12.000");
        System.out.println("5. Roti Bakar - RP 10.000");
        System.out.println("6.Mie Roti Goreng - RP 18.000");
        System.out.println("==================================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }
    public static void main(String[] args) {
        menu("Andi",true,"Diskon50");
        menu("Dimas",true,"Diskon30");
        menu("Dimas",true,"Diskon10");
    }
}
