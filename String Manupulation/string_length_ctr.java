import java.util.*;

public class string_length_ctr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int a = st.length() - 1;
        int len = 0;
        int len2 = 1;
        for (int i = 0; i <= a; i++) {
            char ch = st.charAt(i);
            len++;
            if (ch == '.' || ch == '@' || ch == ')' || ch == '(' || ch == '/' || ch == '-' || ch == '!' || ch == '$'
                    || ch == '#' || ch == ':' || ch == ';' || ch == '?' || ch == '"') {
                len--;
            }
            if (ch == ' ') {
                len2++;
            }
        }
        int avg = len / len2;
        System.out.println(avg);
        sc.close();
    }
}