package chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by fall1999y on 2016. 7. 5..
 */
public class NumberMain {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);

        IntStream evenNumbers = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0);
        System.out.println(evenNumbers.count());

    }
}
