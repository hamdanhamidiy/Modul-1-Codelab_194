package modul2.tugas;

import java.util.Scanner;

public class Admin {
    Student student = new Student();
    public static String userx = "admin";
    public static String passx = "admin";
    public static int i = 0;
    int checkAdmin(){
        Scanner scanString = new Scanner(System.in);
        System.out.print("Enter your username (admin): ");
        String user = scanString.nextLine();
        System.out.print("Enter your password (admin): ");
        String pass = scanString.nextLine();
        if (user.equals(userx) && pass.equals(passx)) {
            System.out.println("Sukses login sebagai admin\n");
            return 1;
        }
        else {
            System.out.println("Admin tidak ditemukan\n");
            return 0;
        }
    }

    void addStudent(){
        Scanner scanString = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa: ");
        Student.nama[i] = scanString.nextLine();

        System.out.print("Masukkan fakultas mahasiswa: ");
        Student.fakultas[i] = scanString.nextLine();

        System.out.print("Masukkan NIM mahasiswa: ");
        Student.nim[i] = scanString.nextLine();
        while(true){
            if (String.valueOf(Student.nim[i]).length() != 15 ) {
                System.out.print("Nim Harus 15 Digit!!!\n");
                System.out.print("Masukkan NIM mahasiswa: ");
                Student.nim[i] = scanString.nextLine();
            } else {
                break;
            }
        }

        System.out.print("Masukkan jurusan mahasiswa: ");
        Student.prodi[i] = scanString.nextLine();

        System.out.print("Data Mahasiswa berhasil ditambahkan.\n");
        i++;
    }

    void displayStudent(){
        for (int j = 0; j < i; j++) {
            System.out.println("\nData mahasiswa ke " + (j+1));
            System.out.println("Nama: " + Student.nama[j]);
            System.out.println("Fakultas: " + Student.fakultas[j]);
            System.out.println("NIM: " + Student.nim[j]);
            System.out.println("Prodi: " + Student.prodi[j]);
        }
    }

}
