package secao8.test;

import secao8.domain.Triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Digite os lados do triangulo x");
        x.setA(scanner.nextDouble());
        x.setB(scanner.nextDouble());
        x.setC(scanner.nextDouble());

        System.out.println("Digite os lados do triangulo y");
        y.setA(scanner.nextDouble());
        y.setB(scanner.nextDouble());
        y.setC(scanner.nextDouble());


        System.out.printf("Area x: %.4f%n", Triangle.calcularAreaTriangulo(x));
        System.out.printf("Area y: %.4f%n", Triangle.calcularAreaTriangulo(y));


        if (Triangle.calcularAreaTriangulo(x) > Triangle.calcularAreaTriangulo(y)) {
            System.out.println("Area do triangulo x maior que area do triangulo y");
        } else {
            System.out.println("Area do triangulo y maior que area do triangulo x");
        }


    }
}
