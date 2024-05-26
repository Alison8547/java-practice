package secao13.test;

import secao13.domain.Derpatment;
import secao13.domain.HourContract;
import secao13.domain.Worker;
import secao13.enums.WokerLever;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WorkerTest {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner scannerDouble = new Scanner(System.in);
    private static final Scanner scannerInt = new Scanner(System.in);

    public static void main(String[] args) {
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter department`s name: ");
        String department = scanner.nextLine();
        System.out.println("Enter worker data: ");
        System.out.println("name: ");
        String name = scanner.nextLine();
        System.out.println("Level: ");
        String level = scanner.nextLine();
        System.out.println("Base salary: ");
        Double baseSalary = scannerDouble.nextDouble();
        System.out.println("How many contracts to this worker? ");
        int x = scannerInt.nextInt();
        Worker worker = new Worker(name, WokerLever.valueOf(level), baseSalary, new Derpatment(department));

        for (int i = 1; i <= x; i++) {
            System.out.println("Enter contract #" + i + " data");
            System.out.println("Date (DD/MM/YYYY): ");
            LocalDate localDate = LocalDate.parse(scanner.nextLine(), dtf1);
            System.out.println("Value per hours: ");
            Double valuePerHours = scannerDouble.nextDouble();
            System.out.println("Duration (hours): ");
            Integer duration = scannerInt.nextInt();

            worker.addContract(new HourContract(localDate, valuePerHours, duration));
        }
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));

        Integer year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDerpatment().getName());
        System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));


    }
}
