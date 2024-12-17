package corejava.secao8.test;

import java.util.Scanner;

public class StaticProgramm {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o radius:");
        double radius = scanner.nextDouble();
        double c = circumference(radius);

        System.out.printf("Circumference: %.2f%n", c);

    }

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }
}
