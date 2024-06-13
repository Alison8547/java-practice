package secao14.test;

import secao14.domain.LegalPerson;
import secao14.domain.Person;
import secao14.domain.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonTest {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner scannerDouble = new Scanner(System.in);
    private static final Scanner scannerInt = new Scanner(System.in);

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        System.out.println("Enter the number of tax payers: ");
        int numberOfTaxPayers = scannerInt.nextInt();

        for (int i = 1; i <= numberOfTaxPayers; i++) {
            System.out.println("Tax payer #" + i + " data:");

            System.out.println("Individual or company (i/c)? ");
            String individualOrCompany = scanner.nextLine().toLowerCase();
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Anual income:");
            Double anualIncome = scannerDouble.nextDouble();

            if (individualOrCompany.charAt(0) == 'i') {
                System.out.println("Helth expenditures: ");
                Double helthExpenditures = scannerDouble.nextDouble();
                personList.add(new PhysicalPerson(name, anualIncome, helthExpenditures));

            } else if (individualOrCompany.charAt(0) == 'c') {
                System.out.println("Number of employees: ");
                Integer numberOfEmployees = scannerInt.nextInt();
                personList.add(new LegalPerson(name, anualIncome, numberOfEmployees));
            }
        }

        double totalTaxPayers = 0;

        for (Person person : personList) {
            System.out.printf("%s: $ %.2f%n", person.getName(), person.calculateTax());
            totalTaxPayers += person.calculateTax();
        }

        System.out.printf("TOTAL TAXES: $ %.2f", totalTaxPayers);
    }
}
