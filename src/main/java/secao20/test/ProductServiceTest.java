package secao20.test;

import secao19.domain.Product;
import secao20.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceTest {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 800.0));
        list.add(new Product("Iphone", 3200.0));
        list.add(new Product("PC", 4000.0));
        list.add(new Product("Alicate", 20.0));
        list.add(new Product("TABLET", 500.0));

        ProductService service = new ProductService();

        double sum = service.filterSum(list, p -> p.getName().charAt(0) == 'T');

        System.out.printf("Sum of products: %.2f%n", sum);
    }
}
