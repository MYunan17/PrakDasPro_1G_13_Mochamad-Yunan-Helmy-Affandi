package Pertemuan13;

public class pengunjungcafe13 {
    public static void daftarpengunjung(String... namapengunjung) {
       System.out.println("Daftar nama pengunjung : ");
       for (int i = 0; i < namapengunjung.length; i++) {
            System.out.println("- "+namapengunjung[i]);
       } 
    }
    public static void main(String[] args) {
        daftarpengunjung("Ali","Budi","Citra");
    }
}