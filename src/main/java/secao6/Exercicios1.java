package secao6;

import java.util.Scanner;

public class Exercicios1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ex3();
    }

    public static void ex1() {
        int passwordValid = 2002;
        int passwordInput = scanner.nextInt();

        while (passwordInput != passwordValid) {
            System.out.println("Senha Invalida");
            passwordInput = scanner.nextInt();
        }

        System.out.println("Acesso Permitido");

    }

    public static void ex2() {
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");

            } else {
                System.out.println("quarto");
            }

            x = scanner.nextInt();
            y = scanner.nextInt();
        }
    }

    public static void ex3() {
        int codigo = scanner.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (codigo != 4) {
            if (codigo == 1) {
                alcool++;
            } else if (codigo == 2) {
                gasolina++;
            } else if (codigo == 3) {
                diesel++;
            }
            codigo = scanner.nextInt();

        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d%n", diesel);
    }
}
