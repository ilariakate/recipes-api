import java.util.Scanner;

class NumbersFilter extends Thread {

    /* use it to read numbers from the standard input */
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        // implement this method
        int num = 0;
        do {
            String numStr = scanner.nextLine();
            num = Integer.parseInt(numStr);
            if (num != 0 && num % 2 == 0) {
                System.out.println(num);
            }
        } while (num != 0);
    }
}