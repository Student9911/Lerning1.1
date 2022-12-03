package LR2;

import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {

        System.out.println("Ведите любое целое число в диапазоне от 5 до 10: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x > 4 && x < 11) {
            System.out.println("Введенное число удовлетворяет требованиям");
        } else System.out.println("Введенное число не удовлетворяет требованиям");
        in.close();
    }
}
        // Написать программу, которая проверяет, попадает ли введение пользователем число
        // в диапазон от 5 до 10 включительно.
