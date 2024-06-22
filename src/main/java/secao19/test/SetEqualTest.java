package secao19.test;

import secao19.domain.Product;

import java.util.HashSet;
import java.util.Set;

public class SetEqualTest {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();
        set.add(new Product("TV", 1200.0));
        set.add(new Product("Iphone", 3200.0));
        set.add(new Product("PC", 4000.0));

        Product p1 = new Product("TV", 1200.0);

        System.out.println(set.contains(p1));
    }
}
