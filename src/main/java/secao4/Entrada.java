package secao4;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Rafaela";
        int idade = 20;
        double altura = 1.65;

        System.out.printf("Name %s%n", name);
        System.out.printf("Idade %d%n", idade);
        System.out.printf("Altura %.2f%n", altura);

        System.out.println("Digite seu sexo:");
        String escolha = scanner.nextLine();

        System.out.printf("Seu sexo: %s%n",escolha);



    }
}
