package pertemuan2;

public class Mahasiswamain13 {
    public static void main(String[] args) {
        mahasiswa13 mhs1= new mahasiswa13();
        mhs1.nama = "Muhammad Ali Farhan" ;
        mhs1.nim = "2241720171";
        mhs1.kelas = "S1 2K";
        mhs1.ipk = 3.55;

        mhs1.tampilkaninformasi();
        mhs1.ubahkelas("S1 2J");
        mhs1.updateipk(3.60);
        mhs1.tampilkaninformasi();
    }
}
