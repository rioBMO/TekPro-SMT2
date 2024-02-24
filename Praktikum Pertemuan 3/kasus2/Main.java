import java.util.Scanner;

import kasus2.Penjualan;
import kasus2.Produk;

public class Main {
    private static final int MAX = 10;
    private static Produk[] menu;
    private static Produk[] pesanan = new Produk[MAX];
    private static Scanner scan = new Scanner(System.in);

    private static void defaultProduk() {
        menu = new Produk[MAX];

        menu[0] = new Produk("Nasi Goreng", 14_000, 50);
        menu[1] = new Produk("Mie Goreng", 14_000, 50);
        menu[2] = new Produk("Bebek Panggang", 250_000., 5);
        menu[3] = new Produk("Ayam Panggang", 95_000, 25);
        menu[4] = new Produk("Baso Tahu", 15_000, 30);
        menu[5] = new Produk("Air Mineral", 4_000, 100);
        menu[6] = new Produk("Teh Manis", 5_000, 80);
        menu[7] = new Produk("Es Jeruk", 6_000, 50);
        menu[8] = new Produk("Es Goyobod", 8_500, 50);
        menu[9] = new Produk("Es Kelapa", 12_500.50, 77);
    }

    public static void main(String[] args) {
        defaultProduk();
        displayProduk();
        addOrder();
        while (true) {
            printMenu();
            int option = scan.nextInt();
            scan.nextLine();
            switch (option) {
                case 1:
                    displayProduk();
                    addOrder();
                    break;
                case 2:
                    displayOrder();
                    break;
                case 3:
                    System.out.println("Terima kasih telah berbelanja disini. Sampai jumpa lagi!");
                    return;
                default:
                    System.out.println("Pilihan yang dimasukkan tidak valid!");
            }
        }
    }

    private static void printMenu() {
        System.out.println("1. Buat Pesanan");
        System.out.println("2. Lihat Pesanan");
        System.out.println("3. Exit");
        System.out.print("Pilih Opsi: ");
    }

    public static void displayProduk() {
        System.out.println("                        Menu");
        System.out.println("====================================================");
        System.out.println("ID          NAMA             STOK         HARGA     ");
        System.out.println("====================================================");
        for (int i = 0; i < menu.length; i++) {
            System.out.format("%-2s | %-20s %d Rp. %-20.2f %n", i + 1, menu[i].getNama(), menu[i].getQty(),
                    menu[i].getHarga());
        }
        System.out.println("----------------------------------------------------");

    }

    public static void addOrder() {

        int id;
        int qty;
        String reorder;
        boolean status;

        int i = 0;
        do {
            status = false;

            System.out.println("\nPilih Produk yang ingin dibeli: ");
            id = scan.nextInt();
            while (id < 1 || id > MAX) {
                if (id < 1 || id > MAX) {
                    System.out.println("Produk yang dipilih tidak ada dalam daftar!");
                }

                System.out.println("\nPilih Produk yang ingin dibeli: ");
                id = scan.nextInt();
            }

            System.out.println("Masukkan jumlah: ");
            qty = scan.nextInt();
            while (menu[id - 1].getQty() < qty || menu[id - 1].getQty() == 0) {
                if (menu[id - 1].getQty() == 0) {
                    System.out.println("Stok " + menu[id - 1].getNama() + " tidak tersedia!");
                } else if (menu[id - 1].getQty() < qty) {
                    System.out.println("Stok  " + menu[id - 1].getNama() + " tidak cukup!");
                }

                System.out.println("\nMasukkan jumlah: ");
                qty = scan.nextInt();
            }

            pesanan[i] = new Produk(menu[id - 1].getNama(), menu[id - 1].getHarga(), qty);
            i++;

            int remainingQty = menu[id - 1].getQty() - qty;
            menu[id - 1].setQty(remainingQty);

            if (i < pesanan.length) {
                System.out.println("Apakah anda ingin membeli produk lagi? [Y/N] ");
                reorder = scan.next();
                if (reorder.equalsIgnoreCase("y")) {
                    status = true;
                    displayProduk();
                }
            }

        } while (i < pesanan.length && status);
        System.out.println("====================================================");
    }

    public static void displayOrder() {
        double total = 0;

        System.out.println("               Total Pembelian");
        System.out.println("============================================");
        System.out.println("       NAMA         JUMLAH           HARGA  ");
        System.out.println("============================================");

        for (Produk item : pesanan) {
            if (item != null) {
                System.out.format("%-17s %-3d Rp %-17.2f%n", item.getNama(), item.getQty(), item.getHarga());
                total += item.getHarga() * item.getQty();
            }
        }

        System.out.println("--------------------------------------------");
        System.out.printf("Total                           Rp %.2f%n", total);
        System.out.println("============================================");
    }
}
