package secao8.test;

import secao8.domain.Employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        employee.setName(scanner.nextLine());
        employee.setSalary(scanner.nextDouble());
        employee.setTax(scanner.nextDouble());

        System.out.println(employee);
        System.out.println("Qual porcentagem para aumento de salário?");
        employee.increaseSalary(scanner.nextDouble());

        System.out.println(employee);
    }
}
