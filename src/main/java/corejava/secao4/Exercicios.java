package corejava.secao4;

import java.util.Scanner;

public class Exercicios {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ex6();
    }

    public static void ex1() {
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.printf("SOMA = %d%n", number1 + number2);
    }

    public static void ex2() {
        double raio = scanner.nextDouble();
        double area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", area);
    }

    public static void ex3() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int diferenca = (a * b - c * d);

        System.out.printf("DIFERENCA = %d%n", diferenca);
    }

    public static void ex4() {
        int numberFuncionario = scanner.nextInt();
        double horasTrabalhadas = scanner.nextDouble();
        double valuePorHora = scanner.nextDouble();

        double result = horasTrabalhadas * valuePorHora;

        System.out.printf("Number = %d%n", numberFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", result);
    }

    public static void ex5() {
        double result = 0;

        int[] codido = new int[2];
        int[] quantidade = new int[2];
        double[] valor = new double[2];

        for (int i = 0; i < 2; i++) {
            codido[i] = scanner.nextInt();
            quantidade[i] = scanner.nextInt();
            valor[i] = scanner.nextDouble();

            result += valor[i] * quantidade[i];


        }

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", result);
    }

    public static void ex6() {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n", (c * a / 2));
        System.out.printf("CIRCULO: %.3f%n", (3.14159 * Math.pow(c, 2)));
        System.out.printf("TRAPEZIO: %.3f%n", ((a + b) * c / 2));
        System.out.printf("QUADRADO: %.3f%n", (b * b));
        System.out.printf("RETANGULO: %.3f%n", (b * a));

    }
}
