package LR12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*В этом примере мы создаем список Integer и заполняем его в цикле числами.
 Затем мы используем метод 'squareList' для преобразования списка в поток, возводим в квадрат
 и затем собираем результаты обратно в список с помощью метода `collect()`.
 Результат выводится на экран.*/

public class example_4 {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("Список до выполнения программы: " + "\n");

        for (int i = 0; i < 10; i ++) {
            integers.add(random.nextInt(1000));
            if (i < 9) {
                System.out.print(integers.get(i) + ", ");
            } else {
                System.out.print(integers.get(i) + ".");
            }
        }

        List<Integer> integerAfter = squareList(integers);

        System.out.println("\n\n" + "Список после возведения в квадрат: " + "\n");
        int z = 0;

        for (Integer i: integerAfter) {
            if (z < integerAfter.size() - 1) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i + ".");
            }
            z ++;
        }
    }

    public static List<Integer> squareList(List<Integer> list) {
        return list.stream().map(x -> x * x).collect(Collectors.toList());
    }
}
