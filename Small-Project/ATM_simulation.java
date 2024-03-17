import java.util.*;

public class ATM_simulation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int money = 1000, i = 1;
            int pin = 1234;
            System.out.println("(: !!WELCOME TO YOUR SQUIRREL-INDIA AIM!! :)");
            System.out.print("Enter your  4-digit pin: ");
            int pin1 = sc.nextInt();
            while (i < 2) {
                if (pin1 == pin) {
                    while (i < 2) {
                        System.out.println("DEPOSIT             ..    1");
                        System.out.println("WITHDRAWL           ..    2");
                        System.out.println("BALANCE INQUIRY     ..    3");
                        System.out.println("EXIT                ..    4");
                        System.out.println();
                        System.out.println();
                        System.out.print("Enter your choice--> ");
                        int d = sc.nextInt();
                        System.out.println();
                        switch (d) {

                            case 1:
                                System.out.print("Enter your amount--> Rs");
                                int m = sc.nextInt();
                                money = money + m;
                                System.out.println();
                                System.out.println("✅Your money has successfully deposited✅");
                                System.out.println();
                                break;

                            case 2:
                                System.out.print("Enter your required amount--> Rs");
                                int wm = sc.nextInt();
                                if (wm < money) {
                                    System.out.println("Withdrawn successful");
                                    System.out.println("Your withdrawn amount is--> Rs" + wm);
                                    money = money - wm;
                                    System.out.println("Your current balance is now--> Rs" + money);
                                } else if (wm >= money) {
                                    System.out.println(
                                            "!!Sorry!! you can't withdrawl more than or equal to your balance");
                                    System.out.println();
                                    System.out.println(
                                            "                 !!!Please check your balance!!!                ");
                                    System.out.println();
                                }
                                break;

                            case 3:
                                System.out.println();
                                System.out.println("Your current balance is-->" + money);
                                System.out.println();
                                break;

                            case 4:
                                System.out.println();
                                System.out.println("        (: Thanks for using our ATM :)        ");
                                System.out.println();
                                i = i + 1;
                                break;
                        }
                    }
                } else {
                    System.out.println("❕❕❕❌❌Please enter your valid pin❌❌❕❕❕");
                    i = i + 1;
                }
            }
        }
    }
}