package LR4;


public class Example3 {

    public static void main(String[] args) {


        int a = 15; // число строк которое необходимо вывести
        System.out.println("Будет выведен прямоугольник из цифр 2" +
                " с шириной: " + a + " символов");
        int b = 10; // число строк которое необходимо вывести
        System.out.println("высотой: " + b + " строк");
        int [][] graph = new int [b][a]; //создание элемента массива необходимого размера
        int z = 0; //переменная для вывода количества строк
        for (int i =0; i < b; i ++){//заполнение массива
            for (int j = 0; j < a; j++){
                graph[i][j] = 2;
            }
        }
        for (int i =0; i < b; i++){//печать массива
            int count = i + 1;//переменная для повышения номера индекса для вывода в консоль

            if (count > 9) {
                System.out.print("номер строки " + count + " : ");
            } else System.out.print("номер строки  " + count + " : ");

            for (int j = 0; j < a; j++){
                System.out.print(graph[i][j] + " ");
                z ++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0; //обнуление счетчика
        }
    }
}
