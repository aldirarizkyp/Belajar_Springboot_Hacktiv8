import java.util.Scanner;

public class MenentukanBilangan {

    public static void main(String[] args) {
        double average;
        double x, y, z;
        double besar, kecil;

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Bilangan Pertama (X) : ");
        x = in.nextDouble();
        System.out.print("Masukkan Bilangan Kedua (Y) : ");
        y = in.nextDouble();
        System.out.print("Masukkan Bilangan Ketiga (Z) : ");
        z = in.nextDouble();

        System.out.println();

        // rata-rata
        average = (x + y + z) / 3;

        // terbesar
        if (x > y && x > z) {
            besar = x;
        } else if (y > x && y > z) {
            besar = y;
        } else {
            besar = z;
        }

        // terkecil
        if (x < y && x < z) {
            kecil = x;
        } else if (y < x && y < z) {
            kecil = y;
        } else {
            kecil = z;
        }

        // output
        System.out.println("Hasil:");
        System.out.println("Rata-ratanya adalah : " + average);
        System.out.println(besar + " adalah bilangan terbesar");
        System.out.println(kecil + " adalah bilangan terkecil");

    }
}
