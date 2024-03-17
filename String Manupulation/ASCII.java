public class ASCII {
    public static void main(String[] args) {
        char ch;
        for (int i = 0; i <= 122; i++) {
            ch = (char) i;
            // print all character upto 122
            System.out.println(i + " - " + ch);

            // print only numbers & cap-letters & small-letters
            /*
             * if ((i >= 48 && i <= 57) || (i >= 65 && i <= 90) || (i >= 97 && i <= 122)) {
             * ch = (char) i;
             * System.out.println(i + " - " + ch);
             * }
             */
        }
    }
}