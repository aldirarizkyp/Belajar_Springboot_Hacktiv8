public class OperatorPenugasan {
    public static void main(String[] args) {
        int a;
        int b;

        // Pengisian Nilai
        a = 5;
        b = 10;

        // penambahan
        b += a; //-> b = b + a
        System.out.println("Penambahan: " + b);

        //pegurangan
        b -= a; //-> b = b - a
        System.out.println("Pengurangan: "+ b);
        
        //perkalian
        b *= a;
        System.out.println("Perkalian: " + b);

        //pembagian
        b /= a;
        System.out.println("Pembagian: "+ b);

        //Sisa bagi
        b %= a;
        System.out.println("Sisa Bagi: " + b);
    }
}
