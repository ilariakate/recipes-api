import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LocalDateTime inputDateTime = LocalDateTime.parse(input);
        int year = inputDateTime.getYear();
        LocalDateTime beginning = LocalDateTime.of(year, 1, 1, 0, 0);
        long difference = beginning.until(inputDateTime, ChronoUnit.HOURS);
        System.out.println(difference);

    }
}