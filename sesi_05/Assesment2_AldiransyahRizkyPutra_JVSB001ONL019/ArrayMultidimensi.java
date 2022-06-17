import java.util.Scanner;

public class ArrayMultidimensi {
    public static void main(String[] args) {
        String arr[][] = new String[2][3];
        Scanner in = new Scanner(System.in);

        System.out.println("Output ");

        // mengisi array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("siapa yang akan duduk di kelas (" + i + "," + j + ") : ");
                arr[i][j] = in.nextLine();
            }
        }
        System.out.println("=============================");

        // menampilkan array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + arr[i][j] + " |");
            }
            System.out.println();
        }

        System.out.println("=============================");
    }
}
