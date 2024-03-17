import java.util.Scanner;

public class ternary_OP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int maxNum = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.printf("%d is the greatest of all the three numbers", maxNum);
        sc.close();
    }
}