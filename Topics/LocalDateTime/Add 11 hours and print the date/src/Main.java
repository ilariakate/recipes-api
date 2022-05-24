import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LocalDateTime dateTime = LocalDateTime.parse(input);
        final int hoursToAdd = 11;
        LocalDateTime addedHoursDate = dateTime.plusHours(hoursToAdd);
        LocalDate onlyDate = addedHoursDate.toLocalDate();
        System.out.println(onlyDate);
    }
}