import java.util.Scanner;

public class SpheniNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();

        int copy = x;
        int product = 1, ctrx = 0;

        // 1st loop for checking factors
        for (int i = 2; i <= x; i++) {
            int ctr = 0;
            
            //2nd loop for checking whether the factor is prime or not
            if (x % i == 0) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        ctr++;
                    }
                }
                if (ctr == 2) {
                    ctrx++;
                    product *= i;

                }
                x /= i;
            }
            if (ctrx == 3) {
                break;
            }
        }
        if (product == copy && ctrx == 3) {
            System.out.println("It is a sphenic number");
        } else {
            System.out.println("It is not a sphenic number");
        }
    }
}
