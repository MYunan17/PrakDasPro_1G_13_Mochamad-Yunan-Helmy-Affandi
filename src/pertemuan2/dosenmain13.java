package pertemuan2;

public class dosenmain13 {
    public static void main(String[] args) {
        dosen13 dosen1= new dosen13(null, null, false, 0, null);
        dosen1.idDosen = "2241724645";
        dosen1.nama = "Satrio Binusa" ;
        dosen1.Statusaktif = true;
        dosen1.tahunbergabung = 2021;
        dosen1.bidangKeahlian = "Bahasa inggris" ;

        dosen1.tampilinformasi();
        dosen1.setstatusaktif(false);;
        dosen1.ubahkeahlian("Agama");
        dosen1.tampilinformasi();
        System.out.print("Masakerja : "+dosen1.hitungmasakerja(2025) + "Tahun");

        dosen13 dosen2 = new dosen13("223456778","satrio busmo", false , 2020,"bahasa inggris");
        dosen2.tampilinformasi();
        dosen2.setstatusaktif(false);
        dosen2.ubahkeahlian("tik");
        dosen2.tampilinformasi();
    }
}
