package corejava.secao19.test;

import corejava.secao19.domain.Product;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {
        Map<Product, Double> stock = new HashMap<>();
        Product pr1 = new Product("TV", 900.0);
        Product pr2 = new Product("NOTEBOOK", 2000.0);
        Product pr3 = new Product("PC", 2300.0);

        stock.put(pr1, 1000.0);
        stock.put(pr2, 500.0);
        stock.put(pr3, 3000.0);

        Product pr4 = new Product("TV", 900.0);


        System.out.println("Contains product: " + stock.containsKey(pr4));
    }
}
