package LR9.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
В программе, вычисляющей среднее значение среди положительных элементов одномерного массива (тип элементов int),
вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
– ввод строки вместо числа;
– несоответствие числового типа данных;
– положительные элементы отсутствуют.
*/
public class example_2_1{

    public static void main(String[] args) {
        try {
            positivAvg();
        } catch (NullPointerException e) {
            System.out.println("Отсутствуют положительные элементы");
        } catch (InputMismatchException e) {
            System.out.println("– несоответствие числового типа данных");
        }

    }
    private static final int[] ints = new int[5];

    private static void positivAvg () throws NullPointerException {
        int a = 0;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("введите 5 чисел для вычисления\n");
        for (int i = 0; i < ints.length; i ++) {
            ints[i] = in.nextInt();
        }
        for (int anInt : ints) {
            if (anInt >= 0) {
                a += anInt;
                count++;
            }


        }
        if (count == 0) {
            throw new NullPointerException();
        }
        System.out.println("среднее значение положительных элементов [" + a / count + "]");

    }
}
