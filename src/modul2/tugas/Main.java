package modul2.tugas;

import java.util.Scanner;


public class Main {
    //data buku
    public static String[] idBuku = new String[] {"388c-e681-9152", "ed90-be30-5cdb", "d95e-0c4a-9523"};
    public static String[] namaBuku = new String[] {"title", "title", "title"};
    public static String[] author = new String[] {"author", "author", "author"};
    public static String[] category = new String[] {"Sejarah", "Sejarah", "Sejarah"};
    public static int[] stock = new int[] {4, 0, 2};

    void menuUtama(){
        System.out.println("\n==== Library System ====");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");
        System.out.print("Pilihan Anda: ");
    }

    void menuStudent(){
        System.out.println("\n==== Student Menu ====");
        System.out.println("1. Buku terpinjam");
        System.out.println("2. Pinjam buku");
        System.out.println("3. Logout");
        System.out.print("Pilihan Anda: ");
    }

    void menuAdmin(){
        System.out.println("\n==== Admin Menu ====");
        System.out.println("1. Add Student");
        System.out.println("2. Display Registered Student");
        System.out.println("3. Logout");
        System.out.print("Pilihan Anda: ");
    }

    void displayBook(){
        System.out.println("===========================================================================================================================================");
        System.out.println("|| No. || Id Buku\t\t\t\t || Nama Buku\t\t || Author\t\t || Category\t || Stock\t || ");
        for (int i = 0; i < 3; i++){
            System.out.printf("|| %d   || %s\t\t || %s\t\t\t || %s\t\t || %s\t\t || %d\t\t || \n", i, idBuku[i], namaBuku[i], author[i], category[i], stock[i]);
        }
        System.out.println("===========================================================================================================================================");
    }

    public static void main(String[] args) {
        Student student = new Student();
        Admin admin = new Admin();
        Main main = new Main();
        mainMenu:
        while (true) {
            main.menuUtama();
            Scanner scanInt = new Scanner(System.in);
            int pilih = scanInt.nextInt();
            if (pilih == 1) {
                if (student.checkStudent() == 0) {
                    continue mainMenu;
                }
                int j = 0;
                while (true) {
                    main.menuStudent();
                    pilih = scanInt.nextInt();
                    if (pilih == 1){
                        student.bukuTerpinjam();
                    } else if (pilih == 2){
                        main.displayBook();
                        student.pinjamBuku(j);
                        j++;
                    } else {
                        break;
                    }
                }
            } else if (pilih == 2) {
                if (admin.checkAdmin() == 0) {
                    continue mainMenu;
                }
                while (true) {
                    main.menuAdmin();
                    pilih = scanInt.nextInt();
                    int i = 0;
                    if (pilih == 1) {
                        admin.addStudent();
                        i++;
                    } else if (pilih == 2) {
                        admin.displayStudent();
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }
        }
    }
}