package modul1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class demoCalcYearsOld {

    private int yoursBirthYear;
    public int getYourBirthYear() {
        return yoursBirthYear;
    }

    public void setYourBirthYear(int yoursBirthYear) {
        this.yoursBirthYear = yoursBirthYear;
    }

    public void demoCalcYearsOld() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tahun kelahiran Anda: ");
        int birthYear = scanner.nextInt();
        setYourBirthYear(birthYear);

        int age = calculateAge();
        System.out.println("Umur Anda sekarang: " + age + " tahun");
        scanner.close();
    }

    private int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();

        return currentYear - getYourBirthYear();
    }

    public static void main(String[] args){
        demoCalcYearsOld birth = new demoCalcYearsOld();
        birth.demoCalcYearsOld();
    }
}
