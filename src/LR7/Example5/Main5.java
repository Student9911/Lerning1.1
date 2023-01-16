package LR7.Example5;

public class Main5 {

    public static void main(String[] args) {
        SuperClass5 SuperClassTest1 = new SuperClass5("easy to test this");
        SuperClassTest1.PrintToString();

        SubClass5_1 SubClassTest1 = new SubClass5_1("Test 4 subclass", 256);
        SubClassTest1.PrintToString();

        SubClass5_2 SubClassTest2 = new SubClass5_2("Test 4 subclass again", 'A');
        SubClassTest2.PrintToString();

        SuperClass5 SuperClassTest2 = new SuperClass5(SubClassTest1.getStr1());
        SuperClassTest2.PrintToString();

        SuperClass5 SuperClassTest3 = new SuperClass5(SubClassTest2.str1);
        SuperClassTest3.PrintToString();
    }
}
