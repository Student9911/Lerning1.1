package LR11;
import java.util.Scanner;

/* Программа запрашивает у пользователя целое число, затем вызывает метод `decimalToBinary`,
который рекурсивно переводит число в двоичную систему счисления. Если число равно 0 или 1, метод возвращает
соответствующую строку. В противном случае метод вычисляет остаток от деления числа на 2 и целую часть от
деления на 2, затем вызывает сам себя для целой части и добавляет остаток к результату.
Результатом является строка, представляющая двоичное представление исходного числа.
* */

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int decimal = scanner.nextInt();
        String binary = decimalToBinary(decimal);
        System.out.println("Двоичное представление числа " + decimal + " равно " + binary);
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal == 1) {
            return "1";
        } else {
            int remainder = decimal % 2;
            int quotient = decimal / 2;
            return decimalToBinary(quotient) + remainder;
        }
    }
}