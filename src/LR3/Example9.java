package LR3;

import java.util.Scanner;

public class Example9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа");
        int a = in.nextInt();
        int b = in.nextInt();
        int c;
        int d;
        int g;
        int y;


        if (a > b) {
            c = a - b + 1;
            d = b;
            g = a;
            System.out.println("Программа выведет все целые числа в диапазоне\nот " + b + " до " + a);

        } else {
            c = b - a + 1;
            d = a;
            g = b;
            System.out.println("Программа выведет все целые числа в диапазоне\n от " + a + " до " + b);
        }
        int[] ints = new int[c];
        System.out.println("Можно это сделать с помощью массива и оператора цикла for ");
        for (int i = 0; i < ints.length; i ++) {
            ints[i] = d + i;
            System.out.println("["+ i + "]" + ints[i]);
        }
        y = d;
        System.out.println("А можно просто выводить корректные числа в консоль не записывая их никуда\nиспользуя оператор цикла while");
        while (y != g) {
            y = d ++;
            System.out.print(y + ", ");
        }
    }
}
// Напишите программу, в которой пользователем вводится два целых числа.
// Программа выводит все целые числа — начиная с наименьшего (из двух введенных чисел)
// и заканчивая наибольшим (из двух введенных чисел). Предложите разные версии программы
// (с использованием разных операторов цикла).


