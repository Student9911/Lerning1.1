package LR12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*В этом примере мы создаем список строк `strings`, затем задаем подстроку `substring`,
которую мы будем искать в каждой строке списка. Затем мы используем метод `stream()`
для преобразования списка в поток, фильтруем поток с помощью метода `filter()`,
который оставляет только те строки, которые содержат заданную подстроку,
и затем собираем результаты обратно в список с помощью метода `collect()`.
Результат выводится на экран.*/

public class example_5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java", "stream", "api");
        String substring = "va";
        List<String> filteredStrings = strings.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
        System.out.println(filteredStrings);
    }
}