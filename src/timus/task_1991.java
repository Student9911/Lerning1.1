package timus;

import java.util.Scanner;

public class task_1991 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] numbers = new int[n];
        int boom = 0;
        int droids = 0;

        for (int i = 0; i < numbers.length; i ++) {
            numbers[i] = in.nextInt();
        }

        for (int i = 0; i <numbers.length; i ++) {
            if (numbers[i] < k) {
                droids += (k - numbers[i]);
            } else {
                boom += (numbers[i] - k);
            }
        }
        System.out.println(boom + " " + droids);
    }
}
