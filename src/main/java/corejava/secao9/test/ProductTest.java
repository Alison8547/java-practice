package corejava.secao9.test;

import corejava.secao8.domain.Product;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o produto:");
        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        int quantity = scanner.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println(product);
        System.out.println("Entre com um numero pra adicionar no stock:");
        product.addProducts(scanner.nextInt());
        System.out.println(product);
        System.out.println("Entre com um numero pra remover no stock:");
        product.removeProducts(scanner.nextInt());
        System.out.println(product);


    }
}
