import java.util.HashMap;
import java.util.Map;
public class HashTables {
    public static void main(String[] args) {

        HashMap<String, Integer> journal = new HashMap<>();
        journal.put("Дарья", 90);
        journal.put("Иван", 75);
        journal.put("Виталий", 88);
        journal.put("Анна", 93);
        journal.put("Евгений", 60);

        System.out.println("Оценка Ивана: " + journal.get("Иван"));

        String target = "Иван";
        System.out.println("Наличие студента " + target + " в списке: " + journal.containsKey(target));

        journal.remove("Евгений");

        System.out.println("\nЖурнал после удаления:");
        for (Map.Entry<String, Integer> entry : journal.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
