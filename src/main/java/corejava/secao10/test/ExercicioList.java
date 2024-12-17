package corejava.secao10.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

public class ExercicioList {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner scannerDouble = new Scanner(System.in);
    private static final Scanner scannerInt = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many employees will be registered ?");
        int n = scannerInt.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Emplyoee #" + (i + 1));
            System.out.println("Id: ");
            int id = scannerInt.nextInt();
            System.out.println("Name: ");
            String name = scanner.next();
            System.out.println("Salary: ");
            double salary = scannerDouble.nextDouble();

            employees.add(new Employee(id, name, salary));

        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int id = scannerInt.nextInt();
        Optional<Employee> employeeOptional = employees.stream().filter(x -> x.getId() == id).findFirst();

        if (employeeOptional.isPresent()) {
            System.out.println("Enter the percentage: ");
            double percentage = scannerDouble.nextDouble();
            double increase = employeeOptional.get().getSalary() * percentage / 100;
            employeeOptional.get().setSalary(employeeOptional.get().getSalary() + increase);
        } else {
            System.out.println("This id does not exist!");
            System.out.println();
        }

        System.out.println("List of employees: ");
        System.out.println(employees);

    }
}
