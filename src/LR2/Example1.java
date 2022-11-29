package LR2;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        System.out.println("Введите любое целое число: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();


        int result = x % 3;

        if (result == 0) {
            System.out.println("Введенное число делится на 3 без остатка");
        }else System.out.println("Введенное число не делится на 3 без остатка");
        in.close();

    }
}
