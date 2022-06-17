import java.util.Scanner;

public class PenjumlahanXY {
    public static void main(String[] args) {
        //BLOK SOAL A
    
            int x1, x2,y1, y2;
    
            Scanner input = new Scanner(System.in);
    
            System.out.print("Masukkan nilai y1 : ");
            y1 = input.nextInt();
            System.out.print("Masukkan nilai y2 : ");
            y2 = input.nextInt();
    
            //blok nilai x1
            x1 = (y1 + y2) * (y1 + y2);
    
            //blok nilai x2
            x2 = (y1 % 4) * y2;
    
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
    
        //BLOK SOAL B
            System.out.println("x1 >= x2 ===> "+ (x1 >= x2));      //1. x1 >= x2 ===> true
            System.out.println("x2 >= x1 ===> "+ (x2 >= x1));      //2. x2 >= x1 ===> false
            System.out.println("x1 mod 4 == ++x2 mod 5 ===> "+ (x1 % 4 == ++x2 % 5)); //3. x1 mod 4 == ++x2 mod 5 ===> true
        
        //NOTES  PenjumlahanXY sudah di Gabungkan
      
    }
}
