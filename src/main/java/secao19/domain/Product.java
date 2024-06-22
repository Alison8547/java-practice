package secao19.domain;

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
}