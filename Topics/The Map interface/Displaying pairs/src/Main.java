import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        final int omega = 24;
        final int gamma = 3;
        map.put("Gamma",  gamma);
        map.put("Omega", omega);
        map.put("Alpha",  1);

        // write your code here
        for (var entry: map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}