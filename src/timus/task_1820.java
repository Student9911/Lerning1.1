package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_1820 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = scan.nextInt();
        int K = scan.nextInt();
        int result = (N * 2) / K;

        out.println(result);
        out.flush();
    }
}
