package Praktikum03;

public class DataDosen13 {
    int laki,cewe;
    void datasemuaDosen (dosen13 [] arrayofDosen){
    for (dosen13 dosen13 : arrayofDosen) {
        System.out.println("=====Data Semua Dosen=====");
        System.out.println("Kode         : " + dosen13.kode);
        System.out.println("Nama         : " + dosen13.nama);
        System.out.println("Jenis Kelamin: " + (dosen13.jeniskelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia         : " + dosen13.usia);
        System.out.println("----------------------");
    }
}
void jumlahdosenperjeniskelamin (dosen13 [] arrayofDosen){
    for (dosen13 dosen13 : arrayofDosen) {
        if (dosen13.jeniskelamin == true) {
            laki++;
        }else if (dosen13.jeniskelamin == false) {
            cewe++;
        }
    }
System.out.println("====Jumlah Dosen Per Jenis Kelamin====");
System.out.println("Jumlah dosen laki-laki adalah " + laki + " Orang");
System.out.println("Jumlah dosen  Perempuan adalah " + cewe + " Orang");
}

void reratausiadosenperjeniskelamin (dosen13 [] arrayofDosen){
    int usialaki=0,usiacewe=0,ratalaki=0,ratacewe=0,laki=0,cewe=0;
for (dosen13 dosen13 : arrayofDosen) {
    if (dosen13.jeniskelamin == true) {
        usialaki+=dosen13.usia;
        laki++;
    }else if (dosen13.jeniskelamin == false) {
        usiacewe+=dosen13.usia;
        cewe++;
    } 
}
System.out.println("====Rerata Usia Dosen setiap jenis kelamin ====");
ratalaki = usialaki/laki;
System.out.println("Rerata umur pria : " + ratalaki);
ratacewe = usiacewe/cewe;
System.out.println("Rerata umur cewe : " + ratacewe);
}

void infoDosenPalingTua (dosen13 [] arrayofDosen){
    int tua = arrayofDosen[0].usia;
    dosen13 dosentertua = arrayofDosen[0];
    for (dosen13 dosen13 : arrayofDosen) {
        if (dosen13.usia>tua) {
            tua = dosen13.usia;
            dosentertua = dosen13;
        }
    }
    System.out.println("Nama dosen tertua : " + dosentertua.nama + "Dengan umur " + tua );
    }
void infoDosenPalingmuda (dosen13 [] arrayofDosen){
    int muda = arrayofDosen[0].usia;
    dosen13 dosentermuda = arrayofDosen[0];
    for (dosen13 dosen13 : arrayofDosen) {
        if (dosen13.usia<muda) {
            muda = dosen13.usia;
            dosentermuda = dosen13;
        }
    }
    System.out.println("Nama dosen termuda : " + dosentermuda.nama + " Dengan umur " + muda );
}
}
