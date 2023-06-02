package LR13;

import java.util.Random;
//В данной программе заполняем массив случайнми целыми числами и запускаем несколько потоков
// для суммирования элементов в массиве. Количество потоков определяется количеством ядер процессора,
// которое можно получить с помощью метода `Runtime.getRuntime().availableProcessors()`.
// Массив данных разбивается на части, каждая из которых обрабатывается отдельным потоком.
// Каждый поток запускается с помощью класса `SumTask`, который реализует интерфейс `Runnable` и
// переопределяет метод `run()`, в котором находится сумма элементов в своей части массива.
// После завершения работы всех потоков находится сумма элементов из всех частей массива.

public class example6 {

    public static void main(String[] args) {
        int n = 10000000;
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("у процессора ядер: " + processors);
        int size = n / processors;
        System.out.println("количество элементов для суммирования на каждое ядро: " + size
        + " из: " + n);
        SumTask[] tasks = new SumTask[processors];
        Thread[] threads = new Thread[processors];
        for (int i = 0; i < processors; i++) {
            tasks[i] = new SumTask(arr, i * size, (i + 1) * size);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }
        int sum = 0;
        for (int i = 0; i < processors; i++) {
            try {
                threads[i].join();
                sum += tasks[i].getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Сумма всех элементов в массиве " + sum);
    }
}

class SumTask implements Runnable {
    private int[] arr;
    private int start;
    private int end;
    private int sum;

    public SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
    }

    public int getSum() {
        return sum;
    }
}
