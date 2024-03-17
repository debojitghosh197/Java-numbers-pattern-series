import java.util.*;

public class showroom_gift {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your bill amount-->");

    int amt = sc.nextInt();
    double t_amt = 0;
    String a;
    System.out.println();
    if (amt <= 2000) {
      t_amt = (5 * amt) / 100;
      a = "Calculator";
      System.out.println("Your original amount is: Rs" + amt);
      System.out.println("Your amount after discount is: Rs" + t_amt);
      System.out.println("!!Congratulation!! You got a gift on shopping: " + a);
    } else if (amt >= 2001 && amt <= 5000) {
      t_amt = (10 * amt) / 100;
      a = "School bag";
      System.out.println("Your original amount is: Rs" + amt);
      System.out.println("Your amount after discount is: Rs" + t_amt);
      System.out.println("!!Congratulation!! You got a gift on shopping: " + a);
    } else if (amt >= 5001 && amt <= 10000) {
      t_amt = (15 * amt) / 100;
      a = "Wall clock";
      System.out.println("Your original amount is: Rs" + amt);
      System.out.println("Your amount after discount is: Rs" + t_amt);
      System.out.println("!!Congratulation!! You got a gift on shopping: " + a);
    } else if (amt > 10000) {
      t_amt = (20 * amt) / 100;
      a = "Wrist watch";
      System.out.println("Your original amount is: Rs" + amt);
      System.out.println("Your amount after discount is: Rs" + t_amt);
      System.out.println("!!Congratulation!! You got a gift on shopping: " + a);
    }
    sc.close();
  }
}