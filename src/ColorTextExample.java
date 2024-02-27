import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class ColorTextExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Text Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JLabel label = new JLabel("Hello, World!");
        label.setForeground(Color.RED); // Merubah warna teks menjadi merah
        label.setFont(new Font("Arial", Font.BOLD, 24)); // Mengatur jenis font dan ukuran
        frame.add(label);
        System.out.println("\u001B[31mMerah");   // Merah
        System.out.println("\u001B[32mHijau");   // Hijau
        System.out.println("\u001B[33mKuning");  // Kuning
        System.out.println("\u001B[34mBiru");    // Biru
        System.out.println("\u001B[0m");         // Kembali ke warna default

        frame.setVisible(true);
    }
}
