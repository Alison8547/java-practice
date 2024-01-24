package secao5;

import java.util.Scanner;

public class Condicoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Numero menor que 0");
        } else {
            System.out.println("Numero maior que 0");
        }


        scanner.nextLine();

       String escolha = scanner.nextLine().toUpperCase();
        switch (escolha){
            case "M" -> {
                System.out.println("Masculino");
            }
            case "F" -> {
                System.out.println("Feminino");
            }
            default -> {
                System.out.println("Valor invalido!");
            }
        }
    }
}
