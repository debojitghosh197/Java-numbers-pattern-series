import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        int ctr = 0;
        double NET = 0, DA = 0, HRA = 0, TAX = 0;
        Scanner sc = new Scanner(System.in);
        while (ctr != 50) {

            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.println();
            System.out.print("Enter your Basic pay: ");
            double basic = sc.nextDouble();
            if (basic >= 10000) {
                if (basic >= 50000) {
                    DA = basic * 40 / 100;
                    HRA = basic * 30 / 100;
                    TAX = basic * 30 / 100;
                    NET = basic + DA + HRA - TAX;
                } else {
                    DA = basic * 40 / 100;
                    HRA = basic * 30 / 100;
                    NET = basic + DA + HRA;
                }
            } else if (basic >= 5000 && basic <= 10000) {
                DA = basic * 40 / 100;
                HRA = basic * 25 / 100;
                NET = basic + DA + HRA;
            } else if (basic < 5000 && basic > 2000) {
                DA = basic * 30 / 100;
                HRA = basic * 20 / 100;
                NET = basic + DA + HRA;
            } else {
                DA = basic * 30 / 100;
                HRA = basic * 15 / 100;
                NET = basic + DA + HRA;
            }
            System.out.println("Name\tBasic monthly pay\tDA\tHRA\tMonthly Income Tax\tNet monthly salary ");
            System.out.println();
            System.out.println(name + "\t   " + basic + "\t     " + DA + "\t" + HRA + "\t\t" + TAX + "\t\t" + NET);
            ctr++;
            sc.nextLine();

        }
        sc.close();
    }
}
