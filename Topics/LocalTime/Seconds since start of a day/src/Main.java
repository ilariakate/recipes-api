
import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long noOfSec = scanner.nextInt();
        LocalTime time = LocalTime.ofSecondOfDay(noOfSec);
        System.out.println(time);
    }
}