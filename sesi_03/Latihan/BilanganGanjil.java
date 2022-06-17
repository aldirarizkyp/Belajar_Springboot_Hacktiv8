package Latihan;

public class BilanganGanjil {
    public static void main(String[] args) {
        System.out.println("C. Menampilkan bilangan ganjil dari 1 -20");
        //C. Menampilkan angka ganjil dari 1-20
        for(int k = 1 ; k<=20 ; k++) {
            if (k % 2 != 0) {
                System.out.print(k + " ");
            }
        }
    }
}
