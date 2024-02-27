package modul_194;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CodelabModul1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //INPUT
        System.out.print("Input Nama: ");
        String name = input.nextLine();
        System.out.print("Input jenis kelamin (P/L): ");
        String InputKelamin = input.nextLine();
        char Kelamin = InputKelamin.toUpperCase().charAt(0);
        System.out.print("Input tanggal lahir (yyyy-mm-dd): ");
        String tanggalLahirInput = input.nextLine();
        LocalDate tglLahir = LocalDate.parse(tanggalLahirInput);
        LocalDate now = LocalDate.now();
        Period p = Period.between(tglLahir, now);
        int tahun = p.getYears();
        int bulan = p.getMonths();
        int hari = p.getDays();

        // OUTPUT
        System.out.println("\nOutput:");
        System.out.println("Nama: " + name);
        if (Kelamin == 'L'){
            System.out.println("Jenis Kelamin: Laki-laki");
        } else if (Kelamin == 'P') {
            System.out.println("Jenis Kelamin: Perempuan");
        } else {
            System.out.println("Maaf inputan anda salah.");
        }
        System.out.println("Tanggal Lahir: " + tglLahir);
        System.out.println("Umur: " + tahun + " tahun " + bulan + " bulan " + hari + " hari");

        input.close();
    }
}