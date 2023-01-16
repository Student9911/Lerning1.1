package LR7.Example2;

public class Main {

    public static void main(String[] args) {
        SuperClass2 myTest0 = new SuperClass2();
        String superClassTest0 = myTest0.toString();
        System.out.println(superClassTest0);

        SuperClass2 myTest1 = new SuperClass2("test this");
        String superClassTest1 = myTest1.toString();
        System.out.println(superClassTest1);

        SuperClass2 myTest2 = new SubClass2();
        String subClassTest0 = myTest2.toString();
        System.out.println(subClassTest0);

        SuperClass2 myTest3 = new SubClass2("test this too");
        String subClassTest1 = myTest3.toString();
        System.out.println(subClassTest1);

        SuperClass2 myTest4 = new SubClass2(256);
        String subClassTest2 = myTest4.toString();
        System.out.println(subClassTest2);

        SuperClass2 myTest5 = new SubClass2("test this and this", 256);
        String subClassTest3 = myTest5.toString();
        System.out.println(subClassTest3);
    }
}


