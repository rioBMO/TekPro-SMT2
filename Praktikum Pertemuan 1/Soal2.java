public class Soal2 {
    public static void main(String[] args) {
        int i = 42;
        String s = (i < 40) ? "life" : (i > 50) ? "universe" : "everything";
        System.out.println(s);
    }
}

//output yang dihasilkan adalah everything
//Teknik yang digunakan adalah operator ternary yang dimana digunakan untuk menggantikan if else
//Jadi bila i < 40 akan menampilkan life, jika i > 50 akan ditampilkan universe
//Karena i lebih dari 40 dan kurang dari 50 maka yang ditampilkan adalah everything