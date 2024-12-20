package corejava.secao14.domain;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public BusinessAccount() {
        super();
    }

    public void loan(Double amount) {
        if (amount >= this.loanLimit) {
            balance += amount - 10.0;
        }
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
        this.balance -= 2;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
