
import java.util.Scanner;

class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in); // use it to read string from the standard input

    @Override
    public void run() {
        // implement this method
        String input = scanner.nextLine();
        while (atLeastOneLowerCase(input)) {
            System.out.println(input.toUpperCase());
            input = scanner.nextLine();
        }
        System.out.println("FINISHED");
    }

    private boolean atLeastOneLowerCase(String input) {
        for (char c : input.toCharArray()) {
            if (c > 'a' && c < 'z') {
                return true;
            }
        }
        return false;
    }
}