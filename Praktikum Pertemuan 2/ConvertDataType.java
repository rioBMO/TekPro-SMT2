class ConvertDataType {
    static short methodOne(long l) {
        System.out.println("long = " + l);
        int i = (int) l;
        System.out.println("i = " + l);
        return (short) i;
    }

    public static void main(String[] args) {
        double d = 10.25;
        System.out.println("d = " + d);
        float f = (float) d;
        System.out.println("f = " + f);
        byte b = (byte) methodOne((long) f);
        System.out.println("b = " + b);
    }
}

/*
 * 1. Output dari variabel b adalah 10. Awalnya, variabel d bertipe double
 * memiliki nilai 10.25 di casting menjadi float untuk di assign pada variabel
 * float f ( casting ini tidak merubah nilai karena bentuk bilangan tetap
 * desimal ), kemudian methodOne diberlakukan pada f sehingga mengubah f menjadi
 * long ( casting ini merubah nilai karena bentuk bilangan menjadi bulat ) dan
 * nilai menjadi 10, kemudian di casting kembali menjadi integer untuk di assign
 * pada variabel int i, lalu methodOne mengembalikan nilai sebagai tipe data
 * short yang kemudian di casting menjadi byte untuk assignment pada variabel
 * byte b, maka hasilnya adalah 10 karena tipe data long, int, dan byte memliki
 * bentul bilangan bulat sehingga tidak terjadi perubahan nilai.
 * 
 * 2. Awalnya d memiliki nilai 10.25 karena bertipe double yang dapat menampung
 * angka desimal, kemudian setelah di cast menjadi b, angka desimal menghilang
 * karena tipe data byte tidak dapat menampung angka desimal sehingga nilai
 * menjadi 10.
 */