package LR6.Example10;

import java.util.Arrays;

public class Example10 {

    static int[] ints;
    static int max =0;
    static int min = 0;


    private static void minMax(int ... array) {

        Arrays.sort(array);
        for (int i = 0; i < array.length; i ++) {
            max = Math.max(max, array[i]);

        }
        min = array[0];

    }
    static int[] ints() {
        Example10.minMax(3, 5, 1, 2, 0);
        ints = new int[2];
        ints[0] = min;
        ints[1] = max;
        return ints;
    }






}


/*10. Напишите программу со статическим методом, аргументом которому передается произвольное
количество целочисленных аргументов. Результатом метод возвращает массив из двух элементов:
это значения наибольшего и наименьшего значений среди аргументов, переданных методу.*/
