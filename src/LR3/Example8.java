package LR3;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char[] alf = new char[10];
        int[] ints = new int[alf.length];
        int i;
        int z;
        int x = 67;
        z = x;
        for (i = 0; i < alf.length; i++) {
            z ++;
            if (z == 70 || z == 74 || z == 80 || z == 90) {

                i --;

            } else ;
            int y = 0;
            y ++;
            ints[i] = x;
            x ++;
            alf[y] = (char) ints[y];
            System.out.println(x + " " + alf[i]);;

        }






    }
}

        // 8. Напишите программу, в которой создается символьный массив
        // из 10 элементов. Массив заполнить большими (прописными) буквами
        // английского алфавита. Буквы берутся подряд, но только согласные
        // (то есть гласные буквы ’ А',Е' и ' I' при присваивании значений
        // элементам массива нужно пропустить). Отобразите содержимое созданного
        // массива в консольном окне.
