package secao8.test;

import secao8.domain.CurrencyConverter;

import java.util.Scanner;

public class CurrencyConverterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the dollar price ?");
        double priceDolar = scanner.nextDouble();
        System.out.println("How many dollars will be bought ?");
        double payment = scanner.nextDouble();

        System.out.printf("Amount to be paid in reais = R$ %.2f%n", CurrencyConverter.converter(priceDolar, payment));
    }
}
