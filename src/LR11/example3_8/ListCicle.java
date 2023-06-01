package LR11.example3_8;

import java.util.NoSuchElementException;

public class ListCicle {
    private Node head;
    private int size;
    //ввод с головы createHead();
    public void createHead(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }
    //ввод с хвоста createTail();
    public void createTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }
    //вывод (возвращается строка, сформированная из элементов списка) toString();
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.getData()).append(" ");
            current = current.getNext();
        }
        return result.toString();
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public void insert(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            size++;
        }
    }

    public int removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        int data = head.getData();
        head = head.getNext();
        size--;
        return data;
    }

    public int removeLast() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        if (head.getNext() == null) {
            int data = head.getData();
            head = null;
            size--;
            return data;
        }
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        int data = current.getNext().getData();
        current.setNext(null);
        size--;
        return data;
    }

    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            int data = current.getNext().getData();
            current.setNext(current.getNext().getNext());
            size--;
            return data;
        }
    }
}

class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}



