package secao18.service;

public class BrazilInterestService implements InterestService {

    private Double interestRate;

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    public BrazilInterestService() {
    }

    @Override
    public Double getInterestRate() {
        return interestRate;
    }

}
