import java.util.Scanner;

public class character_frequency {
    public static void main(String[] args) {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        str = str.toLowerCase().replaceAll(" ", "");
        System.out.println("CHARACTERS\tFREQUENCY");
        for (int i = 33; i <= 122; i++) {
            int ctr = 0;
            for (int j = 0; j < str.length(); j++) {
                x = (int) (str.charAt(j));
                if (i == x) {
                    ctr++;
                }
            }
            if (ctr != 0) {
                System.out.println("   " + (char) (i) + "\t\t   " + ctr);
            }
        }
        sc.close();
    }
}