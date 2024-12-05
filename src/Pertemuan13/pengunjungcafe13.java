package Pertemuan13;

public class pengunjungcafe13 {
    public static void daftarpengunjung(String... namapengunjung) {
       System.out.println("Daftar nama pengunjung : ");
       for (String nama : namapengunjung) {
        System.out.println("- " + nama);
    }
    }
    public static void main(String[] args) {
        daftarpengunjung("Ali","Budi","Citra");
    }
}