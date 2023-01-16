package LR7.Example2;
/*2. Напишите программу, в которой есть суперкласс с приватным текстовым полем.
В базовом классе должен быть метод для присваивания значения полю: без параметров
и с одним текстовым параметром. Объект суперкласса создается передачей одного текстового
аргумента конструктору. Доступное только для чтения свойство результатом возвращает
длину текстовой строки. На основе суперкласса создается подкласс. В подклассе появляется
дополнительное открытое целочисленное поле. В классе должны быть такие версии метода для
присваивания значений полям (используется переопределение и перегрузка метода из суперкласса):
без параметров, с текстовым параметром, с целочисленным параметром, с текстовым и
целочисленным параметром. У конструктора подкласса два параметра (целочисленный и текстовый).*/

public class Main {

    public static void main(String[] args) {
        SuperClass2 myTest0 = new SuperClass2();
        String superClassTest0 = myTest0.toString();
        System.out.println(superClassTest0);

        SuperClass2 myTest1 = new SuperClass2("Объект суперкласса создается передачей одного текстового аргумента конструктору.");
        String superClassTest1 = myTest1.toString();
        System.out.println(superClassTest1);

        SuperClass2 myTest2 = new SubClass2();
        String subClassTest0 = myTest2.toString();
        System.out.println(subClassTest0);

        SuperClass2 myTest3 = new SubClass2("Объект подкласса создается передачей одного текстового аргумента конструктору.");
        String subClassTest1 = myTest3.toString();
        System.out.println(subClassTest1);

        SuperClass2 myTest4 = new SubClass2(256);
        String subClassTest2 = myTest4.toString();
        System.out.println(subClassTest2);

        SuperClass2 myTest5 = new SubClass2("Объект подкласса создается передачей текстового аргумента конструктору " +
                "\nи целочисленного значения.", 256);
        String subClassTest3 = myTest5.toString();
        System.out.println(subClassTest3);
    }
}


