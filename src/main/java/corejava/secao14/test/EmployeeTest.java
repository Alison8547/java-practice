package corejava.secao14.test;

import corejava.secao14.domain.Employee;
import corejava.secao14.domain.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner scannerDouble = new Scanner(System.in);
    private static final Scanner scannerInt = new Scanner(System.in);

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        System.out.println("Enter the number of employees: ");
        int numberOfEmployees = scannerInt.nextInt();

        for (int i = 1; i <= numberOfEmployees; i++) {

            System.out.println("Employee #" + i + " data:");

            System.out.println("Outsourced (y/n)? ");
            String response = scanner.nextLine();
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Hours: ");
            Integer hours = scannerInt.nextInt();
            System.out.println("Value per hour: ");
            Double valuePerHour = scannerDouble.nextDouble();
            if (response.charAt(0) == 'y') {
                System.out.println("Additional charge: ");
                Double additionalCharge = scannerDouble.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));

            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }

        }
        System.out.println("PAYMENTS: ");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - $ " + employee.payment());
        }

    }
}
