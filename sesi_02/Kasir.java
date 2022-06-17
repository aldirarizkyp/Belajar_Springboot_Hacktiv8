import java.time.Year;
import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        int belanjaan, diskon, bayar;
        String kartu;
        Scanner scan = new Scanner(System.in);

        //menagmbil input
        System.out.print("Apakah ada kartu member?");
        kartu = scan.nextLine();
        
        System.out.print("Total Belanjaan: ");
        belanjaan = scan.nextInt();

        //proses
        if(kartu.equalsIgnoreCase("ya")) { 
            if (belanjaan > 500000){
                diskon = 50000;
            }else if (belanjaan > 100000) {
                diskon = 15000;
            }else {
                diskon = 0;
            }
        }else {
            if (belanjaan>100000) {
                diskon = 10000;
            }else {
                diskon = 0;
            }
        }

        //total yang harus dibayar;
        bayar = belanjaan - diskon;

        System.out.println("Total Bayar: Rp " + bayar);
    }
}
