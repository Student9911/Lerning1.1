package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int Garry = in.nextInt();
        int Larry = in.nextInt();
        int resultGarry = (Garry+Larry-1) - Garry;
        int resultLarry = (Garry+Larry-1) - Larry;

        out.println(resultGarry+" "+resultLarry);
        out.flush();
    }
}
