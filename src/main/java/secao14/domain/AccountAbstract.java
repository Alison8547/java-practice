package secao14.domain;

public abstract class AccountAbstract {
    private Integer number;
    private String holder;
    protected Double balance;

    public AccountAbstract(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public AccountAbstract() {
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) {
        this.balance -= amount;
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
