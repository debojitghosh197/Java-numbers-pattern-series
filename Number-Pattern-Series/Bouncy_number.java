import java.util.Scanner;

/**
 * Bouncy_number
 */
public class Bouncy_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        String numstr = Integer.toString(x);
        if(x>100){
            

        }else{
            System.out.println("Note that there is no bouncy number between 1 to 100. The first bouncy number is 101.");
        }
    }
}