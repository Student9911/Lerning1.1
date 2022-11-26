package LR1;

import java.util.Date;
import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {

        System.out.println("Введите ваш год рождения: ");
        Scanner in = new Scanner(System.in);

        int yearOfBirth = in.nextInt();
        int age = (new Date()).getYear() + 1900 - yearOfBirth;

        System.out.println("Вам " + age + " Лет");
        in.close();

    }
}
