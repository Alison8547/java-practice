package secao14.domain;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public ImportedProduct() {
        super();
    }

    @Override
    public String priceTag() {
        return String.format("%s $ %.2f (Customs Fee: $ %.2f)", name, totalPrice(), customsFee);
    }

    public Double totalPrice() {
        return price + customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
}
