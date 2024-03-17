import java.util.Scanner;

/**
 * Library
 */
public class Library {
    int acc_num;
    String title;
    int days;
    double charge = 0d;
    Scanner sc = new Scanner(System.in);

    public void input(){
        System.out.print("Enter the accesion number: ");
        acc_num = sc.nextInt();
        System.out.print("Enter the title of the book and name of the author: ");
        sc.nextLine();
        title = sc.nextLine();
        
    }

    public void compute(){
        System.out.print("Enter the number of days late: ");
        days = sc.nextInt();

        for (int i = 1; i <= days; i++) {
            charge +=i*2;
        }
        System.out.println("Late charge: "+charge);
    }

    public void display(){
        System.out.println("Library name - Local library");
        System.out.println("Accession number - "+acc_num);
        System.out.println("Title of the book - "+title);
        System.out.println("Days late - "+days);
        System.out.println("Late fee charge - Rs "+charge);
    }

    public static void main(String[] args) {
        Library l = new Library();
        l.input();
        l.compute();
        l.display();
        
    }
}