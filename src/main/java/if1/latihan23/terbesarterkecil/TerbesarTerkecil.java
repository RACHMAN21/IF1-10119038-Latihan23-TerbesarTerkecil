package if1.latihan23.terbesarterkecil;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : Program ini berisi untuk menampilkan nilai terbesar &
 *                     Terkecil
 */

import java.util.Scanner;

public class TerbesarTerkecil {

    static Scanner scan = new Scanner(System.in);
    int nilai[];
    String namaPetugas;

    private void masukkanData(){
        // memasukkan nama petugas
        System.out.println("Masukkan Nama Petugas : ");
        namaPetugas = scan.nextLine();
        // memasukkan banyaknya nilai mhs
        System.out.println("Masukkan Banyaknya Nilai Mahasiswa : ");
        int jumlah = scan.nextInt();
        nilai = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" = ");
            nilai[i] = scan.nextInt();
        }
    }

    private int nilaiTerkecil(){
        int nilaiTerkecil = nilai[0];
        for(int x : nilai){
            if(nilaiTerkecil > x){
                nilaiTerkecil = x;
            }
        }
        return nilaiTerkecil;
    }

    private int nilaiTerbesar(){
        int nilaiTerbesar = nilai[0];
        for(int x : nilai){
            if(nilaiTerbesar < x){
                nilaiTerbesar = x;
            }
        }
        return nilaiTerbesar;
    }

    private void tampilNilai(){
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        int num = 1;
        for(int x : nilai){
            System.out.println("Nilai Mahasiswa ke-"+num+" : "+x);
            num++;
        }
        System.out.println("Nilai Terbesar adalah "+nilaiTerbesar());
        System.out.println("Nilai Terkecil adalah "+nilaiTerkecil());
        System.out.println("Petugas : " + namaPetugas);
    }

    public static void main(String[] args) {
        TerbesarTerkecil data = new TerbesarTerkecil();
        data.masukkanData();
        data.tampilNilai();
        System.out.println("Developed by : Rachman Aldiansyah");
    }
}