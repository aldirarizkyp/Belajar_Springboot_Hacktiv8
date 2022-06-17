public class ArrayMultidimensi {
    public static void main(String[] args) {
        // deklarasi array multi dimensi

        String[][] profesi = { { "Java", "Kotlin" }, { "React", "ReactNative" }, { "PHP", "Laravel" } };

        for (int i = 0; i < profesi.length; i++) {
            System.out.println("Bahasa  : " + profesi[i][0]);
            System.out.println("Framework : " + profesi[i][1]);
            System.out.println("================================");
        }
    }
}
