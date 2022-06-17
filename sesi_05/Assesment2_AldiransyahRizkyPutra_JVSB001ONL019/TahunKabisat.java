import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        int tahun;

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan tahun : ");
        tahun = in.nextInt();

        // proses
        if (tahun % 400 == 0) {
            System.out.println(tahun + " merupakan tahun Kabisat");
        } else if (tahun % 100 == 0) {
            System.out.println(tahun + " bukan tahun Kabisat");
        } else if (tahun % 4 == 0) {
            System.out.println(tahun + " merupakan tahun Kabisat");
        } else {
            System.out.println(tahun + " bukan tahun Kabisat");
        }
    }
}
