import java.util.*;


class MapFunctions {

    public static void putThreeCountries(Map<String, String> map) {
        // write your code here
        map.put("India", "Delhi");
        map.put("Sri lanka", "Colombo");
        map.put("Australia", "Canberra");

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

        MapFunctions.putThreeCountries(map);

        System.out.println(map.size());
    }
}