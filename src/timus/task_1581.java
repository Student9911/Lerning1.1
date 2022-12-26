package timus;

import java.util.ArrayList;
import java.util.Scanner;

public class task_1581 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ints = new int[n];


        for (int i = 0; i < ints.length; i++) {
            ints[i] = in.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            list.add(ints[i]);
        }

        int number = list.get(0), count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != number) {
                number = list.get(i);
                System.out.print(count + " " + list.get(i - 1) + " ");
                count = 1;
            } else count ++;
        }
        System.out.print(count + " " + list.get(list.size() - 1) + " ");
    }
}



