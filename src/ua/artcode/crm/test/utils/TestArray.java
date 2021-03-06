package ua.artcode.crm.test.utils;

import ua.artcode.crm.model.Dev;
import ua.artcode.crm.utils.Array;

/**
 * Created by serhii on 14.08.16.
 */
public class TestArray {

    public static void main(String[] args) {
        Dev dev = new Dev("Ivan","ivan@gmail.com");

        Array array = new Array();

        boolean addActual = array.add(dev);
        boolean addExpected = true;

        System.out.printf("%s addMethod\n", (addExpected == addActual));

        boolean addNullActual = array.add(null);
        boolean addNullExpected = false;

        System.out.printf("%s addNull\n", addNullActual == addNullExpected);


        Dev getActual = (Dev) array.get(0);
        Dev getExpected = dev;

        System.out.printf("%s getMethod\n", (getActual.getId() == getExpected.getId()));



    }
}
