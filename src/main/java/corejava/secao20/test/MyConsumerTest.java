package corejava.secao20.test;

import corejava.secao19.domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MyConsumerTest {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 6.0));
        list.add(new Product("Iphone", 3200.0));
        list.add(new Product("PC", 4000.0));
        list.add(new Product("Alicate", 20.0));

        //  list.forEach(new MyConsumer());

        double tax = 1.1;

        Consumer<Product> consumer = product -> product.setPrice(product.getPrice() * tax);


        list.forEach(consumer);
        list.forEach(System.out::println);
    }
}
