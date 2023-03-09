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
            System.out.println("–\tввод строки вместо числа;\n" +
                    "–\tввод или вычисление значения за границами диапазона типа.\n");
            a = true;

        }

        } while (a == true);



    }

    private static byte[] bytesArray;

    private static void SetArray() {
        Scanner in = new Scanner(System.in);
        System.out.print("введите 4 числа для ссумирования\n");
        bytesArray = new byte[4];
        for (int i = 0; i < bytesArray.length; i++) {
            bytesArray[i] = in.nextByte();
        }
        sumArray();
    }
    private static void sumArray() {
        byte summ = 0;

        for (int i = 0; i < bytesArray.length; i ++) {
            summ += bytesArray[i];
            if (summ > 127 || summ < -127) {

            }

        }
        System.out.println("сумма элементов массива = ["+ summ +"]");
    }




}



