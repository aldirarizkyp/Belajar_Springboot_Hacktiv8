import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Nissan");
        cars.add("Mazda");
        cars.add("Mitsubishi");
        System.out.println(cars);

        //check apakah ada
        System.out.println(cars.contains("Mazda"));

        //menghapus
        cars.remove("Nissan");
        System.out.println(cars);

        //cek size
        System.out.println(cars.size());

    }
}
