import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;

        Scanner keyboard = new Scanner(System.in);

        //penjumlahan
        System.out.print("Masukan angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Masukan angka-2: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 + angka2;
        System.out.println("Hasil Penjumlahan = "+ hasil);

        //pengurangan
        System.out.print("Masukan angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Masukan angka-2: ");
        angka2 = keyboard.nextInt();
       
        hasil = angka1-angka2;
        System.out.println("Hasil Pengurangan = " + hasil);

        //perkalian
        System.out.print("Masukan angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Masukan angka-2: ");
        angka2 = keyboard.nextInt();
       
        hasil = angka1 * angka2;
        System.out.println("Hasil Perkalian = " + hasil);

        //pembagian
        System.out.print("Masukan angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Masukan angka-2: ");
        angka2 = keyboard.nextInt();
       
        hasil = angka1 / angka2;
        System.out.println("Hasil Pembagian = " + hasil);

        //sisa bagi
        System.out.print("Masukan angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Masukan angka-2: ");
        angka2 = keyboard.nextInt();
       
        hasil = angka1 % angka2;
        System.out.println("Hasil Sisa Bagi = " + hasil);






    }
}
