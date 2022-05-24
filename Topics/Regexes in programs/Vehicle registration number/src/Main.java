import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regNum = scanner.nextLine(); // a valid or invalid registration number
        String num = "[ABEKMHOPCTYX][0-9][0-9][0-9][ABEKMHOPCTYX][ABEKMHOPCTYX]";
        /* write your code here */
        System.out.println(regNum.matches(num) ? true : false);


    }
}