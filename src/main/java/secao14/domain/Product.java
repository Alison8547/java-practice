package secao14.domain;

public class Product {
    protected String name;
    protected Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String priceTag() {
        return String.format("%s $ %.2f", name, price);
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
