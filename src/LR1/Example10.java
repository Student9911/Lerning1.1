package LR1;

import java.time.YearMonth;
import java.util.Date;
import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {

        System.out.println("Input your years of birth: ");
        Scanner in = new Scanner(System.in);

        int yearOfBirth = in.nextInt();
        int age = YearMonth.now().getYear() - yearOfBirth;

        System.out.println("Your age: " + age);
        in.close();

    }
}
