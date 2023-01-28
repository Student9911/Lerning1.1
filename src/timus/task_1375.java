package timus;

import java.util.Scanner;

public class task_1375 {

    public static void main(String[] args) {


        int a;
        int b;
        int result = 0;
        Scanner in = new Scanner(System.in);

        a = in.nextInt();
        b = in.nextInt();

        if (a % 2 == 0 & b % 2 == 0) {
            System.out.println((b - a) / 2);
        }
        else {
            System.out.println((b - a) / 2 + 1);
        }


    }
}





