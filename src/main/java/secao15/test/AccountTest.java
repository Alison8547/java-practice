package secao15.test;

import secao15.domain.Account;
import secao15.exceptions.AccountException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTest {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner scannerInt = new Scanner(System.in);
    private static final Scanner scannerDouble = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Enter account data: ");
            System.out.println("Number: ");
            Integer number = scannerInt.nextInt();
            System.out.println("Holder: ");
            String holder = scanner.nextLine();
            System.out.println("Initial balance: ");
            Double initialBalance = scannerDouble.nextDouble();
            System.out.println("Withdraw limit: ");
            Double withdrawLimit = scannerDouble.nextDouble();
            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println("Enter amount for withdraw: ");
            Double withdrawAmount = scannerDouble.nextDouble();
            account.withdraw(withdrawAmount);
            System.out.println(account);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
    }
}
