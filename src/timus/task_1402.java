package timus;

import java.util.Scanner;

public class task_1402 {
    static int result = 1;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        if (a == 1) {

        } else if (a == 2) {
            System.out.println(2);

        } else {
            getFactorial(a);
            System.out.println(result * 2);
        }
    }
    public static int getFactorial(int f) {

        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
