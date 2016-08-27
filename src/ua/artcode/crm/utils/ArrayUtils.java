package ua.artcode.crm.utils;

import ua.artcode.week4.day1.ImmutableUser;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * Created by serhii on 27.08.16.
 */
public class ArrayUtils {

    // selection sort
    public static void sort(Array<? extends Comparable> array){
        for (int i = 0; i < array.getSize(); i++) {

            Comparable min = array.get(i);
            int minIndex = i;
            // find min
            for (int j = i + 1; j < array.getSize(); j++) {
                Comparable forCompare = array.get(j);
                if(forCompare.compareTo(min) < 0){
                    min = forCompare;
                    minIndex = j;
                }
            }

            swap(array, i, minIndex);

        }
    }

    public static<T> void sort(Array<T> array, Comparator<T> comparator){
        for (int i = 0; i < array.getSize(); i++) {

            T min = array.get(i);
            int minIndex = i;
            // find min
            for (int j = i + 1; j < array.getSize(); j++) {
                T forCompare = array.get(j);
                if(comparator.compare(forCompare, min) < 0){
                    min = forCompare;
                    minIndex = j;
                }
            }

            swap(array, i, minIndex);

        }
    }

    public static<T> Array<T> sortNewArray(Array<T> array, Comparator<T> comparator){

        // create copy
        T[] copyA = Arrays.copyOf(array.getAll(),array.getSize());
        Array<T> copy = new Array<>(copyA);

        for (int i = 0; i < copy.getSize(); i++) {

            T min = copy.get(i);
            int minIndex = i;
            // find min
            for (int j = i + 1; j < copy.getSize(); j++) {
                T forCompare = copy.get(j);
                if(comparator.compare(forCompare,min) < 0){
                    min = forCompare;
                    minIndex = j;
                }
            }

            swap(copy, i, minIndex);
        }

        return copy;
    }

    public static void swap(Array array, int a, int b){
        Object temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);
    }

}
