public class OperatorPembanding {
    public static void main(String[] args) {
        int x = 20;
        int y = 40;

        //PROGRAM OPERATOR PEMBANDING 1
        System.out.println("x == y = "+ (x == y) );
        System.out.println("x != y = "+ (x != y));
        System.out.println("x > y = " + (x > y));
        System.out.println("x < y = " + (x < y));
        System.out.println("y >= x = " + ( y >= x));
        System.out.println("y <= x = "+ (y <= x ));

        //PROGRAM OPERATOR PEMBANDING 2
        int nilaiA = 12;
        int nilaiB = 4;
        boolean hasil;

        //apakah nilai A lebih besar dari nilai B?
        hasil = nilaiA > nilaiB;
        System.out.println(hasil);

        //apakah nilai A lebih kecil dari nilai B?
        hasil = nilaiA < nilaiB;
        System.out.println(hasil);

        //apakah nilai A lebih besar sama dengan nilai B?
        hasil = nilaiA >= nilaiB;
        System.out.println(hasil);

        //apakah nilai A lebih kecil sama dengan nilai B?
        hasil = nilaiA <= nilaiB;
        System.out.println(hasil);

        //apakah nilai A sama dengan nilai B
        hasil = nilaiA == nilaiB;
        System.out.println(hasil);

        //apakah nilai A tidak sama dengan nilai B
        hasil = nilaiA != nilaiB;
        System.out.println(hasil);

    }
}
