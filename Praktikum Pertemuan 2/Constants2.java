public class Constants2 {
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out
                .println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}

/*
 * 1. Output constant adalah = Paper size in centimeters: 21.59 by 27.94
 * Output constant2 adalah = Paper size in centimeters: 21.59 by 27.94
 * 
 * 2. Perbedaan penggunaan final double dan public static final double adalah
 * pada tingkat aksesibilitas dan cakupan nya. Final double hanya dapat diakses
 * di dalam kelas dan metode tempatnya dideklarasikan sedangkan public static
 * final double dapat diakses di luar tempatnya di deklarasikan atau dapat
 * diakses diakses di seluruh program.
 */