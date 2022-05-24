// do not remove imports

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    // define invert method here
    public static <T> T[] invert(T[] tArr) {
        int start = 0;
        int end = tArr.length - 1;
        while (start < end) {
            T temp = tArr[end];
            tArr[end] = tArr[start];
            tArr[start] = temp;
            start++;
            end--;
        }
        return tArr;
    }
}