package LR1;

import java.time.YearMonth;
import java.util.Scanner;

public class Example11 {

    public static void main(String[] args) {

        System.out.println("Input your name: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        System.out.println("Input your year of birth: ");
        int yearOfBirth = in.nextInt();
        int years = YearMonth.now().getYear() - yearOfBirth;

        System.out.println("Your name: " + name);
        System.out.println("Your age: " + years);
        in.close();
    }
}
