import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>(List.of(scanner.nextLine()));
        String input = scanner.nextLine();

        System.out.println(Collections.frequency(stringList, input));

    }
}