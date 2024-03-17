import java.util.Scanner;

public class number_square_trinagle_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the option: ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= 4; j++) {
                        if (j == 5 - i) {
                            System.out.print(i + " ");
                        } else {
                            System.out.print("* ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 9; i >= 1; i = i - 2) {
                    for (int j = 9; j >= i; j = j - 2) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid option selected.");
                break;
        }
        sc.close();
    }
}