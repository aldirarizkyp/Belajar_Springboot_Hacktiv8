import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, String> cars = new HashMap<>();

        //menambah key dan value
        cars.put("Suzuki", "Ertiga");
        cars.put("Mitsubishi", "Xpander");
        cars.put("Toyota", "Avanza");

        //mencetak map
        System.out.println(cars);

        //mengambil data berdasarkan key
        System.out.println(cars.get("Mitsubishi"));
        
        //menghapus data berdasarkan key
        cars.remove("Toyota");

        //melakukan perulangan terhadap isi dari map dengan key
        for (String i : cars.keySet()) {
            System.out.println(i);
          }
        
        //melakukan perulangan terhadap isi dari map dengan values
        for (String i : cars.values()) {
            System.out.println(i);
          }

    }
}
