package secao18.domain;

public class BrazilTaxService implements TaxService {
    @Override
    public Double tax(Double amount) {
        if (amount <= 100) {
            return amount * 0.02;
        } else {
            return amount * 0.15;
        }
    }
}
