import java.util.Scanner;

public class fetching_num {
    public static void main(String[] args) {
        String str1 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int x = (int) (str.charAt(i));
            for (int j = 48; j <= 57; j++) {
                if (x == j) {
                    char ch = (char) (x);
                    str1 += ch;
                }
            }
        }
        if (str1 == "") {
            System.out.println("Empty string");
        } else {
            System.out.println(str1);
        }
        sc.close();
    }
}
