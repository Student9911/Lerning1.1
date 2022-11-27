package LR1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введитете два числа через пробел: ");
        float A = in.nextFloat();
        float B = in.nextFloat();

        System.out.println("Сумма чисел равна: " + (A+B));
    }
}
