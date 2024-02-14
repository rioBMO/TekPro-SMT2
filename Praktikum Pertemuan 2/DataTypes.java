import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Membuat variabel baru bertipe Scanner

        System.out.println("Number of Test cases:");
        int t = scan.nextInt(); // Variabel untuk input jumlah tes yang ingin dijalankan

        for (int i = 0; i < t; i++) {
            try { // Exception handling untuk input yang tidak valid
                System.out.println("Input Case Number:");
                long n = scan.nextLong();

                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");
            } catch (Exception e) {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
        }
        scan.close(); // Menutup Scanner setelah perulangan selesai
    }
}
