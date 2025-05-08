public class Surat13 {
    String idSurat,namaMahasiswa,kelas;
    char jenisizin;
    int durasi;
    Surat13(){

    }
    Surat13(String idSurat,String namaMahasiswa,String kelas,char jenisizin,int durasi){
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisizin = jenisizin;
        this.durasi = durasi;
    }

    public void tampilkanInfo() {
        System.out.println("ID Surat       : " + idSurat);
        System.out.println("Nama Mahasiswa : " + namaMahasiswa);
        System.out.println("Kelas          : " + kelas);
        System.out.println("Jenis Izin     : " + (jenisizin == 'S' ? "Sakit" : "Izin"));
        System.out.println("Durasi         : " + durasi + " hari");
    }
}
