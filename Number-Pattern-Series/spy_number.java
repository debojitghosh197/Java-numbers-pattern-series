import java.util.*;

public class spy_number {
    public static void main(String[] args) {
        int sum = 0, product = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        while (x > 0) {
            int r = x % 10;
            sum = sum + r;
            product = product * r;
            x = x / 10;
        }
        if (sum == product) {
            System.out.println("It is a spy number");
        } else {
            System.out.println("It is not a spy number");
        }
        sc.close();
    }
}
