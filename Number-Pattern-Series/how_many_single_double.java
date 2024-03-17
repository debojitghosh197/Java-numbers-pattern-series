import java.util.*;

public class how_many_single_double {
    public static void main(String[] args) {
        int x = 0, ctr = 0, ctr1 = 0, z = 0;
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
            while (nums[i] != 0) {
                x = nums[i] % 10;
                nums[i] = nums[i] / 10;
                ctr++;
                if (ctr == 2) {
                    z++;

                }
            }
            ctr *= 0;
        }
        ctr1 = 10 - z;
        System.out.println("No.of 1-digits present in the series are: " + ctr1);
        System.out.println("No.of 2-digits present in the series are: " + z);
        sc.close();
    }
}
