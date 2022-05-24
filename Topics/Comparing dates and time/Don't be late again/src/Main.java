import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        final LocalTime fixedTime = LocalTime.parse("20:00");
        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            LocalTime time = LocalTime.parse(scanner.next());
            if (time.isAfter(fixedTime)) {
                System.out.println(input);
            }

        }

    }
}