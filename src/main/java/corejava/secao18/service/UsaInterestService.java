package corejava.secao18.service;

public class UsaInterestService implements InterestService {
    private Double interestRate;

    public UsaInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    public UsaInterestService() {
    }

    @Override
    public Double getInterestRate() {
        return interestRate;
    }


}
