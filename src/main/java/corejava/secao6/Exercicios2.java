package corejava.secao6;

import java.util.Scanner;

public class Exercicios2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ex7();
    }

    public static void ex1() {
        int x = scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public static void ex2() {
        int n = scanner.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number >= 10 && number <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.printf("%d in%n", in);
        System.out.printf("%d out%n", out);
    }

    public static void ex3() {
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            double number1 = scanner.nextDouble();
            double number2 = scanner.nextDouble();
            double number3 = scanner.nextDouble();

            double media = ((number1 * 2.0) + (number2 * 3.0) + (number3 * 5.0)) / 10.0;

            System.out.printf("%.1f%n", media);
        }
    }

    public static void ex4() {
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            double number1 = scanner.nextInt();
            double number2 = scanner.nextInt();

            if (number2 == 0) {
                System.out.println("Divisao impossivel");
            }

            System.out.printf("%.1f%n", number1 / number2);
        }
    }

    public static void ex5() {
        int fatorial = 1;
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }

    public static void ex6() {
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void ex7() {
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d %d %d%n", i, i * i, i * i * i);
        }
    }
}
