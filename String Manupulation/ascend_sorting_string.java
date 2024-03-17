import java.util.Scanner;

public class ascend_sorting_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text for arrangement: ");
        String str = sc.nextLine();
        String word = "";
        for (char ch = 'a'; ch <= 'z'; ch++) {
            for (int i = 0; i <= str.length() - 1; i++) {
                if (ch == (str.toLowerCase()).charAt(i))
                    word += str.charAt(i);
            }
        }
        System.out.println("Your text in alphabetical order: " + word);
        sc.close();
    }
}
