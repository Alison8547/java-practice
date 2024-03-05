package secao8.test;

import secao8.domain.Product;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Entre com o produto:");
        product.setName(scanner.nextLine());
        product.setPrice(scanner.nextDouble());
        product.setQuantity(scanner.nextInt());

        System.out.printf("Produto -> %s, R$ %.2f, %d, Total: R$ %.2f%n", product.getName(), product.getPrice(), product.getQuantity(), product.totalValueInStock());
        System.out.println("Entre com um numero pra adicionar no stock:");
        product.addProducts(scanner.nextInt());
        System.out.printf("Produto update -> %s, R$ %.2f, %d, Total: R$ %.2f%n", product.getName(), product.getPrice(), product.getQuantity(), product.totalValueInStock());
        System.out.println("Entre com um numero pra remover no stock:");
        product.removeProducts(scanner.nextInt());
        System.out.printf("Produto update -> %s, R$ %.2f, %d, Total: R$ %.2f%n", product.getName(), product.getPrice(), product.getQuantity(), product.totalValueInStock());


    }
}
