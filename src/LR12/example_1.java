package LR12;
import java.util.Arrays;

// В примере показана функция, возвращающая массив четных чисел.

public class example_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenArr = getEvenNumbers(arr);
        System.out.println(Arrays.toString(evenArr));
    }

    public static int[] getEvenNumbers(int[] arr) {

        return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
    }
}