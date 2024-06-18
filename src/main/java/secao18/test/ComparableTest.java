package secao18.test;

import secao18.domain.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {

        String path = "C:\\Users\\Alison\\Downloads\\test.txt";
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String csv = br.readLine();

            while (csv != null) {
                String[] csvLines = csv.split(",");
                employees.add(new Employee(csvLines[0], Double.parseDouble(csvLines[1])));
                csv = br.readLine();

            }

            Collections.sort(employees);
            for (Employee employee : employees) {
                System.out.println(employee);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
