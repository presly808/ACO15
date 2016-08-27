package ua.artcode.week4.day1;

import com.sun.javafx.css.Combinator;

import java.util.Comparator;

/**
 * Created by serhii on 27.08.16.
 */
public class UserNameComparator implements Comparator<ImmutableUser> {
    @Override
    public int compare(ImmutableUser o1, ImmutableUser o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
