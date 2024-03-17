import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String str1 = sc.next();
        System.out.print("Enter second word: ");
        String str2 = sc.next();

        sc.close();

        if (str1.length() == str2.length()) {

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("The words are anagrams.");
            } else {
                System.out.println("The words are not anagrams.");
            }
        } else {
            System.out.println("The words are not anagrams because they have different lengths.");
        }
    }
}
