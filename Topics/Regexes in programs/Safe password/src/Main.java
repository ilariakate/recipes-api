import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String password = scanner.nextLine();
        String regPass = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{12,}$";

        System.out.println(password.matches(regPass) ? "YES" : "NO");
    }
}