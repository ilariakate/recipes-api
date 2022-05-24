import java.util.Locale;

class Seven {
    public static SeptenaryStringFunction fun = s ->
            String.join("", s).toUpperCase(Locale.ROOT); //write your code here
}

@FunctionalInterface
interface SeptenaryStringFunction {
    String apply(String... s);
}