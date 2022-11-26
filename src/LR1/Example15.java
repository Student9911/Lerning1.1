package LR1;

import java.util.Scanner;

public class Example15 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Выедите два числа: ");

        int A = in.nextInt();
        int B = in.nextInt();
        int result = A + B;



        System.out.println("Сумма чисел: " + result);
        if (A > B){
        System.out.println("Разность чисел равна: " + (A-B));
    }
        else System.out.println("Разность чисел равна: " + (B-A));
        in.close();
    }
}
