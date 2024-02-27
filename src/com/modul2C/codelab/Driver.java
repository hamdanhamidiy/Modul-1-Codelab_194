package com.modul2C.codelab;
import com.modul2C.codelab.aritmatics.Pembagian;
import com.modul2C.codelab.aritmatics.Pengurangan;
import com.modul2C.codelab.aritmatics.Penjumlahan;
import com.modul2C.codelab.aritmatics.Perkalian;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pembagian pembagian = new Pembagian();
        Perkalian perkalian = new Perkalian();
        Pengurangan pengurangan = new Pengurangan();
        Penjumlahan penjumlahan = new Penjumlahan();


        System.out.println("Operasi Matematika");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan pilihan anda: ");
        int pilih = scanner.nextInt();

        System.out.print("Masukkan Bilangan ke 1: ");
        double a = scanner.nextDouble();
        System.out.print("Masukkan Bilangan ke 2: ");
        double b = scanner.nextDouble();
        System.out.print("Masukkan Bilangan ke 3: ");
        double c = scanner.nextDouble();

        switch (pilih){
            case 1:
                System.out.println("hasil: " + penjumlahan.operation(a, b, c));
                break;
            case 2:
                System.out.println("hasil: " + pengurangan.operation(a, b, c));
                break;
            case 3:
                System.out.println("hasil: " + perkalian.operation(a, b, c));
                break;
            case 4:
                System.out.println("hasil: " + pembagian.operation(a, b, c));
                break;
            default:
                System.out.println("Maaf inputan anda salah");
        }




    }
}
