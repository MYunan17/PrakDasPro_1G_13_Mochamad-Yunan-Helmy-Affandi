package pertemuan2;

public class mahasiswa13 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public mahasiswa13(String nm, String nim,double ipk,String kls){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
    void tampilkaninformasi(){
        System.out.println("Nama " + nama);
        System.out.println("NIM " + nim);
        System.out.println("IPK " + ipk);
        System.out.println("Kelas " + kelas);
    }
    void ubahkelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void updateipk(double ipkbaru){
        
        ipk = ipkbaru;
    }

    String nilaikerja(){
        if (ipk>=3.5) {
            return "kinerja sangat baik";
        } else if (ipk >=3.0) {
            return "kinerja baik";
        } else if (ipk>= 2.0) {
            return "kinerja cukup";
        } else {
            return "kinerja kurang";
        }
    }
}
