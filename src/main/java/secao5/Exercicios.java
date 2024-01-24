package secao5;

import java.util.Scanner;

public class Exercicios {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ex6();
    }

    public static void ex1() {
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }
    }

    public static void ex2() {
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }

    public static void ex3() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }

    public static void ex4() {
        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();

        if (horaInicial == 0 && horaFinal == 0) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (horaInicial > horaFinal) {
            System.out.printf("O JOGO DUROU %d HORA(S)%n", ((24 - horaInicial) + horaFinal));
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)%n", (horaFinal - horaInicial));
        }
    }

    public static void ex5() {
        int escolha = scanner.nextInt();
        int quantidade = scanner.nextInt();

        switch (escolha) {
            case 1 -> {
                System.out.printf("Total: R$ %.2f%n", (4.00 * quantidade));
            }
            case 2 -> {
                System.out.printf("Total: R$ %.2f%n", (4.50 * quantidade));
            }
            case 3 -> {
                System.out.printf("Total: R$ %.2f%n", (5.00 * quantidade));
            }
            case 4 -> {
                System.out.printf("Total: R$ %.2f%n", (2.00 * quantidade));
            }
            case 5 -> {
                System.out.printf("Total: R$ %.2f%n", (1.50 * quantidade));
            }
        }
    }

    public static void ex6() {
        double number = scanner.nextDouble();

        if (number > 0 && number <= 25.00) {
            System.out.println("Intervalo [0,25]");
        } else if (number > 25.00 && number <= 50.00) {
            System.out.println("Intervalo (25,50]");
        } else if (number > 50.00 && number <= 100.00) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }

    public static void ex7() {

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

    }

    public static void ex8() {
        double salario = scanner.nextDouble();

        double imposto;

        if (salario <= 2000.0) {
            imposto = 0.0;
        } else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        } else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", imposto);
        }
    }
}
