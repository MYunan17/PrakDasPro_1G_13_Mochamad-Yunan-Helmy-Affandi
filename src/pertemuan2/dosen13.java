package pertemuan2;

public class dosen13 {
    String idDosen;
    String nama;
    boolean Statusaktif;
    int tahunbergabung,masakerja;
    String bidangKeahlian;

    public dosen13(String idDosen, String nama,boolean Statusaktif,int tahunbergabung,String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.Statusaktif = Statusaktif;
        this.tahunbergabung = tahunbergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    
    void tampilinformasi(){
        System.out.println("IDDosen : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Statusaktif : " + Statusaktif);
        if (Statusaktif==true) {
            System.out.println("Aktif");
        }else if (Statusaktif==false) {
            System.out.println("Tidak Aktif");
            
        }
        System.out.println("Tahun bergabung : " + tahunbergabung);
        System.out.println("Bidang keahlian : " + bidangKeahlian);
    }

    void setstatusaktif(boolean status){
        Statusaktif = status;
    }
    int hitungmasakerja (int tahunskrg){
            masakerja = tahunskrg - tahunbergabung;
            return masakerja;
    }

    void ubahkeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
