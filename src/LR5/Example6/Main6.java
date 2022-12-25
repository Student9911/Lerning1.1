package LR5.Example6;

public class Main6 {

    public static void main(String[] args) {
        //конструктор с 2-мя аргументами
        Example6 test1 = new Example6(7, 5);
        test1.result();
        //конструктор с 1-м аргументом
        test1 = new Example6(10);
        test1.result();
        //метод с 1-м аргументом
        test1.volume(3);
        test1.result();
        //метод с 2-мя аргументами
        test1.volume(15, 20);
        test1.result();


    }
}
