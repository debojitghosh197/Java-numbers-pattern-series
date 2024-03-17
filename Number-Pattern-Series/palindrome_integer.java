import java.util.Scanner;

public class palindrome_integer {
    public static void main(String[] args) {
        int r, c, s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NIMBER: ");
        int x = sc.nextInt();
        c = x;
        while (x > 0) {
            r = x % 10;
            s = (s * 10) + r;
            x = x / 10;
        }
        if (c == s) {
            System.out.println(c + " is palindrome.");
        } else {
            System.out.println(c + " is not a palindrome.");
        }
        sc.close();
    }
}
