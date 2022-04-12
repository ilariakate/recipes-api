import java.util.Arrays;

class Starter {

    public static void startRunnables(Runnable[] runnables) {
        // implement the method
        Arrays.stream(runnables).forEach(runnable -> {
            Thread t = new Thread(runnable);
            t.start();
        });
    }
}