import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputTime1 = scanner.next();
        String inputTime2 = scanner.next();
        String inputTime3 = scanner.next();
        String inputTime4 = scanner.next();

        LocalTime time1 = LocalTime.parse(inputTime1);
        LocalTime time2 = LocalTime.parse(inputTime2);
        LocalTime time3 = LocalTime.parse(inputTime3);
        LocalTime time4 = LocalTime.parse(inputTime4);

        if (time1.isBefore(time3) && time2.isBefore(time3)
                || time1.isAfter(time4) && time2.isAfter(time4)) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}