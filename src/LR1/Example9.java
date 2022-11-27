package LR1;

import java.time.YearMonth;
import java.util.Scanner;

public class Example9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Напишите название месяца чтобы узнать колличество дней в нем: ");
        String month = in.nextLine();

        switch (month) {
            case "Январь", "январь", "ЯНВАРЬ":
                System.out.println("В январе 31 день!");
                break;
            case "Февраль", "февраль", "ФЕВРАЛЬ":
                System.out.println("В феврале 28 дней!");
                break;
            case "Март", "март", "МАРТ":
                System.out.println("В марте 31 день!");
                break;
            case "Апрель", "апрель", "АПРЕЛЬ":
                System.out.println("В апреле 30 дней!");
                break;
            case "Май", "май", "МАЙ":
                System.out.println("В мае 31 день!");
                break;
            case "Июнь", "июнь", "ИЮНЬ":
                System.out.println("В июне 30 дней!");
                break;
            case "Июль", "июль", "ИЮЛЬ":
                System.out.println("В июле 31 день!");
                break;
            case "Август", "август", "АВГУСТ":
                System.out.println("В августе 31 день!");
                break;
            case "Сентябрь", "сентябрь", "СЕНТЯБРЬ":
                System.out.println("В сентябре 30 дней!");
                break;
            case "Октябрь", "октябрь", "ОКТЯБРЬ":
                System.out.println("В октябре 31 день!");
                break;
            case "Ноябрь", "ноябрь", "НОЯБРЬ":
                System.out.println("В ноябре 30 дней!");
                break;
            case "Декабрь", "декабрь", "ДЕКАБРЬ":
                System.out.println("В декабре 31 день!");
            default:
                System.out.println("Введены некоррректные данные");

        }
    }
}
