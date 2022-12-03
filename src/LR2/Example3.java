package LR2;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {

        System.out.println("Введите целое число, которое больше 10 и делится на 4 без остатка: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        int result = x % 4;

        if (result == 0 && x > 9) {
            System.out.println("Введенное число удовлетворяет требованиям");
        } else System.out.println("Введенное число не удовлетворяет требованиям");
        in.close();

    }
}
        // Написать программу, которая проверяет, удовлетворяет ли введенное пользователем число следующим критериям:
        // число делится на 4, и при этом оно не меньше 10.
