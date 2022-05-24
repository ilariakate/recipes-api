import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int days = scanner.nextInt();
        LocalDate date = LocalDate.ofYearDay(year, days);
        System.out.println(date);
    }
}