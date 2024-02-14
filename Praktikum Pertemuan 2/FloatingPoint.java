class FloatingPoint {
    public static void main(String[] args) {
        double x = 92.98;
        int nx = (int) Math.round(x);
        System.out.println(nx);
    }
}

/*
 * 1. nx adalah variabel bertipe integer, nilai dari nx didapatkan dari hasil
 * variabel x yang diberlakukan math.round(x). math.round(x) membulatkan nilai
 * terdekat dari x, yaitu dari 92.98 menjadi 93
 * 
 * 2. dibutuhkan casting integer pada penggunaan math.round(x) karena
 * math.round(x) mengembalikan nilai bertipe data long sehingga diperlukan
 * casting integer sebab nx merupakan variabel bertipe data integer. alasan lain
 * dibutuhkan nya casting integer karena variabel x bertipe data double sehingga
 * tidak cocok dengan assingment nilai ke nx
 */