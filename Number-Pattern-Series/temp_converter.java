import java.util.*;

public class temp_converter {
    public static void main(String[] args) {
        double cel, Freh, orig_val; // initializing variables
        char ch = 'F';
        Scanner sc = new Scanner(System.in); // obj of scanner class
        // Inputs statemnts
        System.out.println("Temperature in C or F? ");
        char ChInput_val = sc.next().charAt(0);
        System.out.println("Enter the value: ");
        double numVal = sc.nextDouble();
        // calculating orig_val
        cel = (numVal - 32) * 5 / 9;
        Freh = (numVal * 9 / 5) + 32;
        orig_val = (ChInput_val == ch) ? Freh : cel; // checking condition
        System.out.println("Value = " + orig_val);
        sc.close();
    }
}
