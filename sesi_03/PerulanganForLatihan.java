public class PerulanganForLatihan {
    public static void main(String[] args) {
        System.out.println("LATIHAN FOR LOOP");
        System.out.println("=================");

        System.out.println("A. Menampilkan Bintang");
        for(int i = 1 ; i<=6 ; i++ ) {
            System.out.println("*****");
        }
        System.out.println();

        System.out.println("B. Menampilkan angka 1 - 10");

        //B. Menampilkan angka 1-10
        for(int j = 1 ; j<= 10 ; j++) {
            System.out.print(j + " ");
        }

        System.out.println();

        System.out.println("C. Menampilkan bilangan ganjil dari 1 -20");
        //C. Menampilkan angka ganjil dari 1-20
        for(int k = 1 ; k<=20 ; k++) {
            if (k % 2 != 0) {
                System.out.print(k + " ");
            }
        }
    }
}
