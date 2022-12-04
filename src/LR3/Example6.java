package LR3;

import java.util.Scanner;

public class Example6 {

    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ints = new int[n + 1];
        if (n >= 0) {
            int g = 0;
            int i = 0;

            while (i < ints.length - 1) {
                g++;
                if (g % 5 == 2) {
                    i ++;
                    ints[i] = g;
                    System.out.println(ints[i]);

                }
            }

        } else System.out.println("размер массива не может быть нулевым или отрицательным");
    }
}

// Напишите программу, в которой создается одномерный числовой массив и заполняется числами
// которые при делении на 5 дают в остатке 2 (числа 2, 7,12,17 и так далее). Размер массива
// вводится пользователем. Предусмотреть обработку ошибки, связанной с вводом некорректного значения.
