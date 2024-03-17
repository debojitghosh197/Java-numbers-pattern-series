public class calendr_2022 {
    public static void main(String[] args) {
        String[] mm = { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER",
                "OCTOBER", "NOVEMBER", "DECEMBER" };
        String[] dw = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
        int[] md = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int d, CTR = 0, y = 0, O = 0;
        for (int x = 0; x <= 11; x++) {
            System.out.println();
            System.out.println();
            System.out.println(mm[y] + ":-");
            for (int i = 0; i <= 6; i++) {
                System.out.print(dw[i] + " ");
            }
            System.out.println();
            if (O != 0 && O != 7) {
                for (int j = 1; j <= O; j++) {
                    System.out.print("    ");
                }
            }
            O *= 0;
            for (d = 1; d <= md[y]; d++) {
                System.out.print(d);
                if (d <= 9) {
                    System.out.print("   ");
                }
                if (d > 9) {
                    System.out.print("  ");
                }
                CTR++;
                if (CTR == 7) {
                    System.out.println();
                    CTR *= 0;
                }
                O = CTR;
            }
            y++;
        }
    }
}