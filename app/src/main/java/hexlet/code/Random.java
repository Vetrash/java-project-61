package hexlet.code;

public class Random {

    public static int getInRange(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
