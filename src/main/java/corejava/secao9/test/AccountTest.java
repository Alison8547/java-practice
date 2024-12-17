package corejava.secao9.test;

import corejava.secao9.domain.Account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        Account account = new Account();

        System.out.println("Enter account number:");
        account.setNumberAccount(scanner.nextInt());
        System.out.println("Enter account holder:");
        account.setName(scannerString.nextLine());
        System.out.println("Is there na initial deposit (y/n) ?");
        String escolha = scannerString.nextLine().toLowerCase();

        if (escolha.equals("y")) {
            System.out.println("Enter initial deposit value:");
            account.deposit(scanner.nextDouble());

        }

        System.out.println(account);
        System.out.println();

        System.out.println("Enter a deposit value:");
        account.deposit(scanner.nextDouble());
        account.updateAccount();
        System.out.println();

        System.out.println("Enter a withdraw value:");
        account.withdraw(scanner.nextDouble());
        account.updateAccount();


    }
}
