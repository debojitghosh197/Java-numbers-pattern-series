import java.util.*;

public class TAXI_charge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Taxi.No--> ");
        String taxi_no = sc.nextLine();
        System.out.print("Enter your distance--> ");
        int dist = sc.nextInt();
        int amt = 0;
        if (dist <= 5) {
            amt = 100;
        } else if (dist <= 15) {
            amt = 100 + 10 * (dist - 5);
        } else if (dist <= 25) {
            amt = 100 + 100 + 8 * (dist - 15);
        } else if (dist > 25) {
            amt = 100 + 100 + 80 + 5 * (dist - 25);
        }
        System.out.println("Taxi.No: " + taxi_no);
        System.out.println("Distance: " + dist + "Km");
        System.out.println("Amount: Rs" + amt);
        sc.close();
    }
}