package corejava.secao6;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int number = scanner.nextInt();
        while (number != 0) {
            soma += number;
            number = scanner.nextInt();
        }

        System.out.printf("Soma: %d%n", soma);
    }
}
