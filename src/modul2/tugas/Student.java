package modul2.tugas;

import modul2.tugas.Main;

import java.util.Scanner;

public class Student {
    public static String[] nama = new String[10];
    public static String[] fakultas = new String[10];
    public static String[] nim = new String[10];
    public static String[] prodi = new String[10];
    public static String[] bukuTerpinjam = new String[10];

    int checkStudent(){
        Scanner scanString = new Scanner (System.in);
        System.out.print("Masukkan NIM Anda (input 99 untuk kembali): ");
        String input = scanString.nextLine();
        if (input.equals("99")) {
            System.out.println("Kembali ke menu awal...");
            return 0;
        }
        for (int i = 0; i < nim.length; i++) {
            if (input.equals(nim[i])) {
                System.out.println("Sukses login sebagai student\n");
                return 1;
            }
        }
        System.out.println("Nim tidak ditemukan\n");
        return 0;
    }

    void pinjamBuku(int j){
        Main main = new Main();
        Scanner scanString = new Scanner (System.in);
        System.out.println("Input id buku yang ingin anda pinjam (input 99 untuk kembali)");
        System.out.print("Input: ");
        String idBuku = scanString.nextLine();
        if (idBuku.equals("99")) {
            System.out.println("Kembali ke menu awal...");
            return;
        }
        for (int i = 0; i < main.idBuku.length; i++) {
            if (idBuku.equals(main.idBuku[i])) {
                System.out.println("Buku id " + idBuku + " berhasil dipinjam");
                main.stock[i] -= 1;
                break;
            }
        }
        bukuTerpinjam[j] = idBuku;
    }

    void bukuTerpinjam(){
        System.out.println("Buku terpinjam: ");
        for (int i = 0; i < bukuTerpinjam.length; i++) {
            if (bukuTerpinjam[i] == null) {
                break;
            } else {
                System.out.printf("%d. %s", i+1, bukuTerpinjam[i]);
            }
        }
    }
}
