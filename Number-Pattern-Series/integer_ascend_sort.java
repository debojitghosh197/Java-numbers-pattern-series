import java.util.Scanner;

public class integer_ascend_sort {
    // method to print array in a sorted way
    public static void displaySortArr(int[] array) {
        System.out.print("Numbers in asending order: ");
        for (int x = 0; x < array.length; x++) {
            if (array[x] != 0) {
                System.out.print(array[x] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int ctr = 1; // counter variable for input
        int inpVal = 1; // input value used for checking
        int tempVal; // temporary variable fro swaping
        int[] unSortArr = new int[100]; // assuming length of array is 100
        Scanner sc = new Scanner(System.in);

        // while loop for taking input from user
        while (inpVal != 0) {
            ctr++;
            inpVal = sc.nextInt();
            unSortArr[ctr - 1] = inpVal;
        }

        // for loop for sorting the elements in array
        for (int i = 0; i < unSortArr.length; i++) {
            for (int j = 0; j < unSortArr.length - 1; j++) {
                if (unSortArr[j] >= unSortArr[j + 1]) {
                    // swaping the heaviest/greatest element in the last
                    tempVal = unSortArr[j + 1];
                    unSortArr[j + 1] = unSortArr[j];
                    unSortArr[j] = tempVal;
                }
            }
        }
        displaySortArr(unSortArr);
        sc.close();
    }
}
