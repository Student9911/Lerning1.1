package LR4;

import java.util.Random;

public class Example6 {

    public static void main(String[] args) {
        // Создание объекта класса Random
        Random random = new Random(200);
        int a = 5;
        int b = 5;
        int firstArray[][] = new int[a][b];                                         // создание первого массива
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                firstArray[i][j] = random.nextInt(100);
                System.out.println("[" + i + "][" + j + "] " + firstArray[i][j]);
            }
        }
        System.out.println("===================================");
        // № строки для удаления
        int deleteS = random.nextInt(a - 1);
        // № столбца для удаления
        int deleteK = random.nextInt(b - 1);

        System.out.println("delete_S = " + deleteS + "; delete_K= " + deleteK);
        System.out.println("===================================");
        // создание массива в котором удалена 1 строка и 1 столбец
        int secondArray[][] = new int[a - 1][b - 1];
        for (int i = 0, s = 0; i < a - 1; s++) {
            for (int j = 0, k = 0; j < b - 1; k++) {
                if (k != deleteK | s != deleteS) {
                    secondArray[i][j] = firstArray[s][k];
                    System.out.println("[" + i + "][" + j + "] " + secondArray[i][j]);
                    j++;
                }
            }
            i++;

        }
    }
}

        //6. Напишите программу, в которой создается и инициализируется двумерный числовой массив.
        //Затем из этого массива удаляется строка и столбец (создается новый массив, в котором по
        //сравнению с исходным удалена одна строка и один столбец). Индекс удаляемой строки и индекс
        //удаляемого столбца определяется с помощью генератора случайных чисел.
