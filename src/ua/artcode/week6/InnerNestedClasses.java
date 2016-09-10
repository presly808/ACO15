package ua.artcode.week6;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by serhii on 9/10/16.
 */
public class InnerNestedClasses {

    public static void main(String[] args) {

        // local
        class MyIntegerComparator implements Comparator<Integer>{
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }

        MyIntegerComparator myIntegerComparator1 = new MyIntegerComparator();
        MyIntegerComparator myIntegerComparator2 = new MyIntegerComparator();

        // Anonymous
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };

        Integer[] mas = {34,1,4,22,-4,11,34,55};

        Arrays.sort(mas);
    }

    public static void test() {

    }

}
