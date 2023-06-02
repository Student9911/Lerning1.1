package LR13;

public class example3 {

    private static final Object lock = new Object();
    private static int number = 1;

    public static void main(String[] args) {

        Thread evenThread = new Thread(() -> {
            synchronized (lock) {
                while (number < 10) {
                    if (number % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number ++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } lock.notifyAll();
                }
            }
        });
        Thread odtThread = new Thread(() -> {
            synchronized (lock) {
                while (number < 10) {
                    if (number % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number ++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } lock.notifyAll();
                }
            }
        });
        evenThread.setName("Even Thread");
        odtThread.setName("Odt Thread");

        evenThread.start();
        odtThread.start();
    }
}
