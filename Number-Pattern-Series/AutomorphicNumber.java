import java.util.*;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();

        if (isAutomorphic(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }
        sc.close();
    }

    // Function to check if a number is automorphic
    public static boolean isAutomorphic(int number) {
        int square = number * number;

        while (number > 0) {
            if (number % 10 != square % 10) {
                return false;
            }

            number /= 10;
            square /= 10;
        }

        return true;
    }
}
