import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> buah = new ArrayList<>();

        buah.add("Apel");
        buah.add("Pisang");
        buah.add("Durian");
        buah.add("Mangga");
        buah.add("Jeruk");

        //menampilkan objek buah
        System.out.println(buah);

        //menampilkan indeks tertentu
        System.out.println(buah.get(0));

        //merubah data
        buah.set(2, "Kelapa");
        System.out.println(buah.get(2));

        //menghapus data
        buah.remove(3);

        //mengecek ukuran list
        System.out.println(buah.size());
        
        //perulangan terhadap list
        for (int i = 0; i < buah.size(); i++) {
            System.out.println(buah.get(i));
        }
    }
}
