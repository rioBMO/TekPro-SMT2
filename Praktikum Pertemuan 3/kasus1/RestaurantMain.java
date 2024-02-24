import java.util.Scanner;

public class RestaurantMain {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Restaurant resto = new Restaurant();

        resto.addFood(1, "Bala-Bala", 1_000, 20);
        resto.addFood(2, "Gehu", 1_000, 20);
        resto.addFood(3, "Tahu", 1_000, 0);
        resto.addFood(4, "Molen", 1_000, 20);

        String order = " ";
        do {
            resto.displayMenu();

            System.out.print("Silahkan pilih makanan yang ingin dibeli: ");
            int nomor = scan.nextInt();
            System.out.print("Jumlah makanan yang ingin dibeli: ");
            int qty = scan.nextInt();
            resto.orderFood(nomor, qty);

            System.out.println("Apakah anda ingin membeli makanan lagi? (Y/N)");
            order = scan.next();
            if (order.equalsIgnoreCase("n")) {
                break;
            }
        } while (order.equalsIgnoreCase("y"));
    }
}
