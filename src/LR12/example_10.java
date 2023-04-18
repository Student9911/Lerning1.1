package LR12;

import java.util.ArrayList;
import java.util.List;

/*В данном примере мы создаем список `numbers`, содержащий пять целых чисел.
Затем мы задаем значение `limit`, которое будет использоваться для фильтрации списка.
Мы вызываем метод `filterNumbers`, передавая ему список `numbers` и значение `limit`.
Метод `filterNumbers` проходит по каждому элементу списка `numbers` и проверяет,
меньше ли он значения `limit`. Если да, то элемент добавляется в новый список `filteredNumbers`.
В конце метод возвращает новый список `filteredNumbers`, содержащий только те числа,
которые меньше значения `limit`.*/

public class example_10 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        int limit = 18;

        List<Integer> filteredNumbers = filterNumbers(numbers, limit);

        System.out.println("Original numbers: " + numbers);
        System.out.println("Filtered numbers: " + filteredNumbers);
    }

    public static List<Integer> filterNumbers(List<Integer> numbers, int limit) {
        List<Integer> filteredNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number < limit) {
                filteredNumbers.add(number);
            }
        }

        return filteredNumbers;
    }
}
