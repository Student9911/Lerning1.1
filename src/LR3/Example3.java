package LR3;



import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.println("Введите количество итераций:");
        n = in.nextInt();
        int a = 1, b = 1; //переменные
        System.out.print(a + " " + b);
        int fib = 2, i = 2;
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" \n" + fib);
            i++;
        }
    }
}
