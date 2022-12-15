package LR4;



public class Example7 {

    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        // создание двухмерного массива
        int[][] arrayZmeyka = new int[a][b];
        //переменная для подсчета использованных значений
        int hvost = 0;
        //переменная для заполнения элементов массива
        int telo = 0;
        //вспомогательная переменная для подсчета строк
        int h = 0;
        for (int i = 0; h < arrayZmeyka.length ; h++) {
            //заполнение верхней строки массива слева-направо
            for (int j = 0; j <(arrayZmeyka[i].length - hvost); j++) {
                arrayZmeyka[i][j] = telo;
                telo++;
            }
            if(i< arrayZmeyka.length-1) {
                i++;}
            //заполнение правого столбца массива снизу-вверх
            for (int o = a-1; o > hvost; o--) {
                arrayZmeyka[o][arrayZmeyka[i].length-1-hvost] = telo;
                telo++;
            }
            hvost++;
        }
        //вспомогательная переменная для подсчета символов в строке
        int z = 0;
        for (int i = 0; i < arrayZmeyka.length; i++){
            //переменная для повышения номера индекса для вывода на консоль
            int count = i+1;
            if (count < 10) {
                System.out.print("номер строки " + count + " :  ");
            } else {
                System.out.print("номер строки " + count + " : ");
            }
            for (int j = 0; j < arrayZmeyka[i].length; j++){
                if (arrayZmeyka[i][j] < 10) {
                    System.out.print(arrayZmeyka[i][j] + "  ");
                } else {
                    System.out.print(arrayZmeyka[i][j] + " ");
                }
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;                                                                  //обнуление счетчика символов
        }
    }


}
        //7. Напишите программу, в которой создается двумерный числовой
        // массив и этот массив заполняется «змейкой»: сначала первая
        // строка (слева направо), затем последний столбец (снизу вверх),
        // вторая строка (слева направо) и так далее.
