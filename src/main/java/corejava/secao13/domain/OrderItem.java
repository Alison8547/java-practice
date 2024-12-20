package corejava.secao13.domain;

public class OrderItem {
    private Integer quantity;
    private Product product;

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;

        this.product = product;
    }

    public OrderItem() {
    }

    public Double subTotal() {
        return product.getPrice() * quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
