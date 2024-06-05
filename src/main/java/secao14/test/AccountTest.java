package secao14.test;

import secao14.domain.Account;
import secao14.domain.BusinessAccount;
import secao14.domain.SavingsAccount;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(12, "Alison", 2000.0);
        BusinessAccount businessAccount = new BusinessAccount(33, "Diego", 1200.0, 200.0);

        // Upcasting
        Account account2 = businessAccount;
        Account account3 = new BusinessAccount(322, "Maria", 3300.0, 200.0);
        Account account4 = new SavingsAccount(89, "Diego", 1200.0, 200.0);

        // Downcasting
        BusinessAccount businessAccount2 = (BusinessAccount) account3;
        businessAccount2.loan(12.0);
        // erro ClassCastException pq ela o account4 não é do tipo ->  BusinessAccount businessAccount3 = (BusinessAccount) account4;

        if (account4 instanceof BusinessAccount) {
            BusinessAccount businessAccount3 = (BusinessAccount) account4;
            businessAccount3.loan(40.0);
            System.out.println("Loan!");
        }


        if (account4 instanceof SavingsAccount) {
            SavingsAccount savingsAccount3 = (SavingsAccount) account4;
            savingsAccount3.updateBalance();
            System.out.println("Update!");
        }


    }
}
