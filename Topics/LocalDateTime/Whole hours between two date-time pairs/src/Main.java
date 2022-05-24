import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        LocalDateTime dateTime1 = LocalDateTime.parse(input1);
        LocalDateTime dateTime2 = LocalDateTime.parse(input2);

        long hoursDifference = dateTime1.until(dateTime2, ChronoUnit.HOURS);
        System.out.println(hoursDifference);
    }
}