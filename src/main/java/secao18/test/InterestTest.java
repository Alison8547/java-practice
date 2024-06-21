package secao18.test;

import secao18.service.BrazilInterestService;
import secao18.service.InterestService;

import java.util.Scanner;

public class InterestTest {
    private static final Scanner scannerInt = new Scanner(System.in);
    private static final Scanner scannerDouble = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Amount: ");
        Double amount = scannerDouble.nextDouble();
        System.out.println("Months: ");
        Integer months = scannerInt.nextInt();

        InterestService interestService = new BrazilInterestService(2.0);
        Double payment = interestService.payment(amount, months);

        System.out.println("Payment after " + months + " months: ");
        System.out.printf("%.2f%n", payment);
    }
}
