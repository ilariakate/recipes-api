import java.util.*;

class MapUtils {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        // write your code here
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        for (String s : strings) {
            if (sortedMap.containsKey(s)) {
                sortedMap.put(s, sortedMap.get(s) + 1);
            } else {
                sortedMap.put(s, 1);
            }
        }
        return sortedMap;
    }

    public static void printMap(Map<String, Integer> map) {
        // write your code here
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        MapUtils.printMap(MapUtils.wordCount(words));
    }
}