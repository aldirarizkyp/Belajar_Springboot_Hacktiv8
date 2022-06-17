import java.util.Scanner;

public class Diskon {

    public static void main(String[] args) {
        double pembelian, diskon, harga_bayar;
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Total Pembelian : ");

        pembelian = in.nextDouble();
        System.out.println("Pembelian = Rp. " + pembelian);

        if (pembelian >= 1000000) {
            System.out.println("Diskon = 10% ");
            harga_bayar = pembelian - (pembelian * 0.1);
            System.out.println("Harga Bayar = Rp. " + harga_bayar);
        } else {
            System.out.println("Tidak ada diskon");
            harga_bayar = pembelian;
            System.out.println("Harga Bayar = Rp. " + harga_bayar);
        }

    }
}
