package ua.artcode.week4.day1;

import java.util.Comparator;

/**
 * Created by serhii on 27.08.16.
 */
public class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
