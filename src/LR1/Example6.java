package LR1;

import java.util.Scanner;

public class Example6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter your last name");
        String last_name = in.nextLine();

        System.out.println("enter your name");
        String name = in.nextLine();

        System.out.println("enter your middle name");
        String middle_name = in.nextLine();


        System.out.print("Hello " + last_name);
        System.out.print(", " + name);
        System.out.println(", " + middle_name);
        in.close();

    }
}
