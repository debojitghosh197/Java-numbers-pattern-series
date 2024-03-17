import java.util.*;

public class consecutiveWordInSen {
    public static void main(String[] args) {
        boolean val;
        int ctr = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {

            if (i == str.length() - 1) {
                break;
            }
            val = ((int) (str.toLowerCase().charAt(i) + 1) == (int) (str.toLowerCase().charAt(i + 1))) ? true : false;
            if (val == true) {
                ctr++;
            }
        }
        if (ctr > 0) {
            System.out.println("It is a consecutive word\n" + (ctr + 1) + " alphabets are consecutive");
        }
        sc.close();
    }
}