package secao14.test;

import secao14.domain.Account;
import secao14.domain.BusinessAccount;
import secao14.domain.SavingsAccount;

public class AccountTest2 {
    public static void main(String[] args) {
        Account account = new Account(12, "Alison", 2000.0);
        account.withdraw(200.0);
        System.out.println(account.getBalance());

        Account account2 = new SavingsAccount(33, "Maria", 2000.0, 2.0);
        account2.withdraw(200.0);
        System.out.println(account2.getBalance());

        Account account3 = new BusinessAccount(2, "Maicon", 2000.0, 3.0);
        account3.withdraw(200.0);
        System.out.println(account3.getBalance());
    }
}
