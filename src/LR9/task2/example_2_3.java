package LR9.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example_2_3 {
    /*В программе, вычисляющей сумму элементов типа byte одномерного массива,
вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
– ввод строки вместо числа;
– ввод или вычисление значения за границами диапазона типа.*/

    public static void main(String[] args) {
        boolean a;
        do { try {
            a = false;
            SetArray();
        } catch (InputMismatchException e) {
            System.out.println("""
                    –\tввод строки вместо числа;
                    –\tввод или вычисление значения за границами диапазона типа.
                    """);
            a = true;

        }

        } while (a);



    }

    private static byte[] bytesArray;

    private static void SetArray() throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        System.out.print("введите 4 числа от -127 до 127 для ссумирования через пробел\n");
        bytesArray = new byte[4];
        for (int i = 0; i < bytesArray.length; i++) {
            bytesArray[i] = in.nextByte();
        }
        sumArray();
    }
    private static void sumArray() {
        byte summ = 0;

        for (byte b : bytesArray) {
            summ += b;

        }
        System.out.println("сумма элементов массива = ["+ summ +"]");
    }




}



