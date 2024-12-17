package corejava.secao20.test;

import corejava.secao19.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 6.0));
        list.add(new Product("Iphone", 3200.0));
        list.add(new Product("PC", 4000.0));
        list.add(new Product("Alicate", 20.0));

        //  list.sort(new MyComparator());

//        Comparator<Product> comp = (p1, p2) -> p1.getPrice().compareTo(p2.getPrice());
//        list.sort(comp);

        list.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
