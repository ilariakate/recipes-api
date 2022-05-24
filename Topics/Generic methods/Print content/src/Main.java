// do not remove imports
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    // define info method here
    public static <T> String info(T[] tArr) {
        String repr = "[";
        for (T t : tArr) {
            repr += t;
            repr += ", ";
        }
        repr = repr.length() > 1 ? repr.substring(0, repr.length() - 2) : repr;
        repr += "]";
        return repr;
    }


}