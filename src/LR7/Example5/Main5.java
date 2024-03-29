package LR7.Example5;

/*5. Напишите программу, в которой есть суперкласс с защищенным текстовым полем,
конструктор с текстовым параметром и метод, при вызове которого в консольном окне
отображается название класса и значение поля. На основе суперкласса создаются два подкласса
(оба на основе одного и того же суперкласса). В одном из классов появляется защищенное
целочисленное поле, там есть конструктор с двумя параметрами и переопределен метод для
отображения значений полей объекта и названия класса. Во втором подклассе появляется
защищенное символьное поле, конструктор с двумя параметрами и переопределен метод,
тображающий в консоли название класса и значения полей. В главном методе создайте объекты
каждого из классов. Проверьте работу метода, отображающего значения полей объектов,
для каждого из объектов. Вызовите этот же метод через объектную переменную суперкласса,
которая ссылается на объект производного класса.*/

public class Main5 {

    public static void main(String[] args) {
        SuperClass5 SuperClassTest1 = new SuperClass5("Конструктор суперкласса с одним аргументом");
        SuperClassTest1.PrintToString();

        SubClass5_1 SubClassTest1 = new SubClass5_1("Конструктор подкласса с текстовым аргументом и интовым аргументом", 54321);
        SubClassTest1.PrintToString();

        SubClass5_2 SubClassTest2 = new SubClass5_2("Конструктор подкласса с текстовым и символьным аргументом", 'A');
        SubClassTest2.PrintToString();

        SuperClass5 SuperClassTest2 = new SuperClass5(SubClassTest1.getStr1());
        SuperClassTest2.PrintToString();

        SuperClass5 SuperClassTest3 = new SuperClass5(SubClassTest2.str1);
        SuperClassTest3.PrintToString();
    }
}
