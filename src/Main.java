public class Main {
    public static void main(String[] args) {
        int number;
        number = incrementOne(1);
        System.out.println(number);
    }

    public static int incrementOne(int i) {
        return i++;
    }
}
