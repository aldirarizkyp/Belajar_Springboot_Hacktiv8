public class IncrementDecrement {
    public static void main(String[] args) {
        //Buat variabel awal
        int a = 0;
        int b = 0;
        int c = 9;
        int d = 9;
        //Print ke 1
        System.out.println("Print ke 1");
        System.out.println("A = " + a++); //hasil : 0
        System.out.println("B = " + ++b); //hasil : 1
        System.out.println("C = " + c--); //hasil : 9
        System.out.println("D = " + --d); //hasil : 8

        //Print ke 2
        System.out.println("Print ke 2");
        System.out.println("A = " + a++); //hasil A = 1
        System.out.println("B = " + ++b); //hasil B = 2
        System.out.println("C = " + c--); //hasil C = 8
        System.out.println("D = " + --d); //hasil D = 7

        System.out.println("Print ke 3");
        //Print ke 3
        System.out.println("A = " + a++);    //hasil A = 2
        System.out.println("B = " + ++b);    //hasil B = 3
        System.out.println("C = " + c-- );    //hasil C = 7
        System.out.println("D = " + --d);    //hasil D = 6

        System.out.println("Print ke 4");
        //Print ke 4
        System.out.println("A = " + a++);    //hasil A = 3
        System.out.println("B = " + ++b);    //hasil B = 4
        System.out.println("C = " + c--);    //hasil C = 6
        System.out.println("D = " + --d );    //hasil D = 5

    }
}
