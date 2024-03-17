import java.util.Scanner;

public class series {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        System.out.println("Enter the option: ");
        switch (option) {
            case 1:
                System.out.println("Enter n-th term: ");
                int m = sc.nextInt();
                for (int i = 1; i <= m; i += 3) {
                    System.out.print(i + " ");
                }
                break;

            case 2:
                System.out.println("Enter the value of x ");
                int x = sc.nextInt();

                System.out.println("Enter the nth term 'n' ");
                int n = sc.nextInt();

                double sum = 0;
                for (int i = 1; i <= n; i++) {
                    double result = (double) x / i;
                    if (i % 2 == 0)
                        sum -= result;
                    else
                        sum += result;
                }
                System.out.println("Sum of the series is " + sum);
                break;
            default:
                System.out.println("Invalid option selected.");
                break;
        }
        sc.close();
    }
}
