package ua.artcode.task.week5;

/**
 * Created by serhii on 05.09.16.
 */
public class Node {

    public Object value;
    public Node next;

    public Node() {
    }

    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }
}
