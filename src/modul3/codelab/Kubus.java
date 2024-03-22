package modul3.codelab;

import java.util.Scanner;

public class Kubus extends BangunRuang {
    Scanner scanner = new Scanner(System.in);
    private double sisi;

    public Kubus(String name) {
        super(name);
    }

    @Override
    public void inputNilai(){
        super.luasPermukaan();
        super.inputNilai();
        System.out.print("Input sisi: ");
        sisi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan(){
        double hasil = 6 * Math.pow(sisi, 2);
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    @Override
    public void volume(){
        double hasil = Math.pow(sisi, 3);
        super.volume();
        System.out.println("Hasil volume: " + hasil);
    }
}
