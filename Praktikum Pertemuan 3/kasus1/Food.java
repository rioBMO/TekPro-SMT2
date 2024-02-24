public class Food {
    private int id;
    private String nama;
    private double harga;
    private int stok;

    public Food(int id, String nama, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void displayFood() {
        System.out.println(id + ". " + nama + " \t[" + stok + "]" + " \t Rp. " + harga);
    }

}
