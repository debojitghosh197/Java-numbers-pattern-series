import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = Math.max(a, b);
        int min = Math.min(a, b);
        while (min != 0) {
            r = max % min;
            max = min;
            min = r;
        }
        System.out.println("GCD of: " + a + " and " + b + " is " + max);
        sc.close();
    }
}
