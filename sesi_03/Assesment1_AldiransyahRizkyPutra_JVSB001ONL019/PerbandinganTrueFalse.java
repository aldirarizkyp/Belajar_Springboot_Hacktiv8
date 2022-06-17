public class PerbandinganTrueFalse {
    public static void main(String[] args) {
        //Buat Variabel
        int a = 10;
        int b = 8;
        int c = 12;
        int d = 5;

        // 1. >
        System.out.println("Tes ke 1 = "  + (a > d));
        // 2. <
        System.out.println("Tes ke 2 = " + (b < c));
        // 3. >=
        System.out.println("Tes ke 3 = " + (c >= b));
        // 4. <=
        System.out.println("Tes ke 4 = " + (b <= a));
        // 5. ==
        System.out.println("Tes ke 5 = " + (c % d == a % b));
        // 6. !=
        System.out.println("Tes ke 6 = " + (a != b));  
        // 7. >
        System.out.println("Tes ke 7 = " + (b > c));
        // 8. <=
        System.out.println("Tes ke 8 = " + (c <= d));
        // 9. ==
        System.out.println("Tes ke 9 = " + (a == c));
        // 10. !=
        System.out.println("Tes ke 10 = " + (c % d != a % b ));

    }
}
