import java.util.Scanner;

public class Binary_Decimal {
    static Scanner sc = new Scanner(System.in);

    public static void Decimal_to_Binary(int num) {
        int s = 0;

        while (num != 0) {
            int r = num % 2;
            s = (s * 10) + r;
            num /= 2;
        }
        String bin = Integer.toString(s);
        String new_bin = "";
        for (int i = bin.length() - 1; i >= 0; i--) {
            new_bin += bin.charAt(i);
        }
        System.out.println("Binary value is: " + new_bin);
    }

    public static void Binary_to_Decimal(int num) {
        int ctr = 0;
        int sum = 0;
        while (num != 0) {
            int r = num % 10;
            sum = sum + r * (int) (Math.pow(2, ctr));
            num /= 10;
            ctr++;
        }
        System.out.println("Decimal value is: " + sum);
    }

    public static void main(String[] args) {

        System.out.println("Press 1 for Decimal to Binary conversion");
        System.out.println("Press 2 for Binary to Decimal conversion");

        int choice = sc.nextInt();
        System.out.println();
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        switch (choice) {
            case 1:
                Decimal_to_Binary(num);
                break;
            case 2:
                Binary_to_Decimal(num);
                break;

            default:
                System.out.println("Wrong input");
                break;
        }
    }
}
