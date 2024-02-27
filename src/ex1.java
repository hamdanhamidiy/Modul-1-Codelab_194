import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int population = 100000;
        String nama = "Infomatika";
        char kar = 'a';

        //output
        System.out.println("Populasinya: " + population);
        System.out.println("Jurusan: " + nama + "\nKarakter: " + kar);
        System.out.print("Masukkan jurusan di UMM: ");
        String jurusan = sc.next();

        System.out.println("Jurusan anda: " + jurusan);
    }
}
