package LR12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int sizeArray = in.nextInt();

        int[] arr1 = new int[sizeArray];
        int[] arr2 = new int[sizeArray];
        Random random = new Random();

        for (int i =0; i < sizeArray; i ++) {
            arr1[i] = random.nextInt(200);
            arr2[i] = random.nextInt(200);

        }

        System.out.println("Массив arr1:" );
        System.out.println(Arrays.toString(arr1));
        System.out.println("Массив arr2:" );
        System.out.println(Arrays.toString(arr2));

        int[] arrResult = findCommonElements(arr1, arr2);

        System.out.println("Массив arrResult:");
        System.out.println(Arrays.toString(arrResult));
    }

    public static int[] findCommonElements(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1)
                .filter(x -> Arrays.stream(arr2)
                        .anyMatch(y -> y == x))
                .toArray();
    }
}
