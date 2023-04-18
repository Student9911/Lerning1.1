package LR12;

import java.util.ArrayList;

/*В данном примере мы создаем список строк `inputList`, заполняем его несколькими значениями
 и передаем его в метод `getOnlyLetters()`. В этом методе мы создаем новый список `outputList`,
 в который будем добавлять только те строки, которые содержат только буквы.
Для проверки каждой строки на наличие только букв мы используем метод `matches()`
и регулярное выражение `[a-zA-Z]+`, которое означает "одна или более буквы в любом регистре".
 Если строка соответствует этому регулярному выражению, то мы добавляем ее в `outputList`.
В конце программы мы выводим на экран исходный список `inputList` и список, полученный после
фильтрации строк `outputList`.*/

public class example_9 {
    public static void main(String[] args) {
        ArrayList<String> inputList = new ArrayList<>();
        inputList.add("Hello, world!");
        inputList.add("12345");
        inputList.add("Java is awesome");
        inputList.add("Testing 123");
        inputList.add("Only letters");
        inputList.add("Test");
        inputList.add("example");

        ArrayList<String> outputList = getOnlyLetters(inputList);

        System.out.println("Input list: " + inputList);
        System.out.println("Output list: " + outputList);
    }

    public static ArrayList<String> getOnlyLetters(ArrayList<String> inputList) {
        ArrayList<String> outputList = new ArrayList<>();

        for (String str : inputList) {
            if (str.matches("[a-zA-Z]+")) {
                outputList.add(str);
            }
        }

        return outputList;
    }
}