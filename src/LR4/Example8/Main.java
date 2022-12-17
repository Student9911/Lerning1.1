package LR4.Example8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Создание объекта класса Scanner
        Scanner in = new Scanner(System.in);
        // При запуске программы в консоль необходимо вывести сообщение: «Введите текст для шифрования»,
        System.out.print("Введите текст для шифрования: ");
        // Записываем текст в переменную "text"
        String text = in.nextLine();
        // после ввода текста, появляется сообщение пользоватьелю : «Введите ключ».
        System.out.print("Введите ключ: ");
        // Записываем значение в переменную "shift"
        int shift = in.nextInt();
        String encryptStr = Caesar.encrypt(text, shift);
        // После того как введены все данные, необходимо вывести преобразованную строку с сообщением «Текст после преобразования : ».
        System.out.print("Текст после преобразования :" + "\"" + encryptStr + "\"");
        // Далее необходимо задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
        System.out.println("\nВыполнить обратное преобразование? (y/n)"); // пользователю
        boolean cool = false;
        while (!cool) {
            String reply = in.next().toLowerCase();

            // если пользователь вводит «y», тогда выполнить обратное преобразование.
            if (reply.equals("y")) {
                String decryptStr = Caesar.decrypt(encryptStr, shift);
                System.out.println(decryptStr);
                cool = true;
            }
            // Если пользователь вводит «n», того программа выводит сообщение «До свидания!».
            else if (reply.equals("n")) {
                System.out.println("До свидания!");
                cool = true;
            }
            // Если пользователь вводит что-то другое, отличное от «y» или «n»,
            // то программа ему выводит сообщение: «Введите корректный ответ».
            else {
                System.out.println("Введите корректный ответ: ");

            }
        }
    }
}
