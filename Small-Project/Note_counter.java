
/*HI, I am Debojit
 * This is the program of counting the number of the respective notes to make the money [Money Domination]
 * 
 * Hrer, I have taken the notes in an array latter i had created the another empty array
 * Then taking input through scanner class
 * Then seperating the avaialble notes into the empty array
 * Then the logic is designed in while loop
 */
import java.util.*;

public class Note_counter {
    public static void main(String[] args) {
        int ctr = 0;
        int a = 0;
        Scanner sc = new Scanner(System.in);
        int[] notes = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

        System.out.print("Enter the amount: ");
        int x = sc.nextInt();
        sc.close();

        System.out.println("Money denominations are:\n");

        while (x > 0) {
            if (x >= notes[a]) {
                int count = x / notes[a];
                x = x % notes[a];
                System.out.println(count + " notes of Rs " + notes[a]);
                ctr += count;
            }
            a++;
        }
        System.out.println("\nTotal number of notes: " + ctr);
    }
}
