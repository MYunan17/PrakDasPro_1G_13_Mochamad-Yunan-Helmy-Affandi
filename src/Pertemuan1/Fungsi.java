package Pertemuan1;

public class Fungsi {
    static int[][] toko ={{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}}; 
    static int[] hargajual ={75000,50000,60000,10000}; 
    
    static void pendapatan(){
        int all=0,semua=0;
        for (int i = 0; i < toko.length; i++) {
            for (int j = 0; j < toko.length; j++) {
                all = toko[i][j]*hargajual[i];
                semua += all;
            }
           System.out.println("cabang " + toko[i+1] + semua);
        }



    }
    public static void main(String[] args) {
        pendapatan();
    }
}
