import java.util.Scanner;

public class vowel_COUNTER {
    public static void main(String[] args) {
        int ctr = 0;
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String l_ip = ip.toLowerCase();
        int len = l_ip.length() - 1;
        for (int i = 0; i <= len; i++) {
            char ch = l_ip.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ctr++;
            }
        }
        System.out.printf("NO.of Vowels:-%d", ctr);
        sc.close();
    }
}
