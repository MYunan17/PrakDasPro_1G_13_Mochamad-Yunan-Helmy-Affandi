package Pertemuan11;

import java.util.Scanner;

public class Tugas13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] Responden = new int[10][6];
        double jmlh = 0, total = 0;
        for (int i = 0; i < Responden.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < Responden[i].length; j++) {
                System.out.print("Masukkan nilai jawaban ke-" + (j + 1) + " (isi nilai 1 - 5): ");
                Responden[i][j] = sc.nextInt();
                jmlh += Responden[i][j];
                }
                double rataResponden = jmlh / Responden[i].length;
                System.out.println("Rata-rata nilai jawaban responden ke-" + (i + 1) + ":" + rataResponden);
                total += rataResponden;
            }
        System.out.println("Rata-rata nilai untuk pertanyaan : ");
        for (int j = 0; j < Responden[0].length; j++){
            double jmlhPertanyaan = 0;
            for (int i = 0; i < Responden.length; i++) {
                jmlhPertanyaan += Responden[i][j];
            }
            double rataPertanyaan = jmlhPertanyaan / Responden.length;
            System.out.println("Rata-rata nilai untuk pertanyaan ke-" + (j+1) + ":" + rataPertanyaan);
        }
        double rataseluruh = total / Responden.length;
        System.out.println("Rata-rata seluruh nilai jawaban responden: " + rataseluruh);

}
}