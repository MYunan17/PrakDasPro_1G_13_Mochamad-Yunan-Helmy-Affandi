package pertemuan2;

public class Matakuliah13 {
    String kodemk;
    String nama;
    int sks;
    int jam;

    public Matakuliah13(String kodemk, String nama,int sks,int jam){
        this.nama = nama;
        this.kodemk = kodemk;
        this.sks = sks;
        this.jam = jam;
    }


    void tampilinformasi(){
        System.out.println("kode mk " + kodemk);
        System.out.println("nama " + nama);
        System.out.println("sks " + sks);
        System.out.println("Jam " + jam);
    }

    void ubahsks(int sksbaru){
        sks = sksbaru;
        System.out.println("Sks telah dirubah");
    }

    void tambahjam(int tambjam){
        jam += tambjam;
    }
    void kurangijam(int kurangjam){
        if (jam>=kurangjam) {
            jam -= kurangjam;
        }else if (jam<kurangjam) {
            System.out.println("Penggurangan jam tidak dapat dilakukan");
        }
    }

}


