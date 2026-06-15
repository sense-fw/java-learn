import java.util.ArrayList;
import java.util.Collections;
public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Сделать Java практику");
        tasks.add("Написать сюжет");
        tasks.add("Начать писать игровые механики");

        System.out.println("Все задачи:");
        for (String task : tasks) {
            System.out.println(task);
        }

        tasks.remove(1);

        System.out.println("\nПосле удаления второй задачи список выглядит так:");
        for (String task : tasks) {
            System.out.println(task);
        }

        String target = "Ваша задача";
        System.out.println("\nЕсть ли задача \"" + target + "\": " + tasks.contains(target));

        Collections.sort(tasks);
        System.out.println("\nПосле применения сортировки:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
