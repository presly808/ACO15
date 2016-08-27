package ua.artcode.crm.utils;

import ua.artcode.crm.model.Manager;
import ua.artcode.week1.parking.Ticket;

import java.util.Arrays;

/**
 * Created by serhii on 14.08.16.
 */
public class Array<T> {

    public static final int DEFAULT_ARRAY_SIZE = 16;

    private T[] array;
    private int index;

    public Array() {
        array = (T[]) new Object[DEFAULT_ARRAY_SIZE];
    }

    public Array(T[] array){
        this.array = array;
    }

    public T get(int index){
        if(index < 0 || index > index){
            throw new WTFException("Index out of bounds");
        }

        return array[index];
    }

    public void set(int index, T obj){
        array[index] = obj;
    }

    public boolean add(T obj){

        if(obj == null){
            return false;
        }

        ensureCapacity();
        array[index++] = obj;
        return true;
    }

    private void ensureCapacity() {
        if(index >= array.length){
            T[] newArray = (T[])new Object[array.length * 2];
            System.arraycopy(array,0,newArray,0,array.length);
            array = newArray;
        }
    }

    public T[] getAll(){
        T[] retArr = Arrays.copyOf(array, index);
        return retArr;
    }

    public int getSize(){
        return index;
    }

}
