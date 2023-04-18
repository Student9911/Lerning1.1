package LR12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* В данном примере мы создаем список строк `strings`, задаем минимальную длину строки `minLength`
 и используем метод `stream()` для создания потока элементов списка.
 Затем мы применяем метод `filter()` для отбора только тех строк,
 которые имеют длину больше `minLength`. Наконец, мы используем метод `collect()`
 для сбора отфильтрованных строк в новый список `filteredStrings`. Результат выводится на экран
 с помощью метода `println()`.*/

public class example_7 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("lol");
        strings.add("hello");
        strings.add("java");
        strings.add("stream");
        strings.add("api");

        int minLength = 3;

        System.out.println("Original strings: " + strings);
        System.out.println("minimum length: " + minLength);

        List<String> filteredStrings = strings.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());

        System.out.println("Filtered strings: " + filteredStrings);
    }
}
