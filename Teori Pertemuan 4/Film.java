import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum KategoriF {
    SU("Semua Umur"), D("Dewasa"), R("Remaja"), A("Anak-anak");

    private final String keterangan;

    KategoriF(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getKeterangan() {
        return keterangan;
    }
}

public class Film extends DVD {
    private List<String> pemeran = new ArrayList<>();
    private String sutradara;
    private KategoriF kategori;

    public Film(String judul, String publisher, int stok, String sutradara) {
        super(judul, publisher, stok);
        this.sutradara = sutradara;
    }

    public String getSutradara() {
        return sutradara;
    }

    public KategoriF getKategori() {
        return kategori;
    }

    public List<String> getPemeran() {
        return pemeran;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public void setKategori(KategoriF kategori) {
        this.kategori = kategori;
    }

    public void setPemeran(String actor) {
        pemeran.add(actor);
    }

    public void addFilm() {
        inputDVD();
        Film film = new Film(getJudul(), getPublisher(), getStok(), getSutradara());
    }

    @Override
    public void inputDVD() {
        Scanner scan = new Scanner(System.in);
        super.inputDVD();

        System.out.print("Sutradara: ");
        String director = scan.nextLine();
        setSutradara(director);

        System.out.print("Masukkan jumlah pemain: ");
        int qtyActor = scan.nextInt();
        scan.nextLine();
        System.out.println("(Masukkan nama pemeran satu persatu!)");
        for (int i = 0; i < qtyActor; i++) {
            System.out.print("Nama Pemeran: ");
            String actor = scan.nextLine();
            setPemeran(actor);
        }
        boolean statusGenre = false;
        while (true) {
            System.out.print("Kategori  (SU = semua umur, D = dewasa, R = remaja, A = anak-anak): ");
            String genre = scan.nextLine().toUpperCase();
            switch (genre) {
                case "SU":
                    setKategori(KategoriF.SU);
                    statusGenre = true;
                    return;
                case "D":
                    setKategori(KategoriF.D);
                    statusGenre = true;
                    return;
                case "R":
                    setKategori(KategoriF.R);
                    statusGenre = true;
                    return;
                case "A":
                    setKategori(KategoriF.A);
                    statusGenre = true;
                    return;
                default:
                    System.out.println("Genre yang dimasukkan tidak valid");
                    break;
            }
        }

    }

    @Override
    public void displayDVD() {
        super.displayDVD();
        System.out.println("Sutradara: " + sutradara);
        System.out.println("Kategori: " + kategori.getKeterangan());
        System.out.println("Pemeran: ");
        for (int i = 0; i < pemeran.size(); i++) {
            System.out.println(i + 1 + ". " + pemeran.get(i));
        }
    }

}