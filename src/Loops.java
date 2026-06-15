import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {

        // 1. Цикл for
        System.out.println("Выведем числа от 1 до 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 2. Цикл while
        int sum = 0;
        int number = 1;
        while (number <= 100) {
            sum += number;
            number++;
        }
        System.out.println("Сумма чисел от 1 до 100 равна: " + sum);
        System.out.println();

        // 3. Цикл do-while
        Scanner scanner = new Scanner(System.in);
        String password;
        do {
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
            if (!password.equals("java123")) {
                System.out.println("Неверный пароль. Попробуйте снова.");
            }
        } while (!password.equals("java123"));
        System.out.println("Доступ разрешён!");
        scanner.close();
    }
}
