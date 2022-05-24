import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LocalTime inputTime = LocalTime.parse(input);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        LocalTime output = inputTime.minusHours(hours);
        LocalTime outputFinal = output.minusMinutes(minutes);

        System.out.println(outputFinal);


    }
}