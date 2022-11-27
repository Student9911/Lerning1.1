package LR1;

import java.time.YearMonth;
import java.util.Scanner;

public class Example12 {

    public static void main(String[] args) {

        System.out.println("Input yor age");
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();
        int yearsOfBirth = YearMonth.now().getYear() - year;

        System.out.print(yearsOfBirth + " Год рождения");
        in.close();

    }
}
