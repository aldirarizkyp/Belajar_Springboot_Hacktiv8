import java.util.LinkedList;

public class List2Linked {
    public static void main(String[] args) {
        LinkedList<String> buah = new LinkedList<>();
        buah.add("Mangga");
        buah.add("Rambutan");
        buah.add("Melon");

        //menambah list indeks awal dan indeks akhir
        buah.addFirst("Apel");
        buah.addLast("Durian");
        System.out.println(buah);

        //menghapus list indeks awal dan indeks akhir
        buah.removeFirst();
        buah.removeLast();

        //mengambil data pertama dan terakhir
        System.out.println(buah.getFirst());
        System.out.println(buah.getLast());
    }
}
