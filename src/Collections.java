import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;
public class Collections {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add("Дарья");
        students.add("Иван");
        students.add("Виталий");
        students.add("Иван");
        students.add("Анна");

        System.out.println("Список студентов (List): ");
        System.out.println(students);

        Set<String> uniqueStudents = new HashSet<>(students);
        System.out.println("\nСписок студентов (Set):");
        System.out.println(uniqueStudents);

        Map<String, Integer> grades = new HashMap<>();
        grades.put("Дарья", 90);
        grades.put("Иван", 75);
        grades.put("Виталий", 88);
        grades.put("Анна", 95);
        System.out.println("\nОценки (Map):");
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
