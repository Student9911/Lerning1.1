package LR11;

public class node { // Класс-структура элемента списка

    public int value;// значение
    public node next;// поле-ссылка (указатель) на следующий узел

    node(int value, node next) { // конструктор класса
        this.value = value;
        this.next = next;

    }


}
