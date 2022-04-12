import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine().toLowerCase(Locale.ROOT);
        String str2 = scanner.nextLine().toLowerCase(Locale.ROOT);


        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        char[] cArr1 = str1.toCharArray();
        char[] cArr2 = str2.toCharArray();

        for (char c : cArr1) {
            if (hashMap1.get(c) == null) {
                hashMap1.put(c, 1);
            } else {
                Integer a = (int) hashMap1.get(c);
                hashMap1.put(c, ++a);
            }
        }

        for (char c : cArr2) {
            if (hashMap2.get(c) == null) {
                hashMap2.put(c, 1);
            } else {
                Integer b = (int) hashMap2.get(c);
                hashMap2.put(c, ++b);
            }
        }

        if (hashMap1.equals(hashMap2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}