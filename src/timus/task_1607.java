package timus;

import java.util.Scanner;

public class task_1607 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int r = 0;
        if (a > c) {
            System.out.println(a);
        } else {
            while (a <= c) {
                if (a + b <= c) {
                    a += b;
                    r = a;
                } else {
                    r = c;
                    break;
                }
                if (c - d >= a) {
                    c -= d;
                    r = c;
                } else {
                    r = a;
                    break;
                }
            }
            System.out.println(r);
        }


    }
}

