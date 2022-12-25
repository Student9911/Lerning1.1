package LR5.Example6;

import java.util.Random;

public class Main6 {

    public static void main(String[] args) {
        //задаем аргументом случайные, не случайные числа
        Random random = new Random();
        //конструктор с 2-мя аргументами
        Example6 test1 = new Example6(random.nextInt(50), random.nextInt(50));
        test1.result();
        //конструктор с 1-м аргументом
        test1 = new Example6(random.nextInt(50));
        test1.result();
        //метод с 1-м аргументом
        test1.volume(random.nextInt(50));
        System.out.println("Метод с 1-м аргументом");
        test1.result();
        //метод с 2-мя аргументами
        test1.volume(random.nextInt(50), random.nextInt(50));
        test1.result();


    }
}
