import java.util.Scanner;

public class CekGraduation {
    public static void main(String[] args) {
        int nilai;
        String nama;
    
        Scanner input = new Scanner(System.in);
    
        System.out.print("Nama : ");
        nama = input.nextLine();
        
        System.out.print("Nilai : ");
        nilai = input.nextInt();
    
        if (nilai >= 70) {
            System.out.println("Selamat "+ nama + ", anda lulus!");
        }else {
            System.out.println("Maaf "+ nama + ", anda gagal");
        }
}
}
