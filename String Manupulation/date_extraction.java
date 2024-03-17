import java.util.Scanner;

public class date_extraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the date: ");
        String dateString = sc.nextLine();
        sc.close();
        String[] dateParts = dateString.split("-");

        if (dateParts.length == 3) {
            int day = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int year = Integer.parseInt(dateParts[2]);

            String[] monthNames = {
                    "January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December"
            };

            if (month >= 1 && month <= 12) {

                String extractedMonth = monthNames[month - 1];
                System.out.println("Month: " + extractedMonth);
                System.out.println();
                System.out.println("Formated date: " + day + " " + extractedMonth + " " + year);
            } else {
                System.err.println("Invalid month value");
            }
        } else {
            System.err.println("Invalid date format");
        }
    }
}
