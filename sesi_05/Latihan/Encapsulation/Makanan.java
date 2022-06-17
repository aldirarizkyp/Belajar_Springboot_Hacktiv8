public class Makanan {
    public static void main(String[] args) {
        Restoran data = new Restoran();

        // membuat data pada variabel
        data.setMenu("Ayam Geprek");
        data.setHarga(20000);
        data.setSpesial(true);

        // Memanggil method get dari class restoran dan menampilkannya
        System.out.println("Menu Makanan : " + data.getMenu());
        System.out.println("Harga Makan : Rp. " + data.getHarga());
        System.out.println("Menu Spesial : " + data.getSpesial());
    }
}
