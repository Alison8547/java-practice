package secao18.domain;

import secao18.service.TaxService;

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
