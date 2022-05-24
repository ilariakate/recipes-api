import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LocalDateTime dateTime = LocalDateTime.parse(input);

        int hoursToSub = scanner.nextInt();
        int minutesToAdd = scanner.nextInt();
        LocalDateTime subHours = dateTime.minusHours(hoursToSub);
        LocalDateTime addedMin = subHours.plusMinutes(minutesToAdd);

        System.out.println(addedMin);

    }
}