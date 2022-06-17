public class Segitiga extends BangunDatar{
    float alas, tinggi;

    @Override
    public float luas() {
        float luas = alas * tinggi * 1 / 2;
        System.out.println("Luas segitiga : " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        float keliling = alas * 3;
        System.out.println("Keliling Segitiga : " + keliling);
        return keliling;
    }
}
