import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Результат деления: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не число");

        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");

        } finally {
            System.out.println("Программа завершена");
            scanner.close();
        }
    }
}
