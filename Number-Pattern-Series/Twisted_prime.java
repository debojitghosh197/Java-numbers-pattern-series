import java.util.Scanner;

public class Twisted_prime {
    public static void main(String[] args) {
        int s = 0, ctr = 0, ctr2 = 0, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int copynum = num;

        while (num != 0) {
            r = num % 10;
            s = (s * 10) + r;
            num = num / 10;
        }
        for (int i = 1; i <= copynum; i++) {
            if (copynum % i == 0) {
                ctr++;
            }
        }
        for (int j = 1; j <= s; j++) {
            if (s % j == 0) {
                ctr2++;
            }
        }
        if (ctr == 2) {
            if (ctr == 2 && ctr2 == 2) {
                System.out.println("It is a prime number as well as Twisted prime number");
            } else {
                System.out.println("It is a prime number");
            }
        } else {
            System.out.println("It is not a prime number nor a Twisted prime number");
        }
        sc.close();
    }
}
