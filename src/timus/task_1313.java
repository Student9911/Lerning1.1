package timus;



import java.util.Scanner;

public class task_1313 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int colums = 1;
        int stri = 0;
        int n = in.nextInt();
        int[][] pixel = new int[n][n];
        int ind = pixel.length -1;

        for (int i = 0; i < pixel.length; i ++) {
            for (int j = 0; j < n; j ++) {
                pixel[i][j] = in.nextInt();
            }

        }
        System.out.print(pixel[0][0] + " ");
        while (colums < pixel.length) {
            for (int i = colums, j = stri; i>=0 ;i--, j ++) {
                System.out.print(pixel[i][j] + " ");


            }
            colums ++;

        }
        colums = ind;
        stri = 1;
        while (stri <= ind) {
            for (int i = colums, j = stri; j <= ind; i--, j++) {
                System.out.print(pixel[i][j] + " ");

            }
            stri ++;
        }
    }
}




