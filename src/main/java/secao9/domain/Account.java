package secao9.domain;

public class Account {
    private String name;
    private Integer numberAccount;
    private Double balance = 0.0;

    public Account(String name, Integer numberAccount, Double balance) {
        this.name = name;
        this.numberAccount = numberAccount;
        this.balance = balance;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return String.format("Account data:%nAccount %d, Holder: %s, Balance: $ %.2f%n", this.numberAccount, this.name, this.balance);
    }


    public void updateAccount() {
        System.out.printf("Account update:%nAccount %d, Holder: %s, Balance: $ %.2f%n", this.numberAccount, this.name, this.balance);
    }

    public void deposit(Double deposit) {
        this.balance += deposit;
    }

    public void withdraw(Double withdraw) {
        if (withdraw > this.balance) {
            throw new RuntimeException("Withdrawal larger than money in your account!");
        }
        this.balance -= withdraw + 5.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(Integer numberAccount) {
        this.numberAccount = numberAccount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
