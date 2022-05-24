import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime date1 = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime date2 = LocalDateTime.parse(scanner.nextLine());

        LocalDateTime startDate = date1.isBefore(date2) ? date1 : date2;
        LocalDateTime endDate = date1.isBefore(date2) ? date2 : date1;

        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine());
            if ((dateTime.isAfter(startDate) || dateTime.equals(startDate)) && dateTime.isBefore(endDate)) {
                count++;
            }
        }
        System.out.println(count);
    }
}