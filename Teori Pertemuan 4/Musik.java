import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum KategoriM {
    C("Classic"), J("Jazz"), P("Pop"), R("Rock"), O("Other");

    private final String keterangan;

    KategoriM(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getKeterangan() {
        return keterangan;
    }
}

public class Musik extends DVD {
    private String penyanyi;
    private String produser;
    private List<String> top = new ArrayList<>();
    private KategoriM kategori;

    public Musik(String judul, String publisher, int stok, String penyanyi, String produser) {
        super(judul, publisher, stok);
        this.penyanyi = penyanyi;
        this.produser = produser;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }

    public String getProduser() {
        return produser;
    }

    public List<String> getTop() {
        return top;
    }

    public void setProduser(String produser) {
        this.produser = produser;
    }

    public KategoriM getKategori() {
        return kategori;
    }

    public void setKategori(KategoriM kategori) {
        this.kategori = kategori;
    }

    public void setTop(String hits) {
        top.add(hits);
    }

    public void addMusik() {
        inputDVD();
        Musik album = new Musik(getJudul(), getPublisher(), getStok(), getPenyanyi(), getProduser());
    }

    @Override
    public void displayDVD() {
        super.displayDVD();
        System.out.println("Penyanyi: " + penyanyi);
        System.out.println("Produser: " + produser);
        System.out.println("Kategori: " + kategori.getKeterangan());
        System.out.println("Top Hits: ");
        for (int i = 0; i < top.size(); i++) {
            System.out.println(i + 1 + ". " + top.get(i));
        }
    }

    @Override
    public void inputDVD() {
        Scanner scan = new Scanner(System.in);
        super.inputDVD();

        System.out.print("Penyanyi: ");
        String singer = scan.nextLine();
        setPenyanyi(singer);

        System.out.print("Produser: ");
        String producer = scan.nextLine();
        setProduser(producer);

        System.out.print("Masukkan jumlah lagu Top Hits: ");
        int qtyTop = scan.nextInt();
        scan.nextLine();
        System.out.println("(Masukkan lagu top hits satu persatu!)");
        for (int i = 0; i < qtyTop; i++) {
            System.out.print("Nama Lagu: ");
            String hits = scan.nextLine();
            setTop(hits);
        }

        while (true) {
            System.out.print("Kategori  (C = classic, J = jazz, P= pop, R= rock, O = Other): ");
            String genre = scan.nextLine().toUpperCase();
            switch (genre) {
                case "C":
                    setKategori(KategoriM.C);
                    return;
                case "J":
                    setKategori(KategoriM.J);
                    return;
                case "P":
                    setKategori(KategoriM.P);
                    return;
                case "R":
                    setKategori(KategoriM.R);
                    return;
                case "O":
                    setKategori(KategoriM.O);
                    return;
                default:
                    System.out.println("Genre yang dimasukkan tidak valid");
                    break;
            }
        }
    }
}
