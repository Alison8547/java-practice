package secao8.test;

import secao8.domain.Student;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        student.setName(scanner.nextLine());
        student.setNotaFirst(scanner.nextDouble());
        student.setNotaSecond(scanner.nextDouble());
        student.setNotaThree(scanner.nextDouble());

        student.pass();
    }
}
