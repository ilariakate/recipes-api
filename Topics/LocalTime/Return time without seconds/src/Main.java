import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        String withSec = scanner.nextLine();
        LocalTime sec = LocalTime.parse(withSec);

        String timeString = sec.format(formatter);

        System.out.println(timeString);



    }
}