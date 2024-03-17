import java.util.*;

public class longest_word_in_senten {
    public static void main(String[] args) {
        String word = "";
        String lo_word = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.nextLine();
        str += " ";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (word.length() > lo_word.length()) {
                    lo_word = word;
                }
                word = "";
            } else {
                word += ch;
            }
        }
        System.out.println("Longest word is: " + lo_word);
        System.out.println("No.of words in longest word is: " + lo_word.length());
        sc.close();
    }
}
