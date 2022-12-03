package LR3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input your size array: ");
        int size = in.nextInt();
        int size2 = in.nextInt();
        int x = in.nextInt();
        System.out.println("size array: " + size);

        int[] array = new int[size];
        int[] array2 = new int[size2];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(300);
            System.out.println("Элемент массива [" +i+ "] " + array[i]);

        }
        Arrays.sort(array);


        System.out.println("Сортировка массива произведена");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Элемент массива [" +i+ "] после сортировки " + array[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(20);
            System.out.println("Элемент массива2 [" +i+ "] " + array2[i]);

        }
        Arrays.sort(array2);
        for (int i = 0; i < array2.length; i++) {
            if (x == array2[i]) {
                System.out.println("Круто совпадение  " + x);

            } else System.out.println("Элемент массива2 после сортировки [" +i+ "] " + array2[i]);


        }

    }
}
