package secao14.test;

import secao14.domain.AccountAbstract;
import secao14.domain.BusinessAccountAbstract;
import secao14.domain.SavingsAccountAbstract;

import java.util.ArrayList;
import java.util.List;

public class AccountAbstractTest {
    public static void main(String[] args) {
        List<AccountAbstract> acc = new ArrayList<>();

        acc.add(new BusinessAccountAbstract(23, "Paulo", 2000.00, 200.00));
        acc.add(new BusinessAccountAbstract(13, "José", 1000.00, 200.00));
        acc.add(new SavingsAccountAbstract(44, "Maria", 1500.00, 200.00));

        double sum = 0;
        for (AccountAbstract a : acc) {
            sum += a.getBalance();
        }
        System.out.printf("Total balance: %.2f\n", sum);

        for (AccountAbstract a : acc) {
            a.deposit(12.0);
        }

        for (AccountAbstract a : acc) {
            System.out.printf("Update balance: %.2f\n", a.getBalance());
        }
    }
}
