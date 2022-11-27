package LR1;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("День недели: ");
        String Day = in.nextLine();

        System.out.println("Месяц: ");
        String mounth = in.nextLine();

        System.out.println("Число: ");
        int date = in.nextInt();

        System.out.println("День недели: " + Day);
        System.out.println("Месяц: " + mounth);
        System.out.println("Число: " + date);
        in.close();
    }
}


