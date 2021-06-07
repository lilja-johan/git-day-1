public class Main {
    public static void main(String[] args) {
        int number;
        number = incrementOne(0);
        System.out.println(number);

        number = decrementOne(number);
        System.out.println(number);
    }

    public static int incrementOne(int i) {
        return i + 1;
    }
    public static float multiplyInts (int i, int j) {
        return (float) i * j;
    }

    public static int decrementOne(int i) {
        return i - 1;
    }
}
