import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Food> makanan = new ArrayList<>();

    public Restaurant() {

    }

    public void addFood(int id, String nama, double harga, int stok) {
        makanan.add(new Food(id, nama, harga, stok));
    }

    public void displayMenu() {
        System.out.println("\tMenu Makanan:");
        for (int i = 0; i < makanan.size(); i++) {
            makanan.get(i).displayFood();
        }
    }

    public void orderFood(int nomor, int qty) {
        Food makanan = this.makanan.get(nomor - 1);
        if (makanan.getStok() >= qty) {
            System.out.println(qty + " " + makanan.getNama() + " telah dibeli!");
            makanan.setStok(makanan.getStok() - qty);
        } else if (makanan.getStok() == 0) {
            System.out.println("Stok " + makanan.getNama() + " telah habis!");
        } else {
            System.out.println("Stok " + makanan.getNama() + " tidak cukup!");
        }
    }
}