import java.util.*;

class BankCard {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String numbers = scn.nextLine();
        String card = numbers.replaceAll("\\s", "");
        String visaRegex = "^4\\d{15}$"; // put your code here
        String masterCardRegex = "^5[1-5][0-9]{14}" +
                "|^(222[1-9]|22[3-9]\\d" +
                "|2[3-6]\\d{2}|27[0-1]\\d|" +
                "2720)[0-9]{12}$"; // put your code here
        String americanExpressRegex = "^3[4|7]\\d{13}$"; // put your code here

        if (card.matches(visaRegex)) {
            System.out.println("Visa");
        } else if (card.matches(masterCardRegex)) {
            System.out.println("MasterCard");
        } else if (card.matches(americanExpressRegex)) {
            System.out.println("AmericanExpress");
        } else {
            System.out.println("Card number does not exist");
        }
    }
}