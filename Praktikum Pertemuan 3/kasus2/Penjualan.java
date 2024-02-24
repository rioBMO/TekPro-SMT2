package kasus2;

public class Penjualan {
    private String nama_produk;
    private int qty;
    private double harga_total;

    public Penjualan(String nama_produk, int qty, double harga) {
        this.nama_produk = nama_produk;
        this.qty = qty;
        this.harga_total = harga * qty;
    }

    public String getNama() {
        return nama_produk;
    }

    public int getQty() {
        return qty;
    }

    public double getTotal() {
        return harga_total;
    }
}
