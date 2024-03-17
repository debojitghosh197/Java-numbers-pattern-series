import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        System.out.printf("Factorial of %d is = %d", number, result);
        sc.close();
    }
}
