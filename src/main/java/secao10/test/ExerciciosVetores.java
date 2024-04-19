package secao10.test;

import java.util.Scanner;

public class ExerciciosVetores {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner scannerDouble = new Scanner(System.in);
    private static final Scanner scannerInt = new Scanner(System.in);

    public static void main(String[] args) {
        ex3();
    }

    public static void ex1() {
        System.out.println("Quantos números voce vai digitar ?");
        int n = scanner.nextInt();

        int[] numeros = new int[n];


        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();

        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }


    }

    public static void ex2() {
        System.out.println("Quantos números voce vai digitar ?");
        int n = scanner.nextInt();
        double soma = 0;

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scanner.nextDouble();

        }

        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            soma += numeros[i];

        }
        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f%n", soma / n);
    }

    public static void ex3() {
        System.out.println("Quantos números voce vai digitar ?");
        int n = scannerInt.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        int count = 0;
        double sum = 0;
        double countMenorIdade = 0;

        for (int i = 0; i < n; i++) {
            count++;
            System.out.printf("Dados da %da pessoa:%n", count);
            nomes[i] = scanner.nextLine();
            idades[i] = scannerInt.nextInt();
            alturas[i] = scannerDouble.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            sum += alturas[i];
            if (idades[i] < 16) {
                countMenorIdade++;
            }
        }

        System.out.printf("Altura média %.2f%n", sum / n);
        System.out.println("Pessoas com menos de 16 anos: " + (countMenorIdade / n) * 100 + "%");

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }


    }
}
