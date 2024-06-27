package secao20.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Stream<Integer> stream = integers.stream();
        System.out.println(Arrays.toString(stream.toArray()));

        List<String> strings = new ArrayList<>(List.of("Alison", "Diego", "Chris"));
        Stream<String> stream2 = strings.stream();
        System.out.println(Arrays.toString(stream2.toArray()));

        Stream<Integer> stream3 = Stream.iterate(0, i -> i + 2);
        System.out.println(Arrays.toString(stream3.limit(10).toArray()));

        Stream<Long> stream4 = Stream.iterate(new long[]{0L, 1L}, p -> new long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(stream4.limit(20).toArray()));

    }
}
