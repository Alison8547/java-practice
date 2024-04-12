package secao10.test;

import secao10.domain.Product;

import java.util.Scanner;

public class Vetores2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double media = 0.0;

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            products[i] = new Product();
            scanner.next();
            products[i].setName(scanner.nextLine());
            products[i].setPrice(scanner.nextDouble());

        }

        for (int i = 0; i < n; i++) {
            media += products[i].getPrice();
        }

        System.out.println(media / n);


    }
}
