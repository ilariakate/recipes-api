import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        final TreeMap<String, Integer> map = new TreeMap<>();
        final int omega = 24;
        final int gamma = 3;
        map.put("Omega", omega);
        map.put("Alpha", 1);
        map.put("Gamma", gamma);

        System.out.println(map);
    }
}