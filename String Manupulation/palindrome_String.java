import java.util.*;

public class palindrome_String {
    public static void main(String[] args) {
        String Rstr = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine().toLowerCase();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            Rstr = Rstr + ch;
        }
        if (str.equals(Rstr)) {
            System.out.println("It a palindrome string.");
        } else {
            System.out.println("It not a palindrome string.");
        }
        sc.close();
    }
}
