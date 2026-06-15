public class Arrays {
    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 42, 18};

        // Вывод элементов
        System.out.println("Элементы массива:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Сумма элементов
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма равна: " + sum);

        // Ищем максимум среди чисел массива
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимум: " + max);

        // Проверяем наличие числа 42
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 42) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Число 42 есть в массиве");
        } else {
            System.out.println("Числа 42 нет в массиве");
        }
    }
}
