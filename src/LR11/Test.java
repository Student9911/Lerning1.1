package LR11;

public class Test {  //Главный класс
    public static void main(String[] args) {
        //создание несвязанных узлов с помощью конструктора
        node node0 = new node(0, null); //0 узел будет головой в списке
        node node1 = new node(1, null);
        node node2 = new node(2, null);
        node node3 = new node(3, null); //последний узел будет хвостом в списке

        // связывание узлов в список с помощью ссылок

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        //Вывод списка с помощью вспомогательной переменной ref,
        //соответствующей текущему значению ссылки при прохождении по списку
        node ref = node0; // для перемещения по списку достаточно помнить голову
        while (ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}
