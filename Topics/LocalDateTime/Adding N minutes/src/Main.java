import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int noOfMinutes = scanner.nextInt();

        LocalDateTime dateTime = LocalDateTime.parse(input);
        LocalDateTime dateTime1 = dateTime.plusMinutes(noOfMinutes);

        int year = dateTime1.getYear();
        int days = dateTime1.getDayOfYear();
        LocalTime time = dateTime1.toLocalTime();

        String yearString = String.valueOf(year);
        String daysString = String.valueOf(days);
        String timeString = String.valueOf(time);

        System.out.println(yearString + " " + daysString + " " + timeString);

    }
}