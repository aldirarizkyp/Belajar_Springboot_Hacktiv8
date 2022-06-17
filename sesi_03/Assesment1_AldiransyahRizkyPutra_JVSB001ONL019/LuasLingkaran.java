import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        //deklarasi
        Scanner input = new Scanner(System.in);
         double Luas, PI;
         int r;

        //deskripsi
        PI = 3.14;
        System.out.print("Masukkan nilai r: ");
        r = input.nextInt();

        //Proses
        Luas = PI * r * r;

        //Output
        System.out.println("Luas Lingkaran = " + Luas);
    }
}
