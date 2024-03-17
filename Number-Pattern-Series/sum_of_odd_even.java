import java.util.*;

public class sum_of_odd_even {
    public static void main(String[] args) {
        int y, ctr = 0, ctr1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int x = sc.nextInt();
        while (x != 0) {
            y = x % 10;
            x = x / 10;
            if (y % 2 == 0) {
                ctr += y;
            } else {
                ctr1 += y;
            }
        }
        System.out.printf("Sum of even numbers are - %d", ctr);
        System.out.println();
        System.out.printf("Sum of odd numbers are - %d", ctr1);
        sc.close();
    }
}
