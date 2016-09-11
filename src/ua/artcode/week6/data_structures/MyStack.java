package ua.artcode.week6.data_structures;

import java.util.Iterator;

public interface MyStack<T> extends Iterable<T> {

    void push(T o);
    T pop();
    int size();

}
