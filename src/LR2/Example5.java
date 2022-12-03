package LR2;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {

        System.out.println("Введите целое число более 1000: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = x / 1000;
        DecimalFormat decimalFormat = new DecimalFormat("#");
        String result1 = decimalFormat.format(y);

        if (y > 0) {
            System.out.println("Тысяч в веденном числе: " + result1);
        } else System.out.println("Введеное число меньше 1000((((");
        in.close();
    }
}
        // Написать программу, которая проверяет, сколько тысяч во введенном пользователем числе
        // (определяется четвертая цифра справа в десятичном представлении числа).
