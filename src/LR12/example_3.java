package LR12;

import java.util.List;
import java.util.stream.Collectors;

// В примере показана функция возвращающая список строк, начинающихся с большой буквы.

public class example_3 {

    public static void main(String[] args) {

        String string = "Напишите Функцию, которая Принимает на вход список Строк " +
                "и возвращает новый Список, содержащий только те строки, " +
                "которые начинаются с Большой Буквы";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Стока после сплитования:" + "\n");
        for (String s : strings) {
            System.out.print("[" + s + "]");
        }

        List<String> stringAfter = filterCapitalizedStrings(strings);

        System.out.println("\n" + "Строка после преобразования:" + "\n");

        for (String e : stringAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterCapitalizedStrings(List<String> list) {
        return list.stream()
                .filter(z -> Character.isUpperCase(z.charAt(0)))
                .collect(Collectors.toList());
    }
}
