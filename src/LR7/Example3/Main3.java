package LR7.Example3;
/*3. Напишите программу, в которой на основе суперкласса создается подкласс,
а на основе этого подкласса создается еще один подкласс (цепочка наследования из трех классов).
В первом суперклассе есть открытое целочисленное поле, метод с одним параметром для присваивания
значения полю и конструктор с одним параметром. Во втором классе появляется открытое символьное
поле, метод с двумя параметрами для присваивания значения полям (перегрузка метода из суперкласса)
и конструктор с двумя параметрами. В третьем классе появляется открытое текстовое ноле, метод с
тремя аргументами для присваивания значений полям (перегрузка метода из суперкласса) и конструктор
с тремя параметрами. Для каждого класса определите метод toString () так, чтобы он возвращал
строку с названием класса и значениями всех полей объекта.*/

public class Main3 {

    public static void main(String[] args) {
        SupClass3_1 superClassTest = new SupClass3_1(120907);
        String className1 = superClassTest.toString();
        System.out.println(className1);

        SubClass3_2 FirstSubClassTest = new SubClass3_2(120907,'h');
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);

        SubClass3_3 SecondSubClassTest = new SubClass3_3(120907,'H',"Hello");
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
    }
}
