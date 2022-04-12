import java.util.*;


class MapFunctions {

    public static void printWithSameLetter(Map<String, String> map) {
        // write your code here
        for (String k : map.keySet()) {
            String firstLetterK = k.substring(1);
            String firstLetterV = map.get(k.substring(1));

            if (firstLetterK.equals(firstLetterV)) {
                System.out.println(k + " " + map.get(k));
            }
        }
        

    }
}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] pair = s.split(" ");
            map.put(pair[0], pair[1]);
        }

        MapFunctions.printWithSameLetter(map);
    }
}