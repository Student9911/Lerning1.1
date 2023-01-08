package LR5.Example1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        Example1 test = new Example1();
        test.Set((char) random.nextInt(65, 80));

        int a = test.getCodeSymbol();

        test.viewCode();
    }
}

        //1 Напишите программу с классом, в котором есть закрытое
        // символьное поле и три открытых метода. Один из методов
        // позволяет присвоить значение полю. Еще один метод при вызове
        // возвращает результатом код символа. Третий метод позволяет вывести
        // в консольное окно символ (значение поля) и его код.
