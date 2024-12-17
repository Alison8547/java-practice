package corejava.secao20.test;

import corejava.secao19.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class MyPredicateTest {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 6.0));
        list.add(new Product("Iphone", 3200.0));
        list.add(new Product("PC", 4000.0));
        list.add(new Product("Alicate", 20.0));

        //   list.removeIf(new MyPredicate());

        //    Predicate<Product> predicate = p -> p.getPrice() >= 100.0;
        //list.removeIf(predicate);

        // list.removeIf(Product::myPredicateNoStatic);
        list.removeIf(Product::myPredicateStatic);


        for (Product p : list) {
            System.out.println(p);
        }
    }
}
