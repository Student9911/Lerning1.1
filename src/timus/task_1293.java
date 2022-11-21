package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N, A, B;
        N = in.nextInt();
        A = in.nextInt();
        B = in.nextInt();
        int result = (N*A*B) * 2;

        out.println(result);
        out.flush();
    }
}
