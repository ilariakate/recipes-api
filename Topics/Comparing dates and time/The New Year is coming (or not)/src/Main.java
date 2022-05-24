import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.next();
        int n = scanner.nextInt();

        LocalDate date = LocalDate.parse(inputDate);
        int year = date.getYear();
        LocalDate addedDay = date.plusDays(n);
        int yearAdded = addedDay.getYear();
        if (yearAdded > year) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}