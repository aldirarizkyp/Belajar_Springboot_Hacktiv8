public class Bitwise {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int hasil_baru = 0;

        hasil_baru = a & b;
        System.out.println("a & b = " + hasil_baru);

        hasil_baru = a | b;
        System.out.println("a | b = " + hasil_baru);

        hasil_baru = a ^ b;
        System.out.println("a ^ b = " + hasil_baru);

        hasil_baru = ~a;
        System.out.println("~a = " + hasil_baru);

        hasil_baru = a << 2;
        System.out.println("a << 2 = " + hasil_baru);

        hasil_baru = a >> 2;
        System.out.println("a >> 2 = " + hasil_baru);

        hasil_baru = a >>> 2;
        System.out.println("a >>> 2 = " + hasil_baru);
    }
}
