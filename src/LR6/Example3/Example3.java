package LR6.Example3;

public class Example3 {

    static void resultMax(int ... array){
        //наибольшее значение
        int max = array[0];
        for (int i =0; i<array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println("максимальное значение " + max);
    }
    //наименьшее значение
    static void resultMin(int ... array){
        int min = array[0];
        for (int i = 0; i < array.length; i ++) {
            min = Math.min(min, array[i]);
        }
        System.out.println("минимальное значение " + min);
    }
    //среднее значение из набора чисел.
    static void resultAvg(int ... array){
        int sum = 0;
        for (int i = 0; i < array.length; i ++) {
            sum = array[i] + sum;
        }
        double avg = (double) sum / array.length;
        System.out.println("среднее значение " + avg);
    }
}
