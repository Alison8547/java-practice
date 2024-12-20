package streams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exemplos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> collect = partitioning(numeros, n -> n > 5);

        System.out.println(collect);

        

    }

    public static <T> Map<Boolean, List<T>> partitioning(List<T> list, Predicate<T> predicate) {
        return list.stream()
                .collect(Collectors.partitioningBy(predicate, Collectors.toList()));

    }

    public static <T> List<T> predicateGeneric(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();

        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }

        return result;
    }
}

