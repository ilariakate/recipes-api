import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.nextLine();
        int num = scanner.nextInt();
        LocalDate date = LocalDate.parse(inputDate);

        for (int i = 0; i < num; i++) {

        }

        System.out.println(date);
        System.out.println(date.plusDays(num));
        System.out.println(date.plusDays(8));
        System.out.println(date.plusDays(12));
    }
}