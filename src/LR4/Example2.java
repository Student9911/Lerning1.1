package LR4;

public class Example2 {

    public static void main(String[] args) {
        int a = 10; // число столбцов которое необходимо вывести
        int z = 0; // переменная необходима для вывода служебного сообщения о количестве символов в строке;
        for (int i = 1; i <= a; i++) {
            if (i > 9) {
                System.out.print("номер строки: " + i + "  ");
            } else System.out.print("номер строки:  " + i + "  ");

            for (int j = 0; j <= z; j++) {
                System.out.print("+");
            }
            z = z + 1;
            System.out.println(" Количество символов + в строке: " + z);
        }
    }
}



