package corejava.secao20.util;

import corejava.secao19.domain.Product;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
