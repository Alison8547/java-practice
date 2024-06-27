package secao20.test;

import secao20.domain.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeStreamExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerDouble = new Scanner(System.in);

        System.out.println("Enter path file: ");
        String path = scanner.nextLine();

        System.out.println("Enter salary: ");
        Double salary = scannerDouble.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            List<Employee> employees = new ArrayList<>();
            while (line != null) {
                String[] lines = line.split(",");
                String name = lines[0];
                String email = lines[1];
                Double price = Double.parseDouble(lines[2]);
                employees.add(new Employee(name, email, price));
                line = br.readLine();
            }

            List<String> emails = employees.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted()
                    .toList();

            double sum = employees.stream()
                    .filter(e -> e.getName().charAt(0) == 'M')
                    .mapToDouble(Employee::getSalary)
                    .sum();

            System.out.printf("Email of people whose salary is more than %.2f%n", salary);
            for (String email : emails) {
                System.out.println(email);
            }
            System.out.printf("Sum of salary of people whose starts with 'M': %.2f%n", sum);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
