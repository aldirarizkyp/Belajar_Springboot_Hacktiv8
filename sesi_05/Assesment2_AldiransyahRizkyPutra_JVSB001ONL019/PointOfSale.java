import java.util.Scanner;

public class PointOfSale {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int beli = 0, i = 0;
        double total = 0;
        int[] kode = new int[5];
        String[] barang = new String[5];
        int[] quantity = new int[5];
        int[] harga = new int[5];
        double[] diskon = new double[5];
        double[] sub_total = new double[5];
        

        System.out.println("PROGRAM JAVA TENTANG PENJUALAN BARANG");

        System.out.print("Masukan Jumlah Beli : ");
        beli = input.nextInt();
        System.out.println(" ");
        // Memasukan elemen didalam array
        for (i = 0; i < beli; i++) {
            System.out.print("Masukan Kode Barang Ke-" + (i + 1) + " : ");
            kode[i] = input.nextInt();
            System.out.print("Masukan qty Ke-" + (i + 1) + " : ");
            quantity[i] = input.nextInt();
             
            switch (kode[i]) {
                case 1:
                    barang[i] = "Mouse Bluetooth 5.0  ";
                    harga[i] = 149999;
                    diskon[i] = 0.1;
                    break;
                case 2:
                    barang[i] = "Headphone Eksternal  ";
                    harga[i] = 246000;
                    diskon[i] = 0.05;
                    break;
                case 3:
                    barang[i] = "Power Bank 10.000 mAh";
                    harga[i] = 136000;
                    diskon[i] = 0;
                    break;
                case 4:
                    barang[i] = "Tripod Kamera        ";
                    harga[i] = 267999;
                    diskon[i] = 0.2;
                    break;
                case 5:
                    barang[i] = "Smart Watch Xiomi    ";
                    harga[i] = 899000;
                    diskon[i] = 0.1;
                    break;
                default:
                    System.out.println("Kode Barang Salah");
            }
        }

        System.out.println(" ");
        System.out.println("No   Nama Barang             Harga    QTY  Diskon  Sub Total");

        // Menampilkan array
        for (i = 0; i < beli; i++) {
            sub_total[i] = ((quantity[i] * harga[i]) - (quantity[i] * harga[i] * diskon[i]));
            total += sub_total[i];
            System.out.println(i + 1 + "    " + barang[i] + "   " + harga[i] + "    " + quantity[i] + "     "
                    + (int) (diskon[i] * 100) + "%" + "     " + sub_total[i]);
        }
        System.out.println(" ");
        System.out.println("Total Bayar : " + total);
    }
}
