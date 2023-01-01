package LR6.Example5;

import java.util.Scanner;

public class Example5_Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n для вычисления");
        int n = in.nextInt();
        if (n > 0) {
            Example5.sqrt(n);
            System.out.println("Сумма квадратов натуральных чисел аргумента " +
                    " " + n + " = " + (Example5.result));
            System.out.println("проверка n*(n+1)*(2*n+1)/6) = " + (n*(n+1)*(2*n+1)/6));

        } else {
            System.out.println("Введите число больше 0");
        }

    }
}
