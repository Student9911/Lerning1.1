package LR6.Example7;

public class Example7 {
    private static int[] ints;

    private static void chars( char ... ch1) {
        ints = new int[ch1.length];
        for (int i =0; i < ch1.length; i ++) {
            ints[i] = ch1[i];

        }

    }
    static int[] ints() {
        chars('A', 'B', 'C');
        return ints;

    }
}

/*7. Напишите программу со статическим методом, аргументом которому передастся символьный массив,
а результатом возвращается ссылка на целочисленным массив, состоящий из кодов символов из массива- аргумента.*/
