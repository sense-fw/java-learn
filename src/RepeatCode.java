public class RepeatCode {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {

        printMessage("Работа с методами:");

        System.out.println(sum(2, 3));
        System.out.println(sum(2, 3, 4));

        System.out.println(isEven(10));
        System.out.println(isEven(7));
    }
}
