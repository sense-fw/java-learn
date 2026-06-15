import java.util.Random;
public class Practice15_16Arrays {
    public static void main(String[] args) {

        Random random = new Random();

        // Одномерный массив
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.print("Вывод одномерного массива: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nМинимум: " + min);
        System.out.println("Максимум: " + max);


        // Двумерный массив
        int size = 5;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println("\nВывод двумерного массива:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
