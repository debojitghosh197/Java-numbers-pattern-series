public class FibonacciSeries {
    public static void main(String[] args) {
        int count = 10; // Number of Fibonacci numbers to generate
        generateFibonacciSeries(count);
    }

    public static void generateFibonacciSeries(int count) {
        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series (" + count + " numbers): ");

        for (int i = 0; i < count; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
