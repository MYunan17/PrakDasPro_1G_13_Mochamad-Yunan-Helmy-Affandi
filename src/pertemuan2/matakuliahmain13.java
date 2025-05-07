package pertemuan2;

public class matakuliahmain13 {
    public static void main(String[] args) {
        Matakuliah13 matakuliah1= new Matakuliah13(null, null, 0, 0);
        matakuliah1.kodemk = "PRAKALSD_TI" ;
        matakuliah1.nama = "Praktikum algoritma dan struktur data";
        matakuliah1.sks = 3;
        matakuliah1.jam = 6;

        matakuliah1.tampilinformasi();
        matakuliah1.ubahsks(4);
        matakuliah1.tambahjam(3);
        matakuliah1.kurangijam(4);
        matakuliah1.tampilinformasi();

        Matakuliah13 matakuliah2 = new Matakuliah13("Daspro","Dasarpemrograman", 3,6);
        matakuliah2.tampilinformasi();
        matakuliah2.ubahsks(4);
        matakuliah2.tambahjam(5);
        matakuliah2.kurangijam(4);
        matakuliah2.tampilinformasi();

    }
}
