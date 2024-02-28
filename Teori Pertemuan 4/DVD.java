import java.util.Scanner;

public class DVD {
    private String judul;
    private String publisher;
    private int stok;

    public DVD(String judul, String publisher, int stok) {
        this.judul = judul;
        this.publisher = publisher;
        this.stok = stok;
    }

    public String getJudul() {
        return judul;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getStok() {
        return stok;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void inputDVD() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Judul: ");
        String jdl = scan.nextLine();

        System.out.print("Publisher: ");
        String pblshr = scan.nextLine();

        System.out.print("Stok: ");
        int stk = scan.nextInt();
        scan.nextLine();

        setJudul(jdl);
        setPublisher(pblshr);
        setStok(stk);
    }

    // public void addDVD() {

    // }

    public void displayDVD() {
        System.out.println("Judul: " + judul);
        System.out.println("Publisher" + publisher);
        System.out.println("Stok: " + stok);
    }
}