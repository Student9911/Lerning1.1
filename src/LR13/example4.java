package LR13;

// запускаем 10 потоков, каждый из которых создается с помощью класса `MyRunnable`.
// Класс `MyRunnable` реализует интерфейс `Runnable` и переопределяет метод `run()`,
// который выводит на экран номер потока.

public class example4 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new MyRunnable(i));
            thread.start();
        }
    }
}

class MyRunnable implements Runnable {
    private int number;

    public MyRunnable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Thread " + number);
    }
}
