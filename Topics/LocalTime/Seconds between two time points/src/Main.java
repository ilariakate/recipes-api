import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        String input1 = scanner.nextLine();
        LocalTime time1 = LocalTime.parse(input1);
        String input2 = scanner.nextLine();
        LocalTime time2 = LocalTime.parse(input2);
        int first = time1.toSecondOfDay();
        int second = time2.toSecondOfDay();

        if (first > second) {
            System.out.println(first - second);
        } else {
            System.out.println(second - first);
        }


    }
}