package LR11;
import java.util.Scanner;

/*Программа сначала запрашивает размер массива, затем создает массив и вызывает метод `inputArray`
для ввода элементов массива. Затем программа вызывает метод `outputArray` для вывода элементов массива.
Оба метода реализованы с помощью рекурсии.*/

public class RecursiveArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int[] array = new int[in.nextInt()];
        inputArray(array, 0);
        System.out.println("Введенный массив:");
        outputArray(array, 0);
    }

    public static void inputArray(int[] array, int index) {
        if (index < array.length) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите элемент массива: ");
            array[index] = scanner.nextInt();
            inputArray(array, index + 1);
        }
    }

    public static void outputArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print(array[index] + " ");
            outputArray(array, index + 1);
        }
    }
}
