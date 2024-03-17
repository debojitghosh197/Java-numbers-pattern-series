public class Head_Tail {
    public static void main(String[] args) {
        int ctr = 0, ctr2 = 0, i = 1;
        while (i != 20) {
            int n = (int) (Math.random() * 2);
            if (n == 1) {
                ctr++;
            } else {
                ctr2++;
            }
            i++;
        }
        System.out.println("Number of head: " + ctr);
        System.out.println("Number of tail: " + ctr2);
    }
}
