package LR13;

import java.util.Random;
// В данной программе заполняем массив случайнми целыми числами и запускаем несколько потоков
// для поиска максимального элемента в массиве. Количество потоков определяется количеством ядер процессора,
// которое можно получить с помощью метода `Runtime.getRuntime().availableProcessors()`.
// Массив данных разбивается на части, каждая из которых обрабатывается отдельным потоком.
// Каждый поток запускается с помощью класса `FindMaxTask`, который реализует интерфейс `Runnable`
// и переопределяет метод `run()`, в котором находится максимальный элемент в своей части массива.
// После завершения работы всех потоков находится максимальный элемент из всех частей массива.

public class example5 {

    public static void main(String[] args) {
        int n = 10000000;
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(1000);
        }
        int processors = Runtime.getRuntime().availableProcessors();
        int size = n / processors;
        FindMaxTask[] tasks = new FindMaxTask[processors];
        Thread[] threads = new Thread[processors];
        for (int i = 0; i < processors; i++) {
            tasks[i] = new FindMaxTask(arr, i * size, (i + 1) * size);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < processors; i++) {
            try {
                threads[i].join();
                if (tasks[i].getMax() > max) {
                    max = tasks[i].getMax();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Max element is " + max);
    }
}

class FindMaxTask implements Runnable {
    private int[] arr;
    private int start;
    private int end;
    private int max;

    public FindMaxTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.max = Integer.MIN_VALUE;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    }

    public int getMax() {
        return max;
    }
}
