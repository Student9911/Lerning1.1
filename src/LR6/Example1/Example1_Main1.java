package LR6.Example1;

import java.util.Random;

public class Example1_Main1 {

    public static void main(String[] args) {

        Random random = new Random();
        Example1 test = new Example1();

        test.Set('a');
        test.Set("abc");
        System.out.println(test.ch);
        System.out.println(test.str);

        char[] ch2 = new char[50];
        char[] ch3 = new char[1];
        ch3[0] = 'i';
        for (int i = 0; i < ch2.length; i ++) {
            ch2[i] = (char) random.nextInt(60, 80);
        }

        test.Set(ch2);
        test.Set(ch3);
        System.out.println(test.ch);
        System.out.println(test.str);



    }


}