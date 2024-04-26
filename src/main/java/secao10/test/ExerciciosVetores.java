package secao10.test;

import java.util.Scanner;

public class ExerciciosVetores {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner scannerDouble = new Scanner(System.in);
    private static final Scanner scannerInt = new Scanner(System.in);

    public static void main(String[] args) {
        ex8();
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

    public static void ex4() {
        System.out.println("Quantos números voce vai digitar ?");
        int n = scannerInt.nextInt();
        int[] numeros = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scannerInt.nextInt();
        }

        System.out.println("NUMEROS PARES");
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                count++;
            }
        }
        System.out.println();

        System.out.println("QUANTIDADES DE PARES = " + count);


    }

    public static void ex5() {
        System.out.println("Quantos números voce vai digitar ?");
        int n = scannerInt.nextInt();
        double[] numeros = new double[n];
        int posicao = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scannerDouble.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if (numeros[i] > maxValue) {
                maxValue = (int) numeros[i];
                posicao = i;
            }
        }

        System.out.println("MAIOR VALOR = " + (double) maxValue);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
    }

    public static void ex6() {
        System.out.println("Quantos valores vai ter cada vetor ?");
        int n = scannerInt.nextInt();
        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorSum = new int[n];

        System.out.println("Digite os valores do vetor A");
        for (int i = 0; i < n; i++) {
            vetorA[i] = scannerInt.nextInt();
        }

        System.out.println("Digite os valores do vetor B");
        for (int i = 0; i < n; i++) {
            vetorB[i] = scannerInt.nextInt();
        }

        for (int i = 0; i < n; i++) {
            vetorSum[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("VETOR RESULTANTE:");
        for (int number : vetorSum) {
            System.out.println(number);
        }

    }

    public static void ex7() {
        System.out.println("Quantos elementos vai ter o vetor ?");
        int n = scannerInt.nextInt();
        double[] vetor = new double[n];
        double media = 0.0;
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = scannerDouble.nextDouble();
            sum += vetor[i];
        }
        media = sum / n;
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i < n; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }
    }

    public static void ex8() {
        System.out.println("Quantos elementos vai ter o vetor ?");
        int n = scannerInt.nextInt();
        int[] vetor = new int[n];
        double sum = 0.0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = scannerInt.nextInt();

            if (vetor[i] % 2 == 0) {
                sum += vetor[i];
                count++;
            }


        }

        if (count > 0) {
            System.out.printf("MEDIA DOS PARES = %.1f%n", sum / count);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

    }
}
