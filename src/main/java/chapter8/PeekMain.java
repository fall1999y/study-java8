package chapter8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by fall1999y on 2016. 7. 22..
 */
public class PeekMain {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);

        List<Integer> result = numbers.stream().peek(x -> System.out.println("from stream" + x)).map(x -> x + 17)
                .peek(x -> System.out.println("after map: " + x)).filter(x -> x % 2 == 0).peek(x -> System.out.println
                        ("after filter : " + x)).limit(3).peek(x -> System.out.println("after limit : " + x)).collect(Collectors.toList());
    }
}
