package ua.artcode.week6.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by serhii on 9/11/16.
 */
public class TestStreams {


    public static void main(String[] args) {
        //iteration();

        int[] mas1 = {1,2,3,4,5,6,7};
        Arrays.stream(mas1);

        List<String> doubles = Stream.generate(Math::random).limit(1000).map(Object::toString).collect(Collectors.toList());
        String resDoubl = String.join("|", doubles);

        System.out.println(resDoubl);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        //lambda  - functional interface
        // lambda - function description (function body)
        Object[] mas = numbers.stream().map(num -> num * 2).map(a -> a - 10).filter((num) -> num % 2 == 0).toArray();
        System.out.println(Arrays.toString(mas));


        // methods
        // intermediate - middle -> Stream
            // map -> operation and converting -> Function body
            // filter -> Predicate
            // peek -> take and do some operation, Consumer, no return, dont change stream
            // distinct -> only unique elements
            // limit -> limit by size
            // skip(count)
            // sorted - input Comparator
        // terminal -> dont generate Stream
            // allMatch
            // anyMatch
            // count
            // toArray
            // forEach
            // findAny
            // findFirst
            // collect -> Stream to Collection, String
            // reduce -> aggregateFucntion from many get one value
        numbers.stream()
                .flatMap((integer) -> Stream.of(integer / 2, integer % 2)).sorted().forEach(System.out::print);

        List<Integer> integers = numbers.stream()
                .flatMap((integer) -> Stream.of(integer / 2, integer % 2))
                .sorted().collect(Collectors.toList());
        System.out.println();

        String res = numbers.stream()
                .flatMap((integer) -> Stream.of(integer / 2, integer % 2))
                .sorted().map(Object::toString).collect(Collectors.joining(","));
        System.out.println(res);

    }

    private static void iteration() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        // mult by 2, - 9, only even, toString, formatting

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);

            numbers.set(i, numbers.get(i) - 9);

            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
            }

            builder.append(numbers.get(i));


        }


        System.out.println(builder.toString());
    }
}
