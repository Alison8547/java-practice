package secao19.domain;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    @Override
    public int compareTo(Product o) {
        return price.compareTo(o.getPrice());
    }

    @Override
    public String toString() {
        return String.format("%s,%.2f%n", name, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static boolean myPredicateStatic(Product p) {
        return p.getPrice() >= 100.0;
    }

    public boolean myPredicateNoStatic() {
        return price >= 100.0;
    }

    public static String upperCaseStaticFunction(Product p) {
        return p.getName().toUpperCase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
