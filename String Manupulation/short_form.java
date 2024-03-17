import java.util.*;

public class short_form {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String str = sc.nextLine();
    str = str.toUpperCase();
    char ch = str.charAt(0);
    System.out.print("Short form is- " + ch);
    for (int i = 0; i < str.length(); i++) {
      char ch1 = str.charAt(i);
      if (ch1 == ' ') {
        char ch2 = str.charAt(i + 1);
        System.out.print("." + ch2);
      }
    }
    sc.close();
  }
}
