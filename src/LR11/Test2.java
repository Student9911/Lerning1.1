package LR11;

public class Test2 {

    public static void main(String[] args) {
        //Добавление элементов с перемещением головы (наращивание головы)
        node head = null; //начальное значение ссылки на голову
        for (int i = 9; i >= 0; i --) {
            head = new node(i, head);
        }
        //вывод элементов на экран
        node ref = head;
        while (ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}
