import java.util.Scanner;

public class students_stream_select {
    static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        System.out.print("Enter the marks: ");
        int mrks = sc.nextInt();
        print(name, age, mrks);
        sc.close();
    }

    static String allocation(int mks) {
        String strm;
        if (mks >= 300) {
            strm = "Science and Computer";
        } else if (mks >= 200 && mks < 300) {
            strm = "Commerce and Computer";
        } else if (mks >= 75 && mks < 200) {
            strm = "Arts and Animation";
        } else {
            strm = "Try Again";
        }
        return strm;
    }

    static void print(String x, int y, int z) {
        System.out.println();
        System.out.println("Name: " + x);
        System.out.println("Age: " + y);
        System.out.println("Marks: " + z);
        System.out.println("Stream: " + allocation(z));
    }

    public static void main(String[] args) {
        accept();
    }
}
