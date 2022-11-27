package LR1;

import java.util.Scanner;

public class Example14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input your number: ");
        int number = in.nextInt();
        int result1 = number - 1;
        int result2 = number + 1;
        int result3 = (result1 + number + result2);

        System.out.println("result: " + result1 + " " + number + " " + result2 + " " + (result3 * result3));
        in.close();
    }
}
