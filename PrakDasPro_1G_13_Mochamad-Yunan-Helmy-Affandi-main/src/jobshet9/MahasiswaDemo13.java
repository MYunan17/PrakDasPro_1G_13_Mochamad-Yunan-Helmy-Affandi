package jobshet9;

import java.util.Scanner;

public class MahasiswaDemo13 {
    public static void main(String[] args) {
        StackTugasMahasiswa13 stack = new StackTugasMahasiswa13(5);
        int pilih;
        Scanner sc = new Scanner (System.in);
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Pertama dikumpulkan");
            System.out.println("6. banyak tugas yang sudah dikumpulkan");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("NIM : ");
                    String NIM = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa13 mhs = new Mahasiswa13(nama, NIM, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2 :
                Mahasiswa13 dinilai = stack.pop();
                if (dinilai != null) {
                    System.out.println("Menilai tugas dari " + dinilai.nama);
                    System.out.print("Massukan nilai (0-100): ");
                    int nilai = sc.nextInt();
                    dinilai.tugasDinilai(nilai);
                    System.out.printf("Nilai Tugas %s adalah %d\n",dinilai.nama,nilai);
                    String biner = stack.KonversidesimalkeBiner(nilai);
                    System.out.println("Nilai Biner Tugas : " + biner);
                }
                break;
                case 3 :
                Mahasiswa13 lihat = stack.peek();
                if (lihat != null) {
                    System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                }
                break;
                case 4 :
                System.out.println("Daftar semua tugas");
                System.out.println("Nama\tNIM\tkelas");
                stack.print();
                break;
                case 5 :
                Mahasiswa13 lihat1 = stack.lihatTugaspertama();
                if (lihat1 != null) {
                    System.out.println("Tugas pertama dikumpulkan oleh " + lihat1.nama);
                }
                break;
                case 6 :
                System.out.println("Jumlah tugas yang sudah dikumpulkan saat ini : : " + stack.tugastotal());
                break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
