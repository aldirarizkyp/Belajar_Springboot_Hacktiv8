public class Restoran {
    // variabel private

    private String menu;
    private double harga;
    private boolean spesial;

    // method setter public dengan param
    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setSpesial(boolean spesial) {
        this.spesial = spesial;
    }

    // Method Getter public
    public String getMenu() {
        return menu;
    }

    public double getHarga() {
        return harga;
    }

    public boolean getSpesial() {
        return spesial;
    }
}
