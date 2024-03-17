import java.util.Scanner;

public class tech_abudent {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int sum = 0;
        System.out.println("Enter \'1\' for Abundant Number. \'2\' for Tech Number: ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.print("Enter the number: ");
                int n = sc.nextInt();
                for (int i = 1; i < n; i++) {
                    if (n % i == 0)
                        sum += i;
                }

                if (sum > n)
                    System.out.println(n + " is an abundant number");
                else
                    System.out.println(n + " is not an abundant number");
                break;
            case 2:
                System.out.print("Enter the number to check: ");

                int m = sc.nextInt();

                while (m > 0) {
                    count++;
                    m = m / 10;
                }

                if (count % 2 == 0)
                    System.out.println("The given number is a tech number.");
                else
                    System.out.print("The given number is not a tech number.");
                break;
            default:
                System.out.println("Invalid option selected.");

                break;
        }
        sc.close();
    }
}
