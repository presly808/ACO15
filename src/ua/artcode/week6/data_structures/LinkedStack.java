package ua.artcode.week6.data_structures;

import ua.artcode.task.week5.Node;

import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * Created by serhii on 9/11/16.
 */
public class LinkedStack<E> implements MyStack<E> {

    private Node<E> top;
    private int size;

    public LinkedStack() {
    }

    public LinkedStack(E...arg) {
        for (E e : arg) {
            push(e);
        }
    }

    @Override
    public void push(E o) {
        top = new Node<>(o, top);
        size++;
    }

    @Override
    public E pop() {

        if(size == 0){
            throw new EmptyStackException();
        }

        E forRet = top.value;
        top = top.next;
        size--;

        return forRet;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public Iterator<E> iterator() {
        return new MyLinkedStackIterator();
    }


    private class MyLinkedStackIterator implements Iterator<E> {

        private Node<E> curr;

        public MyLinkedStackIterator() {
            curr = top;
        }

        @Override
        public E next(){
            E forRet = curr.value;
            curr = curr.next;
            return forRet;
        }

        @Override
        public boolean hasNext(){
            return curr != null;
        }


    }

}
