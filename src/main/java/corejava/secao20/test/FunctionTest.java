package corejava.secao20.test;

import corejava.secao19.domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 6.0));
        list.add(new Product("Iphone", 3200.0));
        list.add(new Product("PC", 4000.0));
        list.add(new Product("Alicate", 20.0));

//        List<String> names = list.stream()
//                .map(new UpperCaseName())
//                .toList();

        List<String> names1 = list.stream()
                .map(Product::upperCaseStaticFunction)
                .toList();

        System.out.println(names1);

        System.out.println("-----");

        Function<Product, String> function = p -> p.getName().toUpperCase();

        List<String> names2 = list.stream()
                .map(function)
                .toList();

        System.out.println(names2);

        System.out.println("-----");

        list.stream()
                .map(p -> p.getName().toUpperCase())
                .forEach(System.out::println);


    }
}
