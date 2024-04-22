package modul1.tugas;

import java.util.Scanner;

public class LibrarySys {
    void Student(long nomer){
        long[] Nim = {202410370311194L, 202410370311172L, 202410370311203L};
        for (long i : Nim){
            if (i == nomer){
                System.out.println("Succesful login as Student.");
                break;
            } else {
                System.out.println("User not found.");
                break;
            }
        }
    }

    void Admin(String user, String password){
        String adm = "admin";
        String pw = "admin";

        if (user.equals(adm) && pw.equals(password)){
            System.out.println("Succesful login as Admin.");
        } else {
            System.out.println("User not found.");
        }
    }

    public static void main(String[] args){
        LibrarySys lb = new LibrarySys();
        Scanner inp = new Scanner(System.in);
        char ulang;

        do {
            System.out.println("\u001B[35m====== \u001B[0mLibrary System \u001B[35m======\u001B[0m");
            System.out.println("\u001B[31m1.\u001B[0m Login as Student");
            System.out.println("\u001B[31m2.\u001B[0m Login as Admin");
            System.out.println("\u001B[31m3.\u001B[0m \u001B[3m\u001B[35mExit\u001B[0m");
            System.out.print("\u001B[0mChoose option (\u001B[31m1\u001B[0m\u001B[35m-\u001B[0m\u001B[31m3\u001B[0m): ");
            int pilih = inp.nextInt();

            switch (pilih){
                case 1:
                    System.out.print("Enter your NIM: ");
                    long nim = inp.nextLong();
                    lb.Student(nim);
                    break;
                case 2:
                    System.out.print("Enter your username: ");
                    String user = inp.next();
                    System.out.print("Enter your password: ");
                    String pass = inp.next();
                    lb.Admin(user,pass);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf inputan anda salah.");
                    break;
            }
            System.out.print("Do you want to repeat the program?(y/n): ");
            ulang = inp.next().charAt(0);
        } while (ulang == 'y'|| ulang == 'Y');
    }
}