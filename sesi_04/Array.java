public class Array {
    public static void main(String[] args) {
        // deklarasi array
        int[] contoh;
        contoh = new int[4];

        // cek ukuran array
        System.out.println(contoh.length);

        // mengisi array
        contoh[0] = 5;
        contoh[1] = 10;
        contoh[2] = contoh[1] + 10;
        contoh[3] = 9;

        // deklarasi array baru
        int[] arr = { 5, 15, 9, 9 };

        // array handling
        System.out.println(arr[1]);

        String bahasa[] = { "Golang", "Java", "Javascript", "PHP", "Python" };
        System.out.println(bahasa[2]);

    }
}
