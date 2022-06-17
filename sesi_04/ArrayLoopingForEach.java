import java.util.Scanner;

public class ArrayLoopingForEach {
    public static void main(String[] args) {
        String[] profesi = new String[5];

        Scanner scan = new Scanner(System.in);

        // pengisian array dengan scanner dan for
        for (int i = 0; i < profesi.length; i++) {
            System.out.print("Profesi ke-" + i + " : ");
            profesi[i] = scan.nextLine();
        }
        System.out.println("==================================");

        // menampilkan semua isi array
        for (String x : profesi) {
            System.out.println(x);
        }
    }
}
