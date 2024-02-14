import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Membuat variabel baru bertipe Scanner

        // Variabel bertipe String untuk input sebuah kata
        String a = scan.nextLine();
        String b = scan.nextLine();

        int sumLength = a.length() + b.length(); // Menghitung jumalah panjang a dan b
        System.out.println(sumLength);

        String lexCompare = a.compareTo(b) > 0 ? "Yes" : "No"; // lexicographically sort
        System.out.println(lexCompare);

        // Mengubah huruf pertama dari a dan b menjadi huruf besar
        String capA = a.substring(0, 1).toUpperCase() + a.substring(1);
        String capB = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(capA + " " + capB);
    }
}
