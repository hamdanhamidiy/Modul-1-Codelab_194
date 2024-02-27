package modul1;

import java.util.Scanner;

public class demoConv {

    private Double angka;

    double convCM(double a){
        return a*100;
    }

    double convMM(double a){
        return a*1000;
    }

    void dispConv(double a) {
        System.out.println(a + " Meter = " + convCM(a) + " cm, " + convMM(a) + " mm.");
    }

    public static void main(String[] args){
        demoConv democonv = new demoConv();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        double a = scanner.nextDouble();
        democonv.dispConv(a);
    }
}
