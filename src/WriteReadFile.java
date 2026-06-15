import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
public class WriteReadFile {
    public static void main(String[] args) {

        List<String> students = Arrays.asList(
                "Дарья",
                "Иван",
                "Вероника",
                "Евгений",
                "Илья"
        );

        String fileName = "students.txt";

        // Запись в файл
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String student : students) {
                writer.write(student + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        // Чтение из файла
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));

            System.out.println("Список студентов из файла:");
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
