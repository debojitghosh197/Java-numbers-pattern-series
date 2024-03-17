import java.util.Scanner;

/**
 * Rectangle
 */
public class Rectangle {
    int m;
    int n;
    double area, perimeter, diagonal;

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        m = sc.nextInt();

        System.out.println("Enter breadth");
        n = sc.nextInt();

    }

    public void calculate() {
        area = m * n;
        perimeter = 2 * (m + n);
        diagonal = Math.sqrt(Math.pow(m, 2) + Math.pow(n, 2));
    }

    public void dispaly() {
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.input();
        rect.calculate();
        rect.dispaly();
    }
}