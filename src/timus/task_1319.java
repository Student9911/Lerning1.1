package timus;

import java.util.Scanner;

public class task_1319 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        int check = 1;
        int colums = 0;
        int row = n -1;

        int[][] plate = new int[n][n];

        while (row >= 0) {
            for (int i = colums, j = row; j < plate.length ;i ++, j ++) {
                plate[i][j] = check;
                check ++;

            }
            row --;
        }
        colums = 1;
        row = 0;
        while (colums < plate.length) {
            for (int i = colums, j = row; i < plate.length ;i ++, j ++) {
                plate[i][j] = check;
                check ++;

            }
            colums ++;
        }
        for (int i =0; i < plate.length; i ++) {
            for (int k = 0; k < plate.length; k ++) {
                System.out.print( plate[i][k] + " ");
            }
            System.out.println();
        }


    }
}
