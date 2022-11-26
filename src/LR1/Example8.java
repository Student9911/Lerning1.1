package LR1;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели");
        String day = in.nextLine();

        switch (day) {
            case "Понедельник", "Пн", "пн", "понедельник", "ПН", "ПОНЕДЕЛЬНИК":
                break;
            case "Вторник", "вторник", "Вт", "вт", "ВТОРНИК", "ВТ":
                break;
            case "Среда", "СРЕДА", "среда", "СР", "Ср", "ср":
                break;
            case "Четверг", "ЧЕТВЕРГ", "четверг", "Чт", "чт", "ЧТ":
            default:
                System.out.println("Введены некоррректные данные");
        }
        System.out.println("Введите название месяца");
        String month = in.nextLine();

        switch (month) {
            case "Январь", "январь", "ЯНВАРЬ":
                break;
            case "Февраль", "февраль", "ФЕВРАЛЬ":
                break;
            case "Март", "март", "МАРТ":
                break;
            case "Апрель", "апрель", "АПРЕЛЬ":
                break;
            case "Май", "май", "МАЙ":
                break;
            case "Июнь", "июнь", "ИЮНЬ":
                break;
            case "Июль", "июль", "ИЮЛЬ":
                break;
            case "Август", "август", "АВГУСТ":
            case "Сентябрь", "сентябрь", "СЕНТЯБРЬ":
                break;
            case "Октябрь", "октябрь", "ОКТЯБРЬ":
                break;
            case "Ноябрь", "ноябрь", "НОЯБРЬ":
                break;
            case "Декабрь", "декабрь", "ДЕКАБРЬ":
            default:
                System.out.println("Введены некоррректные данные");

        }
        System.out.println("Введите число месяца");
        int data = in.nextInt();
        System.out.println(month);
        System.out.println(day);
            System.out.println(data);

    }
}


