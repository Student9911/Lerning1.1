package LR3;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        // Сообщение пользователю "для понимания"
        System.out.println("Введите целое число в диапазоне от 1 до 7: ");
        // Создание обЪекта класса Scanner для считывания Int числа введенного в консоль
        Scanner in = new Scanner(System.in);
        // Запись в переменную number
        int number = in.nextInt();
        // Для сравнения введенного значения я использовал оператор выбора switch
        switch (number) {
            case 1:
                System.out.println("Вы ввели: " + number + " - Это понедельник");
                break;
            case 2:
                System.out.println("Вы ввели: " + number + " - Это вторник");
                break;
            case 3:
                System.out.println("Вы ввели: " + number + " - Это среда");
                break;
            case 4:
                System.out.println("Вы ввели: " + number + " - Это четверг");
                break;
            case 5:
                System.out.println("Вы ввели: " + number + " - Это пятница");
                break;
            case 6:
                System.out.println("Вы ввели: " + number + " - Это суббота");
                break;
            case 7:
                System.out.println("Вы ввели: " + number + " - Это воскресенье");
            default:
                // Сообщение пользователю (сработает если будет введено интовое число
                // не входящее в диапазон от 1 до 7)
                System.out.println("Введены некоррректные данные");

        }
    }
}
//          Напишите программу, в которой пользователь вводит целое число
//          в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
//          Если введенное пользователем число выходит за допустимый диапазон,
//          выводится сообщение о том, что введено некорректное значение. Используйте
//          оператор выбора switch.
