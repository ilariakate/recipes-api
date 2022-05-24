import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int daysToAdd = scanner.nextInt();
        int hoursToSub = scanner.nextInt();

        LocalDateTime dateTime = LocalDateTime.parse(input);
        LocalDateTime addDays = dateTime.plusDays(daysToAdd);
        LocalDateTime minusHours = addDays.minusHours(hoursToSub);

        System.out.println(minusHours);
    }
}