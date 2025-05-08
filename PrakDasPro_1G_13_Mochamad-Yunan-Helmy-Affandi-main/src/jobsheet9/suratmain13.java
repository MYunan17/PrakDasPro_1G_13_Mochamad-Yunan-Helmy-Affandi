import java.util.Scanner;

public class suratmain13 {
    public static void main(String[] args) {
        stacksurat13 stack = new stacksurat13(5);
        int pilih;
        Scanner sc = new Scanner (System.in);
        do {
            System.out.println("\nMenu:");
            System.out.println("1.  Terima surat izin");
            System.out.println("2.  Proses surat izin");
            System.out.println("3.  Lihat Surat izin terakhir");
            System.out.println("4.  Cari Surat");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("jenis izin : ");
                    char jenisizin = sc.next().charAt(0);
                    System.out.print("Durasi : ");
                    int Durasi = sc.nextInt();
                    Surat13 srt = new Surat13(id, nama, kelas, jenisizin, Durasi);
                    stack.push(srt);
                    System.out.println("Surat berhasil dikumpulkan\n" + srt.namaMahasiswa);
                    break;
                case 2 :
                    Surat13 verif = stack.pop();
                    if (verif != null) {
                    System.out.println("surat izin dari " +verif.namaMahasiswa + " sudah diverifikasi");
                    }else
                    System.out.println("Tidak ada surat yang harus diverifikasi");
                    break;
                case 3 :
                    Surat13 lihat = stack.peek() ;
                    if (lihat != null) {
                    System.out.println("Surat izin terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String Nama = sc.nextLine();
                    boolean ditemukan = false;
                
                    for (int i = stack.top; i >= 0; i--) {
                        if (stack.stack[i].namaMahasiswa.equalsIgnoreCase(Nama)) {
                            System.out.println("Surat ditemukan:");
                            System.out.println("----------------");
                            stack.stack[i].tampilkanInfo();
                            ditemukan = true;
                            break;
                        }
                    }
                
                    if (!ditemukan) {
                        System.out.println("Surat dari " + Nama + " tidak ditemukan.");
                    }
                    break;
            default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
    }

