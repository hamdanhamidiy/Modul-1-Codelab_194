import java.util.Scanner;

public class Modul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adminUsername = "admin";
        String adminPassword = "admin";

        int pilih;

        do {
            System.out.println("=====PBO System=====");
            System.out.println("1 Login as Student");
            System.out.println("2 Login as Admin");
            System.out.println("3 EXIT");
            System.out.print("Chose option (1-3): ");
            pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    studentLogin(scanner);
                    break;
                case 2:
                    adminLogin(scanner, adminUsername, adminPassword);
                    break;
                case 3:
                    System.out.println("Akhirnya Kelar.");
                    break;
                default:
                    System.out.println("Invalid selection Please choose again.");
            }

        } while (pilih != 3);
    }

    private static void studentLogin(Scanner scanner) {
        System.out.print("Enter your NIM: ");
        String nimInput = scanner.next();

        if (nimInput.length() == 15 && nimInput.matches("\\d+")) {
            System.out.println("Successful Login as Student");
        } else {
            System.out.println("User Not Found");
        }
    }

    private static void adminLogin(Scanner scanner, String adminUsername, String adminPassword) {
        System.out.print("Enter your username(admin): ");
        String usernameInput = scanner.next();
        System.out.print("Enter your Password(admin): ");
        String passwordInput = scanner.next();

        if (usernameInput.equals(adminUsername) && passwordInput.equals(adminPassword)) {
            System.out.println("Successful Login as Admin.");
        } else {
            System.out.println("Admin user Not Found!!");
        }
    }
}