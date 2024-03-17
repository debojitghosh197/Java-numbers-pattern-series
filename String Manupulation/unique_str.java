import java.util.Scanner;

public class unique_str {
    public static void main(String[] ags) {
        int ctr = 0;
        String str1 = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        str = str.toLowerCase().replaceAll(" ", "");
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    ctr++;
                }
            }
            if (ctr == 0) {
                str1 = "Unique string";
            } else {
                str1 = "Not unique string";
            }
        }
        System.out.println(str1);
        sc.close();
    }
}
