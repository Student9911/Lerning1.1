package timus;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class task_1263 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] voice = new int[m];
        int[] candidate = new int[n];

        for (int i = 0; i < voice.length; i ++) {
            voice[i] = in.nextInt();
        }
        Arrays.sort(voice);
        for (int i = 0; i < candidate.length; i ++) {
            for (int j = 0; j < voice.length; j ++) {
                if (voice[j] == (i + 1)) {
                    candidate[i] ++;
                }

            }

        }

        double result;
        for (int i = 0; i < candidate.length; i ++) {
            result = (double) candidate[i] * 100 / m;
            System.out.println(String.format(Locale.ROOT, "%.2f", result) + "%");


        }


    }
}
