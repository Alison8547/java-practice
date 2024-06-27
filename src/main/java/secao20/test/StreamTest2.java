package secao20.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Stream<Integer> stream = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(stream.toArray()));


        Integer sum = list.stream()
                .reduce(0, (x, y) -> x + y);

        System.out.println(sum);

        Integer multi = list.stream()
                .reduce(1, (x, y) -> x * y);

        System.out.println(multi);


        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(m -> m * 10)
                .toList();

        System.out.println(newList);
    }
}
