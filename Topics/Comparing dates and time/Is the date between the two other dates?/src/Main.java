import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputX = scanner.next();
        String inputM = scanner.next();
        String inputN = scanner.next();

        LocalDate dateX = LocalDate.parse(inputX);
        LocalDate dateM = LocalDate.parse(inputM);
        LocalDate dateN = LocalDate.parse(inputN);

        if (dateM.isBefore(dateX) && dateN.isAfter(dateX) ||
                dateM.isAfter(dateX) && dateN.isBefore(dateX)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}