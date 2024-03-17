public class Letter_triangle_pattern {
    public static void main(String[] args) {
        /*A B C D E F
         *A B C D E
         *A B C D
         *A B C
         *A B
         *A 
         */
        char ch = 'A';
        for (int i = 6; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
            ch = 'A';
        }
    }
}
