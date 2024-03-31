package modul2.codelab;

import java.util.ArrayList;
import java.util.Scanner;

public class Codelab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final ArrayList<Mahasiswa> ListMahasiswa = new ArrayList<>();

        int pilih;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Tambah \u001B[3m\u001B[35mData\u001B[0m modul2.codelab.Mahasiswa");
            System.out.println("2. Tampilkan \u001B[3m\u001B[35mData\u001B[0m modul2.codelab.Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan anda: ");
            pilih = input.nextInt();
            input.nextLine(); // consume newline

            switch (pilih) {
                case 1:
                    Mahasiswa tambahMahasiswa = new Mahasiswa();
                    tambahMahasiswa.tambahData();
                    ListMahasiswa.add(tambahMahasiswa);
                    break;
                case 2:
                    tampilkanDataMahasiswa(ListMahasiswa);
                    break;
                case 3:
                    System.out.println("Idios");
                    break;
                default:
                    System.out.println("Maaf inputan anda salah");
                    break;
            }
        } while (pilih != 3);
    }

    static void tampilkanDataMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa) {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("\nBelum ada data mahasiswa.");
        } else {
            System.out.println("\n\u001B[3m\u001B[35mData\u001B[0m modul2.codelab.Mahasiswa:");
            Mahasiswa tambahMahasiswa = new Mahasiswa();
            tambahMahasiswa.tampilUniversitas();
            for (Mahasiswa mahasiswa : daftarMahasiswa) {
                mahasiswa.tampilDataMahasiswa();
            }
        }
    }
}

class Mahasiswa {
    String nama;
    long nim;
    String jurusan;

    void tambahData() {
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        nama = inp.nextLine();
        System.out.print("Masukkan Nim mahasiswa: ");
        nim = inp.nextLong();
        long length = String.valueOf(nim).length();
        while (length != 15) {
            System.out.println("Nim harus 15 digit!!!");
            System.out.print("Masukkan Nim mahasiswa: ");
            nim = inp.nextLong();
            length = String.valueOf(nim).length();
        }
        inp.nextLine(); // consume newline
        System.out.print("Masukkan jurusan mahasiswa: ");
        jurusan = inp.nextLine();
        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }

    void tampilDataMahasiswa() {
        System.out.println("Nama: " + nama + ", NIM: " + nim + ", Jurusan: " + jurusan);
    }

    void tampilUniversitas() {
        System.out.println("Universitas Muhammadiyah Malang");
    }
}



