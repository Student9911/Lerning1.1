package LR12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/* Пример работы программы:
Введите список целых чисел через пробел, например 1 2 3 4 5 6 7 8 9 10
Введите число, на которое должны делиться числа из списка, например 3
Результат работы программы:
Числа, которые делятся на 3 без остатка: [3, 6, 9]*/

public class example_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите список целых чисел через пробел: ");
        String input = scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();
        for (String s : input.split(" ")) {
            numbers.add(Integer.parseInt(s));
        }
        System.out.print("Введите число, на которое должны делиться числа из списка: ");
        int divisor = scanner.nextInt();
        List<Integer> result = numbers.stream()
                .filter(n -> n % divisor == 0)
                .collect(Collectors.toList());
        System.out.println("Числа, которые делятся на " + divisor + " без остатка: " + result);
    }
}