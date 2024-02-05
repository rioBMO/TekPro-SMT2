public class Soal1 {
    public static void main(String[] args) {
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1 + angka2);

        System.out.println("Hasil 1 " + hasil);
    }
}

// output yang keluar -125
// karena terjadi overflow atau wrap around pada tipe data byte sehingga kembali
// ke nilai awal atau paling rendah yaitu -128.
// Jadi 125 + 6 = 131, 131 diubah menjadi -125