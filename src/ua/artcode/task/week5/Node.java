package ua.artcode.task.week5;

public class Node<T> {

    public T value;
    public Node<T> next;

    public Node() {
    }

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }
}
