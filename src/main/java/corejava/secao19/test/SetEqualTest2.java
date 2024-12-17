package corejava.secao19.test;

import corejava.secao19.domain.Product;

import java.util.Set;
import java.util.TreeSet;

public class SetEqualTest2 {
    public static void main(String[] args) {
        Set<Product> set = new TreeSet<>();
        set.add(new Product("TV", 1200.0));
        set.add(new Product("PC", 4000.0));
        set.add(new Product("Iphone", 3200.0));

        for (Product p : set) {
            System.out.println(p);
        }
    }
}
