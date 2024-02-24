package kasus2;

public class Produk {
    private String nama_produk;
    private double harga;
    private int qty;

    public Produk(String nama_produk, double harga, int qty) {
        this.nama_produk = nama_produk;
        this.harga = harga;
        this.qty = qty;
    }

    public String getNama() {
        return nama_produk;
    }

    public double getHarga() {
        return harga;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
