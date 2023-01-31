package timus;

import java.util.Scanner;

public class task_1545 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] str = new String[(in.nextInt() + 1)];
        int index = -1;
        String ch;

        for (int i = 0; i < str.length; i ++) {
            str[i] = in.nextLine();
        }

        ch = in.nextLine();
        for (int i = 0; i < str.length; i ++) {
            index = str[i].indexOf(ch);
            if (index == 0) {
                System.out.println(str[i]);

            }
        }
    }
}
