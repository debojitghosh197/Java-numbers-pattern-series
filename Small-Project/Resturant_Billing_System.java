import java.util.Scanner;

/* 
 * Veg_Nonveg interface
 */
interface Veg_Nonveg {
  double veg_Starter();

  double non_veg_Satrter();

  double veg_Maincourese();

  double non_veg_Maincourse();

}

class Resturant implements Veg_Nonveg {

  private double veg_Starter_Bill = 0;
  private double non_veg_Starter_Bill = 0;
  private double veg_Maincourse_Bill = 0;
  private double non_veg_Maincourse_Bill = 0;

  Scanner sc = new Scanner(System.in);

  @Override
  public double veg_Starter() {

    int quantity = 0;
    int[] price = {}; // write the rice here

    while (true) {
      System.out.println();

      // write the items here

      System.out.println();
      System.out.print("Enter you choice: ");
      int choice = sc.nextInt();
      if (choice < 0 || choice > 10) {
        System.out.println("WRONG INPUT!(please enter the correct choice from the menu)");
        continue;
      }
      System.out.print("Enter the quantity(number of plates or bowl): ");
      quantity = sc.nextInt();
      if (quantity <= 0) {
        System.out.println("WRONG INPUT!(please enter the correct quantity)");
        continue;
      }
      veg_Starter_Bill += quantity * price[choice];
      System.out.print("Do you want to order more?\n'Y' for Yes.\n'N' for No.");

      char want_more = sc.next().charAt(0);
      want_more = Character.toLowerCase(want_more);

      if (want_more != 'y') {
        break;
      } else {
        continue;
      }
    }

    return veg_Starter_Bill;
  }

  @Override
  public double non_veg_Satrter() {

    int quantity = 0;
    int[] price = {}; // write the rice here

    while (true) {
      System.out.println();

      // write the items here

      System.out.println();
      System.out.print("Enter you choice: ");
      int choice = sc.nextInt();
      if (choice < 0 || choice > 10) {
        System.out.println("WRONG INPUT!(please enter the correct choice from the menu)");
        continue;
      }
      System.out.print("Enter the quantity(number of plates or bowl): ");
      quantity = sc.nextInt();
      if (quantity <= 0) {
        System.out.println("WRONG INPUT!(please enter the correct quantity)");
        continue;
      }
      non_veg_Starter_Bill += quantity * price[choice];
      System.out.print("Do you want to order more?\n'Y' for Yes.\n'N' for No.");

      char want_more = sc.next().charAt(0);
      want_more = Character.toLowerCase(want_more);

      if (want_more != 'y') {
        break;
      } else {
        continue;
      }
    }

    return non_veg_Starter_Bill;
  }

  @Override
  public double veg_Maincourese() {

    int quantity = 0;
    int[] price = { 40, 20, 35, 40, 80, 90, 200, 100, 200, 150, 150, 100 };

    while (true) {
      System.out.println();
      System.out.println("*********************** VEG MAIN-COURSE ************************");
      System.out.println(" _______________________________________________________________");
      System.out.println("|         Enter 0 for Rice(1 per plate) ₹40.                   |");
      System.out.println("|         Enter 1 for Veg Dal(1 bowl) ₹20.                     |");
      System.out.println("|         Enter 2 for veg-momos(6 per plate) ₹35.              |");
      System.out.println("|         Enter 3 for raita(1 bowl) ₹40.                       |");
      System.out.println("|         Enter 4 for rasam(1 bowl) ₹80.                       |");
      System.out.println("|         Enter 5 for aloo matar(1 bowl) ₹90.                  |");
      System.out.println("|         Enter 6 for pulao (1 full plate) ₹200.               |");
      System.out.println("|         Enter 7 for idlis(6 per plate) ₹100.                 |");
      System.out.println("|Enter 8 for dosas(2 per plate with two types of chutney) ₹200.|");
      System.out.println("|         Enter 9 for jalfrezas(1 bowl) ₹150.                  |");
      System.out.println("|         Enter 10 for paneer tikka(1 half plate) ₹100.        |");
      System.out.println("|______________________________________________________________|");
      System.out.println();
      System.out.print("Enter you choice: ");
      int choice = sc.nextInt();
      if (choice < 0 || choice > 10) {
        System.out.println("WRONG INPUT!(please enter the correct choice from the menu)");
        continue;
      }
      System.out.print("Enter the quantity(number of plates or bowl): ");
      quantity = sc.nextInt();
      if (quantity <= 0) {
        System.out.println("WRONG INPUT!(please enter the correct quantity)");
        continue;
      }
      veg_Maincourse_Bill += quantity * price[choice];
      System.out.print("Do you want to order more?\n'Y' for Yes.\n'N' for No.");

      char want_more = sc.next().charAt(0);
      want_more = Character.toLowerCase(want_more);

      if (want_more != 'y') {
        break;
      } else {
        continue;
      }
    }
    return veg_Maincourse_Bill;
  }

  @Override
  public double non_veg_Maincourse() {

    int quantity = 0;
    int[] price = { 170, 50, 160, 100, 180, 190, 200, 150, 160, 160, 300 };
    while (true) {
      System.out.println();
      System.out.println("********************* NON-VEG MAIN-COURSE **********************");
      System.out.println(" _______________________________________________________________");
      System.out.println("|          Enter 0 for Chicken tikka(1 half plate) ₹170.       |");
      System.out.println("|          Enter 1 for Chicken momos(6 per plate) ₹50.         |");
      System.out.println("|          EEnter 2 for Murg reshmi kabab(2 per plate) ₹160.   |");
      System.out.println("|          Enter 3 for Chicken seekh kabab(2 per plate) ₹100.  |");
      System.out.println("|          Enter 4 for Tangdi kabab(3 per plate) ₹180.         |");
      System.out.println("|          Enter 5 for Murg chilli kabab(2 per plate) ₹190.    |");
      System.out.println("|          Enter 6 for Murg tandoori (1 full plate) ₹200.      |");
      System.out.println("|          Enter 7 for Fish ajwani tikka(6 per plate) ₹150.    |");
      System.out.println("|          Enter 8 for Chilli chicken(1 full plate) ₹160.      |");
      System.out.println("|          Enter 9 for chicken biryani(1 full plate) ₹160.     |");
      System.out.println("|          Enter 10 Mutton biryani(1 full plate) ₹300.         |");
      System.out.println("|______________________________________________________________|");
      System.out.println();
      System.out.print("Enter you choice: ");
      int choice = sc.nextInt();
      if (choice < 0 || choice > 10) {
        System.out.println("WRONG INPUT!(please enter the correct choice from the menu)");
        continue;
      }
      System.out.print("Enter the quantity(number of plates or bowl): ");
      quantity = sc.nextInt();
      if (quantity <= 0) {
        System.out.println("WRONG INPUT!(please enter the correct quantity)");
        continue;
      }
      non_veg_Maincourse_Bill += quantity * price[choice];
      System.out.print("Do you want to order more?\n'Y' for Yes.\n'N' for No.");

      char want_more = sc.next().charAt(0);
      want_more = Character.toLowerCase(want_more);

      if (want_more != 'y') {
        break;
      } else {
        continue;
      }

    }
    return non_veg_Maincourse_Bill;
  }

  public double Starter() {
    double Starter_bill = 0;
    System.out.println();
    System.out.println("******* STARTER - CHOOSE THE TYPE *******");
    System.out.println("*****************************************");
    System.out.println("**************| (a) Veg     |************");
    System.out.println("**************| (b) Non Veg |************");
    System.out.println("*****************************************");
    System.out.println();
    System.out.print("Enter your choice: ");
    char choice = sc.next().charAt(0);
    choice = Character.toLowerCase(choice);

    switch (choice) {
      case 'a':
        Starter_bill = veg_Starter();
        break;
      case 'b':
        Starter_bill = non_veg_Satrter();
        break;
      default:
        System.out.println(" Invalid option-- Please enter anyone of the option from the menu");
        break;
    }
    return Starter_bill;
  }

  public double MainCourse() {
    double MainCourse_bill = 0;
    System.out.println();
    System.out.println("***** MAIN COURSE - CHOOSE THE TYPE *****");
    System.out.println("*****************************************");
    System.out.println("**************| (a) Veg     |************");
    System.out.println("**************| (b) Non Veg |************");
    System.out.println("*****************************************");
    System.out.println();
    System.out.print("Enter your choice: ");
    char choice = sc.next().charAt(0);
    choice = Character.toLowerCase(choice);

    switch (choice) {
      case 'a':
        MainCourse_bill = veg_Maincourese();
        break;
      case 'b':
        MainCourse_bill = non_veg_Maincourse();
        break;
      default:
        System.out.println(" Invalid option-- Please enter anyone of the option from the menu");
        break;
    }
    return MainCourse_bill;
  }

  public double Desserts() {
    double Desserts_bill = 0;
    System.out.println();
    System.out.println("******* Dessert - CHOOSE THE TYPE *******");
    // write the items here

    System.out.println();

    int quantity = 0;
    int[] price = {}; // write the price here
    while (true) {
      System.out.print("Enter you choice: ");
      int choice = sc.nextInt();
      if (choice < 0 || choice > 10) {
        System.out.println("WRONG INPUT!(please enter the correct choice from the menu)");
        continue;
      }
      System.out.print("Enter the quantity(number of plates or bowl): ");
      quantity = sc.nextInt();
      if (quantity <= 0) {
        System.out.println("WRONG INPUT!(please enter the correct quantity)");
        continue;
      }
      Desserts_bill += quantity * price[choice];
      System.out.print("Do you want to order more?\n'Y' for Yes.\n'N' for No.");

      char want_more = sc.next().charAt(0);
      want_more = Character.toLowerCase(want_more);

      if (want_more != 'y') {
        break;
      } else {
        continue;
      }
    }
    return Desserts_bill;
  }
}

public class Resturant_Billing_System {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Resturant rest = new Resturant();
    boolean cond = true;
    double x = 0, y = 0, z = 0;
    double total_bill = 0;

    while (cond) {
      System.out.println();
      System.out.println(" __________________________________");
      System.out.println("| Welcome to Culinary Kaleidoscope |");
      System.out.println("|             (a) Starter          |");
      System.out.println("|             (b) Main Course      |");
      System.out.println("|             (c) Desserts         |");
      System.out.println("|             (d) Exit             |");
      System.out.println("|__________________________________|");
      System.out.println();

      System.out.print("Enter your choice: ");
      char choice = sc.next().charAt(0);
      choice = Character.toLowerCase(choice);

      switch (choice) {
        case 'a':
          x = rest.Starter();
          break;
        case 'b':
          y = rest.MainCourse();
          break;
        case 'c':
          z = rest.Desserts();
          break;
        case 'd':
          total_bill = x + y + z;
          System.out.println();
          System.out.println(" __________________________________"); // adjust this part according to output
          System.out.println("* Welcome to Culinary Kaleidoscope *");
          System.out.println("        Starter Bill - Rs" + x);
          System.out.println("        Main Course Bill - Rs" + y);
          System.out.println("        Desserts Bill - Rs" + z);
          System.out.println("        Total Bill - Rs" + total_bill);
          System.out.println("*__________________________________*");
          System.out.println();
          System.out.println("Thanks for Visiting hope you will visit again");
          System.out.println("                THANK YOU ");
          cond = false;
          break;
        default:
          System.out.println(" Invalid option-- Please enter anyone of the option from the menu");
          break;
      }
    }
  }
}