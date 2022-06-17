public class Main {
    public static void main(String[] args) {
        BangunDatar hitung = new BangunDatar();

        Persegi persegi = new Persegi();
        persegi.sisi = 5;

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 7;

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;

        Segitiga segitiga = new Segitiga();
        segitiga.alas = 6;
        segitiga.tinggi = 10;

        // memanggil method luas dan keliling
        persegi.luas();
        persegi.keliling();
        System.out.println();

        lingkaran.luas();
        lingkaran.keliling();
        System.out.println();

        persegiPanjang.luas();
        persegiPanjang.keliling();
        System.out.println();

        segitiga.luas();
        segitiga.keliling();

    }
}

