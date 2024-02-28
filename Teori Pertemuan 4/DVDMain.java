import java.util.Scanner;

public class DVDMain {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Film film = new Film("judul", "publisher", 1, "sutradara");
        Musik album = new Musik("judul", "publisher", 1, "penyanyi", "produser");
        while (true) {
            printMenu();
            int option = scan.nextInt();
            scan.nextLine();
            switch (option) {
                case 1:
                    film.inputDVD();
                    break;
                case 2:
                    album.inputDVD();
                    break;
                case 3:
                    System.out.println("==========Daftar DVD==========");
                    System.out.println("           DVD Film");
                    film.displayDVD();
                    System.out.println("-------------------------------");
                    System.out.println("           DVD Musik");
                    album.displayDVD();
                    System.out.println("==============================");
                    break;
                case 4:
                    System.out.println("Sampai jumpa lagi!");
                    return;
                default:
                    System.out.println("Pilihan yang dimasukkan tidak valid!");
            }
        }

    }

    public static void printMenu() {
        System.out.println("1. Tambahkan DVD Film");
        System.out.println("2. Tambahkan DVD Musik");
        System.out.println("3. Lihat Daftar DVD");
        System.out.println("4. Exit");
        System.out.print("Pilih Opsi: ");
    }
}
