package ua.artcode.week6.data_structures;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;

public class TestMyStack {

    public static void main(String[] args) {
        testPush();
        testPop();
        testPopNeg();

        iterateOverAllElements();
    }

    public static MyStack<Integer> generate(int size, int range){
        Integer[] arr = new Integer[size];
        Arrays.fill(arr, (int)(Math.random() * range));
        return new LinkedStack<>(arr);
    }

    private static void iterateOverAllElements() {
        MyStack<Integer> myStack = generate(10, 100);

        Iterator<Integer> iterator = myStack.iterator();
        while (iterator.hasNext()){
            Integer iter = iterator.next();
        }

        for(Integer iter : myStack){
            System.out.print(iter + " ");
        }


    }

    private static void testPush() {
        MyStack<String> myStack = new LinkedStack<>();

        myStack.push("Ivan");
        myStack.push("Andriy");
        myStack.push("Oleg");
        myStack.push("Jenia");
        myStack.push("Serhii");

        System.out.println("test push " + (myStack.size() == 5));
    }


    private static void testPop() {
        MyStack<String> myStack = new LinkedStack<>();

        myStack.push("Ivan");
        myStack.push("Andriy");
        myStack.push("Oleg");
        myStack.push("Jenia");
        myStack.push("Serhii");

        myStack.pop();
        myStack.pop();
        myStack.pop();

        System.out.println("test pop" + (myStack.size() == 2));
    }

    private static void testPopNeg() {
        MyStack<String> myStack = new LinkedStack<>();

        try {
            myStack.pop();
            System.out.println("test pop negative false");
        } catch (EmptyStackException s){
            System.out.println("test pop negative true");
        }



    }

}
