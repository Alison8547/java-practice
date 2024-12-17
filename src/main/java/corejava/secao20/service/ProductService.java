package corejava.secao20.service;

import corejava.secao19.domain.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filterSum(List<Product> products, Predicate<Product> criteria) {
        double sum = 0.0;

        for (Product product : products) {
            if (criteria.test(product)) {
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
