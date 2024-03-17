import java.util.Scanner;

public class Mystery_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        for (int i = 22; i <= 198; i++) {
            int reverse = 0;
            int copy = i;
            
            while (copy != 0) {
                int r = copy % 10;
                reverse = (reverse * 10) + r;
                copy /= 10;
            }
            
            if (i + reverse == num) {
                System.out.println("It is a mystery number");
                return; // Exit the program since the mystery number is found
            }
        }
        
        System.out.println("It is not a mystery number");
    }
}
