package LR5.Example5;



public class Main5 {

    public static void main(String[] args) {

        //присвоение значения полю через конструктор
        Example5 test1 = new Example5(21);
        System.out.println("введеное число = 21\nчисло которое" +
                " присвоилось полю " + test1.proverka());

        //присвоение значения больше 100 полю через метод с аргументом
        test1.Set(115);
        System.out.println("\nвведеное число = 115\nчисло которое" +
                " присвоилось полю " + test1.proverka());

        //присвоение значения меньше 0 полю через метод с аргументом
        test1.Set(-1);
        System.out.println("\nвведеное число = -1\nчисло которое" +
                " присвоилось полю " + test1.proverka());

        //присвоение значение полю через метод без аргуметов
        test1.Set();
        System.out.println("Число присвоенное полю методом без аргументов" +
                " = " + test1.proverka());



    }
}
