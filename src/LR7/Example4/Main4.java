package LR7.Example4;
/*4. Напишите программу, в которой использована цепочка наследования из трех классов.
В первом классе есть открытое символьное поле. Во втором классе появляется открытое текстовое поле.
В третьем классе появляется открытое целочисленное поле. В каждом из классов должен быть конструктор,
позволяющий создавать объект на основе значений полей, переданных аргументами
конструктору, а также конструктор создания копии.*/

public class Main4 {

    public static void main(String[] args) {
        //super Class test
        SupClass4_1 superClassTest = new SupClass4_1('A');
        String className1 = superClassTest.toString();
        System.out.println(className1);
        //super Class copy test
        SupClass4_1 superClassTestCopy = new SupClass4_1(superClassTest);
        String className1copy = superClassTestCopy.toString();
        System.out.println(className1copy);
        //1 subClass test
       SubClass4_2 FirstSubClassTest = new SubClass4_2('B',"hello");
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);
        //1 subClass copy test
        SubClass4_2 FirstSubClassTestCopy = new SubClass4_2(FirstSubClassTest);
        String className2Copy = FirstSubClassTestCopy.toString();
        System.out.println(className2Copy);
        //2 subClass test
        SubClass4_3 SecondSubClassTest = new SubClass4_3('C',"hello too",12345);
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
        //2 subClass copy test
        SubClass4_3 SecondSubClassTestCopy = new SubClass4_3(SecondSubClassTest);
        String className3Copy = SecondSubClassTestCopy.toString();
        System.out.println(className3Copy);
    }
}
