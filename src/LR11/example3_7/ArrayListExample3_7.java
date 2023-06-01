package LR11.example3_7;

import java.util.ArrayList;

public class ArrayListExample3_7 {
    public static void main(String[] args) {
        int n = 10; // количество человек
        ArrayList<Integer> list = new ArrayList<>();

        // Заполнение списка числами от 1 до n
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int index = 0;
        while (list.size() > 1) {
            index ++;
           if (index <= list.size()) {
               if (index % 2 == 0) {
                   list.remove(index - 1); // удаление каждого второго элемента

               }
           } else {
               index = 0;
           }

        }

        System.out.println("Остался один человек");
    }
}
