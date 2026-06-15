public class Multithreading {
    public static void main(String[] args) {

        Thread numberThread = new Thread(new NumberTask());
        Thread letterThread = new Thread(new LetterTask());

        numberThread.start();
        letterThread.start();
    }
}
class NumberTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Поток чисел прерван");
            }
        }
    }
}
class LetterTask implements Runnable {
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println(c);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println("Поток букв прерван");
            }
        }
    }
}

// Вывод программы:
//1
//A
//2
//B
//3
//C
//4
//5
//D
//E
