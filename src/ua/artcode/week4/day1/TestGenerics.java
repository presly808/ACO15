package ua.artcode.week4.day1;

import ua.artcode.crm.utils.Array;
import ua.artcode.crm.utils.ArrayUtils;
import ua.artcode.crm.utils.WTFException;

import java.util.Arrays;

/**
 * Created by serhii on 27.08.16.
 */
public class TestGenerics {


    public static void main(String[] args) {
        Array<ImmutableUser> array = new Array<>();

        ImmutableUser user1 = new ImmutableUser("Ivan", 2000);
        ImmutableUser user2 = new ImmutableUser("Erick", 1000);
        ImmutableUser user3 = new ImmutableUser("Oleg", 3000);

        array.add(user3);
        array.add(user1);
        array.add(user2);

        System.out.println(Arrays.toString(array.getAll()));

        ArrayUtils.sort(array);

        System.out.println(Arrays.toString(array.getAll()));

        ArrayUtils.sort(array, new UserNameComparator());

        System.out.println(Arrays.toString(array.getAll()));
    }
}
