import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class AnalizeBDay {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1995, 3, 15);
        Period age = Period.between(birthDate, today);
        LocalDate nextBirthday = birthDate.withYear(today.getYear());

        if (nextBirthday.isBefore(today) || nextBirthday.equals(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        long daysUntilBirthday = ChronoUnit.DAYS.between(today, nextBirthday);

        System.out.println("Сегодня: " + today.format(formatter));
        System.out.println("Дата рождения: " + birthDate.format(formatter));
        System.out.println("Возраст: " + age.getYears() + " лет");
        System.out.println("Дней до дня рождения: " + daysUntilBirthday);
    }
}
