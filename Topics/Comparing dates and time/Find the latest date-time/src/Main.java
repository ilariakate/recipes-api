import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<LocalDateTime> localDateTimeList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine());
            localDateTimeList.add(dateTime);
        }
        Optional<LocalDateTime> maxDateTimeOptional = localDateTimeList.stream().max(LocalDateTime::compareTo);
        maxDateTimeOptional.ifPresent(dateTime -> System.out.println(dateTime));
    }
}