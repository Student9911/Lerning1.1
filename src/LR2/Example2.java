package LR2;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        System.out.println("Введите любое целое число: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();


        int result1 = x % 5;
        int result2 = x % 7;

        System.out.println("Остаток при делении числа на 5: " + result1);
        System.out.println("Остаток при делении числа на 7: " + result2);

        if (result2 == 1 && result1 == 2) {
            System.out.println("Число удовлетворяет требованиям");
        } else System.out.println("Число не удовлетворяет требованиям");
        in.close();
    }
}
