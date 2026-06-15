public class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("\nНазвание: " + title + "\nАвтор: " + author + "\nГод написания: " + year);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Первая книга", "Автор 1", 2011);
        Book b2 = new Book("Вторая книга", "Автор 2", 2021);

        System.out.println("\nИспользуем простой метод для вывода.");
        b1.displayInfo();
        b2.displayInfo();

        System.out.println("\nИспользуем геттеры для получения информации.");
        System.out.println("Получили название: " + b1.getTitle() + "\nПолучили имя автора: " + b1.getAuthor() + "\nПолучили год написания: " + b1.getYear());

        System.out.println("\nУстановим сеттеры и выведем новую информацию о книге.");
        b1.setTitle("Очень интересная книга");
        b1.setAuthor("Неназванный автор");
        b1.setYear(2026);
        b1.displayInfo();
    }
}