package corejava.secao18.service;

public interface InterestService {

    Double getInterestRate();

    default Double payment(Double amount, Integer months) {
        if (months < 1) {
            throw new IllegalArgumentException("Months must be greater than 0");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}
