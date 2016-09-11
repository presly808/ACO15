package ua.artcode.week6.java8;

/**
 * Created by serhii on 9/11/16.
 */
public class DefaultMethodsInterfaces {
}


class C implements A {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}

interface A {

    default int sum(int a, int b){
        return a + b;
    }

}


interface B {

    default int sum(int a, int b){
        return a + b + 1;
    }

}

