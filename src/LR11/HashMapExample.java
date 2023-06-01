package LR11;

import java.util.HashMap;
/*Заполнить HashMap 10 объектами <Integer, String>. Найти строки у которых ключ> 5.
Если ключ = 0, вывести строки через запятую. Перемножить все ключи, где длина строки>5.
* */

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Заполнение HashMap 10 объектами
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");

        // Нахождение строк у которых ключ > 5
        System.out.println("Ключ > 5:");
        for (int key : map.keySet()) {
            if (key > 5) {
                System.out.println(map.get(key));
            }
        }

        // Вывод строк через запятую если ключ = 0
        for (int key : map.keySet()) {
            if (key == 0) {
                System.out.print(map.get(key) + ", ");
            }
        }

        // Перемножение всех ключей, где длина строки > 5
        int result = 1;
        for (int key : map.keySet()) {
            if (map.get(key).length() > 5) {
                result *= key;
            }
        }
        if (result == 1) {
            System.out.println("нет строк с длиной более 5");
        } else {
            System.out.println("произведение ключей = " + result);
        }


    }
}